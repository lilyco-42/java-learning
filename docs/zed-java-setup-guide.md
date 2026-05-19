# Zed 编辑器 Java 开发环境配置指南

> 适用平台：Windows / macOS / Linux  
> 最后更新：2026-05-19  
> 测试环境：Zed 1.2.6 + OpenJDK 21

---

## 目录

1. [前置准备](#1-前置准备)
2. [安装 Java 扩展](#2-安装-java-扩展)
3. [配置 settings.json](#3-配置-settingsjson)
4. [项目初始化与运行](#4-项目初始化与运行)
5. [调试 Java 程序](#5-调试-java-程序)
6. [运行测试](#6-运行测试)
7. [常见问题](#7-常见问题)

---

## 1. 前置准备

### 1.1 安装 JDK

Zed 本身不带 JDK，需要自行安装。推荐 OpenJDK 21（LTS）：

**Windows (Scoop)**

```bash
scoop install openjdk21
```

**macOS (Homebrew)**

```bash
brew install openjdk@21
```

**Linux (apt)**

```bash
sudo apt install openjdk-21-jdk
```

### 1.2 验证安装

```bash
java -version
# openjdk version "21.0.2" 2024-01-16

javac -version
# javac 21.0.2
```

### 1.3 确认 JAVA_HOME

```bash
echo $JAVA_HOME
# Windows: C:\Users\<name>\scoop\apps\openjdk21\current
# macOS:   /opt/homebrew/opt/openjdk@21
# Linux:   /usr/lib/jvm/java-21-openjdk-amd64
```

如果 `JAVA_HOME` 未设置，将路径记下来，下一步配置会用到。

---

## 2. 安装 Java 扩展

### 2.1 安装官方扩展

Zed 的 Java 支持通过扩展实现。打开 Zed，`Ctrl+Shift+P` 打开命令面板，输入：

```
zed: extensions
```

进入扩展面板，搜索 **Java**，安装名为 `java` 的官方扩展（作者：Java Extension Contributors）。

这个扩展包含：
- **语法高亮** — 基于 tree-sitter
- **JDTLS** — Eclipse Java 语言服务器（自动补全、跳转定义、重构等）
- **调试器** — Java Debug Server
- **Lombok** — 自动支持
- **内置 Task** — 运行 main / 测试类 / 全部测试

> 扩展首次安装后会自动下载 JDTLS 和调试器，需要一定时间，等待完成即可。

### 2.2 注意冲突

市场上还有一个 `java-eclipse-jdtls`（第三方），与官方扩展功能重叠。**只装官方的 `java` 即可**，两个同时装可能导致语言服务器冲突。

已装可以在扩展面板中卸载，或手动删除：

```bash
# Windows
rm -rf "$LOCALAPPDATA/Zed/extensions/installed/java-eclipse-jdtls"
rm -rf "$LOCALAPPDATA/Zed/extensions/work/java-eclipse-jdtls"

# macOS
rm -rf ~/Library/Application\ Support/Zed/extensions/installed/java-eclipse-jdtls
```

---

## 3. 配置 settings.json

打开 `Ctrl+Shift+P` > `zed: open settings`，添加以下配置：

```json
{
  "languages": {
    "Java": {
      "language_servers": ["jdtls"],
      "format_on_save": "on",
      "tab_size": 4,
      "hard_tabs": false
    }
  },
  "lsp": {
    "jdtls": {
      "initialization_options": {
        "settings": {
          "java": {
            "configuration": {
              "runtimes": [
                {
                  "name": "JavaSE-21",
                  "path": "<你的 JDK 路径>",
                  "default": true
                }
              ]
            },
            "completion": {
              "favoriteStaticMembers": [
                "org.junit.jupiter.api.Assertions.*",
                "org.mockito.Mockito.*"
              ],
              "importOrder": ["java", "javax", "com", "org"]
            },
            "sources": {
              "organizeImports": {
                "starThreshold": 5,
                "staticStarThreshold": 3
              }
            }
          }
        }
      }
    }
  }
}
```

### 关键配置说明

| 配置项 | 作用 |
|--------|------|
| `java.configuration.runtimes` | 指定 JDK 路径和版本，**必填** |
| `completion.favoriteStaticMembers` | 静态导入快捷补全（JUnit、Mockito 常用断言） |
| `completion.importOrder` | import 排序规则 |
| `sources.organizeImports.starThreshold` | 超过 5 个同类 import 才合并为 `*` |
| `languages.Java.format_on_save` | 保存时自动格式化 |

> `java.configuration.runtimes[].path` 替换为第 1 步记下的实际 JDK 路径。

---

## 4. 项目初始化与运行

Zed 的 Java 扩展能自动识别项目的构建工具。以下是三种项目类型的使用方式。

### 4.1 Maven 项目

创建 `pom.xml`：

```xml
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0
                             http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>
    <groupId>com.example</groupId>
    <artifactId>demo</artifactId>
    <version>1.0-SNAPSHOT</version>
    <properties>
        <maven.compiler.source>21</maven.compiler.source>
        <maven.compiler.target>21</maven.compiler.target>
    </properties>
</project>
```

创建 `src/main/java/com/example/App.java`：

```java
package com.example;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello from Zed!");
    }
}
```

打开 `App.java`，`Ctrl+Shift+P` > `task: spawn`，选择 **Run $ZED_CUSTOM_java_class_name**。

Zed 会自动检测到 `pom.xml`，执行 `mvn compile exec:java`。

### 4.2 Gradle 项目

创建 `build.gradle`：

```groovy
plugins {
    id 'application'
}

application {
    mainClass = 'com.example.App'
}
```

相同的 `App.java`，使用 `task: spawn` 运行即可。Zed 会自动走 `gradle run`。

### 4.3 纯 javac（无构建工具）

如果目录里既没有 `pom.xml` 也没有 `build.gradle`，Zed 会 fallback 到：

```bash
find . -name '*.java' -print0 | xargs -0 javac -d bin
java -cp bin <主类名>
```

适用于单文件快速实验。

---

## 5. 调试 Java 程序

Zed 内置了 Java 调试支持，无需额外安装。

### 5.1 设置断点

在行号左侧点击，出现红色圆点即为断点。

### 5.2 启动调试

1. `Ctrl+Shift+P` > `debug: start`
2. 或按 `F5`

调试面板会显示：
- 调用栈（Call Stack）
- 变量（Variables）
- 监视表达式（Watch）

### 5.3 调试快捷键

| 快捷键 | 操作 |
|--------|------|
| `F5` | 继续 |
| `F10` | 单步跳过 |
| `F11` | 单步进入 |
| `Shift+F11` | 单步退出 |

---

## 6. 运行测试

### 6.1 添加 JUnit 依赖

Maven（`pom.xml`）：

```xml
<dependency>
    <groupId>org.junit.jupiter</groupId>
    <artifactId>junit-jupiter</artifactId>
    <version>5.11.0</version>
    <scope>test</scope>
</dependency>
```

Gradle（`build.gradle`）：

```groovy
dependencies {
    testImplementation 'org.junit.jupiter:junit-jupiter:5.11.0'
}
```

### 6.2 编写测试

`src/test/java/com/example/AppTest.java`：

```java
package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    void basicTest() {
        assertTrue(true);
    }
}
```

### 6.3 执行测试

在测试文件中，`Ctrl+Shift+P` > `task: spawn`：

| Task | 作用 |
|------|------|
| `Test class $ZED_CUSTOM_java_class_name` | 运行当前测试类 |
| `$ZED_CUSTOM_java_class_name.$method` | 运行单个测试方法 |
| `Run tests` | 运行全部测试 |

---

## 7. 常见问题

### 7.1 代码补全不工作

JDTLS 首次加载需要索引整个项目，查看 Zed 底部状态栏的 JDTLS 图标是否还在加载。

如果持续不工作：

```bash
# 清理 JDTLS 缓存（Ctrl+Shift+P > task: spawn > Clear JDTLS cache）
# 或手动删除
rm -rf ~/.cache/jdtls-*
```

然后 `Ctrl+Shift+P` > `language server: restart` 重启 Java 语言服务器。

### 7.2 找不到 JDK

确认 `JAVA_HOME` 环境变量已设置，且在 `settings.json` 的 `java.configuration.runtimes[].path` 中填写了正确的路径。

验证命令：

```bash
echo $JAVA_HOME
$JAVA_HOME/bin/java -version
```

### 7.3 Maven/Gradle wrapper 未检测到

Zed 优先使用项目根目录的 `mvnw` / `gradlew` wrapper。如果只想用系统安装的，删除 wrapper 或在系统 PATH 中确保 `mvn` / `gradle` 可用。

### 7.4 Windows 上 task 执行失败

Zed 的内置 Java tasks 使用 `/bin/sh`，Windows 上需要 Git Bash 或 MSYS2 提供的 `sh`。确保 `sh` 在 PATH 中：

```bash
where sh
# 应该输出 Git Bash 的 sh.exe 路径
```

### 7.5 Lombok 注解报错

官方扩展已内置 Lombok 支持（`extensions/work/java/lombok/`），无需额外配置。如果注解仍然报红，重启语言服务器即可。

---

## 可选：Keybindings 推荐

在 `keybindings.json`（`Ctrl+Shift+P` > `zed: open keybindings`）中添加：

```json
[
  {
    "context": "Editor && language == \"java\"",
    "bindings": {
      "ctrl-shift-o": "editor::OrganizeImports",
      "ctrl-shift-f": "editor::Format"
    }
  }
]
```

---

## 小结

一套完整的 Zed Java 开发环境包含：

1. **JDK 21** — 运行时和编译器
2. **官方 `java` 扩展** — 语法、语言服务器、调试器
3. **`settings.json` 中的 JDK 路径** — 让 JDTLS 找到 JDK
4. **Maven 或 Gradle** — 构建工具（可选，Zed 也支持纯 javac）

配置完成后，Zed 提供与 IntelliJ IDEA / VS Code 同级别 Java 开发体验：智能补全、跳转定义、重构、断点调试、测试运行，且启动速度极快。
