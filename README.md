# Java 语言学习指南 🚀

> 综合整理：Java 优缺点、学习路线、实战项目  
> 编辑器：[Zed](https://zed.dev) — 轻量级高性能编辑器，[配置指南见此](./docs/zed-java-setup-guide.md)

---

## 目录

- [一、Java 语言优劣分析](#一java-语言优劣分析)
- [二、2025 权威学习路线](#二2025-权威学习路线)
- [三、克隆到本地的练习仓库](#三克隆到本地的练习仓库)
- [四、Minecraft Mod 制作教程](#四minecraft-mod-制作教程)
- [五、推荐资源汇总](#五推荐资源汇总)

---

## 一、Java 语言优劣分析

### ✅ 优点

| 优势 | 说明 |
|------|------|
| **跨平台（JVM）** | "一次编写，到处运行"，Windows/Linux/macOS 无缝运行 |
| **企业级生态** | Spring 全家桶、Hibernate、MyBatis、Maven/Gradle 等成熟框架 |
| **稳定性** | 向后兼容出色，银行/电信等核心系统首选 |
| **持续演进** | JDK 21 虚拟线程、FFM API（替代 JNI）、值类型（开发中） |
| **安全性** | 无显式指针，内置安全机制，金融领域信赖 |
| **社区 & 就业** | 国内 90% 银行、80% 电商、70% 政务平台使用 Java |
| **AI 融合** | Spring AI 框架推进，Java 在 AI 工程化落地中有独特位置 |

### ❌ 缺点

| 劣势 | 说明 |
|------|------|
| **语法冗长** | 样板代码多（Records 和 Lambda 正在改善） |
| **启动慢/内存高** | JVM 启动 ~500ms-3s，内存 100-500MB，云原生劣势明显 |
| **性能瓶颈** | 逊于 C++/Rust，GC 在极端场景可能有压力 |
| **学习曲线陡峭** | JVM 调优 + Spring 全家桶 + 分布式中间件，入门易精通难 |
| **Oracle 许可成本** | 88% 用户考虑从 Oracle JDK 迁移到 OpenJDK |
| **新兴领域被超越** | AI→Python, 云原生→Go, Android→Kotlin, 系统编程→Rust |
| **版本升级慢** | 大量企业停滞在 JDK 8/11，新特性普及缓慢 |

### 🎯 2025 定位总结

| 领域 | 评价 |
|------|------|
| 企业级后端 | ⭐⭐⭐⭐⭐ 仍是首选 |
| 金融/银行系统 | ⭐⭐⭐⭐⭐ 不可替代 |
| 云原生微服务 | ⭐⭐⭐☆ GraalVM + Loom 正在追赶 |
| AI 开发 | ⭐⭐⭐ 工程化部署强，训练不如 Python |
| Android 开发 | ⭐⭐⭐ Kotlin 已成主流 |
| 学习入门 | ⭐⭐⭐ 系统化但不如 Python 友好 |

---

## 二、2025 权威学习路线

### 📅 阶段一：Java 基础（1-2 个月）

```
环境：JDK 21 (LTS) + Zed + Git
目标：掌握 Java 语法、面向对象、集合、IO、异常
```

- `var` 类型推断、文本块、密封类（Java 17+）
- Stream API、Lambda 表达式、方法引用
- 面向对象：封装、继承、多态、抽象类、接口

**实战：** 学生管理系统、ATM 取款机系统

---

### 📅 阶段二：进阶核心（2-3 个月）

```
重点：多线程并发 + JVM 调优 + 网络编程
```

| 模块 | 内容 |
|------|------|
| **多线程** | 虚拟线程（Project Loom）、线程池、Lock |
| **JVM** | ZGC、JMC、VisualVM、堆转储分析 |
| **网络** | Socket、Netty 框架 |
| **算法** | LeetCode 热题 100 |

```java
// 虚拟线程示例 (Java 21+)
try (var executor = Executors.newVirtualThreadPerTaskExecutor()) {
    IntStream.range(0, 10000).forEach(i ->
        executor.submit(() -> System.out.println(Thread.currentThread().getName())));
}
```

---

### 📅 阶段三：框架与工具（2-3 个月）

```
构建：Gradle（推荐）/ Maven
框架：Spring Boot 3.3+ → Spring Cloud 2025 → MyBatis-Plus
安全：Spring Security + JWT + OAuth2
```

---

### 📅 阶段四：数据库与缓存

| 类型 | 技术 | 重点 |
|------|------|------|
| 关系型 | MySQL 8.2 / PostgreSQL | 窗口函数、CTE |
| 缓存 | Redis 8 | RedisJSON、RedisSearch |
| 文档 | MongoDB 7 | 聚合管道、分片 |

---

### 📅 阶段五：微服务 & 云原生

```
注册中心：Nacos / Consul
网关：Spring Cloud Gateway
分布式事务：Seata
限流熔断：Sentinel
消息队列：RabbitMQ / RocketMQ / Kafka
容器化：Docker + Kubernetes + Helm
可观测：Prometheus + Grafana + OpenTelemetry
```

---

### 📅 阶段六：项目实战

| 项目 | 技术栈 |
|------|--------|
| 电商系统 | Spring Boot 3 + Spring Cloud + MySQL + Redis + K8s |
| 苍穹外卖 | Spring Boot + MyBatis + Redis + WebSocket |
| AI 应用 | Spring Boot + OpenAI API + JWT |

---

## 三、克隆到本地的练习仓库

当前目录已克隆以下 5 个仓库供你直接使用：

| # | 仓库 | 说明 | 适用阶段 |
|---|------|------|----------|
| [📁](./01-Java-Exercises-Basics) | **01-Java-Exercises-Basics** | 经典基础练习，Level 1-3 递进，含 OOP | 基础→进阶 |
| [📁](./02-Java-CodeKatas) | **02-Java-CodeKatas** | 单元测试驱动的 Code Kata，含 Lambda、Stream | 进阶 |
| [📁](./03-Java-Learning-Path) | **03-Java-Learning-Path** | 42 天系统化学习路线，有手写示例 | 基础→进阶 |
| [📁](./04-Java-Project-Labs) | **04-Java-Project-Labs** | 29 个实战项目（CRUD/Spring/MyBatis） | 框架实战 |
| [📁](./05-Java-OOP-Projects) | **05-Java-OOP-Projects** | OOP 设计项目（继承、抽象类、算法） | OOP 巩固 |

### 推荐刷题顺序

```
初学者 → 01-Java-Exercises-Basics（Level 1 → 2 → 3）
       → 05-Java-OOP-Projects（OOP 巩固）
       → 03-Java-Learning-Path（系统学习）
       → 02-Java-CodeKatas（Lambda/Stream 进阶）
       → 04-Java-Project-Labs（框架实战）
```

---

## 四、Minecraft Mod 制作教程

> 用 Java 做 Minecraft Mod 是最有趣的学习动力之一！本教程以 **Fabric** 为主（轻量、更新快、中文文档好）。

### 🎮 模组加载器选择

| 加载器 | 特点 | 适合场景 |
|--------|------|----------|
| **Fabric** ⭐推荐 | 轻量、更新快、贴近原版 | 性能优化 Mod、快速适配新版、入门首选 |
| **Forge** | 生态庞大、功能丰富 | 大型 Mod、复杂 ModPack |
| **NeoForge** | Forge 的现代分支 | 想要 Forge 生态但更现代的 API |

### 🛠️ 开发环境搭建

```
JDK 17+ + Zed + Git + Gradle
```

**快速开始（Fabric）：**

```bash
# 1. 克隆官方示例模组
git clone https://github.com/FabricMC/fabric-example-mod.git
cd fabric-example-mod

# 2. 修改 gradle.properties 设置 Minecraft 版本
#    minecraft_version=1.21.4
#    loader_version=>=0.16

# 3. 反编译 Minecraft 源码（供 IDE 引用）
./gradlew genSources

# 4. 启动 Minecraft 测试
./gradlew runClient

# 5. 构建发布 jar
./gradlew build   # 输出在 build/libs/
```

### 📂 模组项目结构

```
my-mod/
├── src/main/java/com/example/
│   └── MyMod.java          # 主类，实现 ModInitializer
├── src/main/resources/
│   ├── fabric.mod.json     # 模组元信息（id, name, version, entrypoints）
│   ├── assets/my-mod/
│   │   ├── textures/       # 贴图 .png
│   │   ├── models/         # 模型 .json
│   │   └── lang/           # 本地化 .json
│   └── data/               # 数据包（配方、战利品表等）
├── build.gradle
└── gradle.properties
```

### 📝 第一个 Mod：自定义物品

```java
public class MyMod implements ModInitializer {
    public static final String MOD_ID = "my-mod";

    // 注册一个自定义物品
    public static final Item CUSTOM_ITEM = Registry.register(
        Registries.ITEM,
        new Identifier(MOD_ID, "custom_item"),
        new Item(new Item.Settings())
    );

    @Override
    public void onInitialize() {
        System.out.println("Hello Minecraft! My mod is loaded.");
    }
}
```

对应的 `fabric.mod.json`：

```json
{
  "schemaVersion": 1,
  "id": "my-mod",
  "version": "1.0.0",
  "name": "My First Mod",
  "entrypoints": {
    "main": ["com.example.MyMod"]
  }
}
```

### 📖 学习资源和教程

| 资源 | 链接 | 说明 |
|------|------|------|
| **Fabric Wiki 中文** | https://wiki.fabricmc.net/zh_cn:tutorial:start | 官方中文教程，从方块物品到世界生成 |
| **Fabric Wiki 英文** | https://wiki.fabricmc.net/tutorial:start | 更新更及时，内容更全 |
| **Kaupenjoe 教程** | https://github.com/Tutorials-By-Kaupenjoe | YouTube + GitHub，Fabric/Forge/NeoForge 全系列 |
| **Fabric 示例模组** | https://github.com/FabricMC/fabric-example-mod | 官方模板，开箱即用 |

### 🗺️ 推荐学习路线

```
1. Java 基础扎实（面向对象、泛型、Lambda）
2. 搭建 Fabric 开发环境 → 跑通官方示例
3. 学做第一个物品 + 方块
4. 添加合成配方、战利品表
5. 自定义 Creative Tab
6. 方块实体 + GUI
7. 世界生成（矿物、特征）
8. 自定义实体
9. 网络包与数据同步
10. 发布到 Modrinth / CurseForge
```

---

## 五、推荐资源汇总

### 📚 书单

| 书名 | 推荐理由 |
|------|----------|
| 《Java 核心技术卷Ⅰ》 | 基础入门必备 |
| 《Effective Java》 | 最佳实践圣经 |
| 《深入理解 Java 虚拟机》 | JVM 调优必读 |

### 🌐 在线平台

- **刷题：** LeetCode / 牛客网
- **视频：** 尚硅谷（B 站）、黑马程序员
- **文档：** Oracle 官方 Java 文档、阿里巴巴 Java 开发手册

### 🔗 参考来源

- [Aliyun - Java 学习路线与最佳实践](https://developer.aliyun.com/article/1679182)
- [腾讯云 - 2025 Java 学习路线图](https://cloud.tencent.cn/developer/article/2530424)
- [GitHub - Java Developer Roadmap 2025](https://github.com/MDSalmanChohan/Java_Developer_Roadmap)
- [LabEx - Java 编程实践项目](https://github.com/labex-labs/practice-java-programming-projects)
- [BNYMellon CodeKatas](https://github.com/BNYMellon/CodeKatas)

---

> **最后建议：** 坚持每天写代码，光看不练假把式。从目录中的 `01-Java-Exercises-Basics` 开始，按推荐顺序逐个仓库攻克吧！💪
