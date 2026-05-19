package study;
import study.Study;
public class Test {
    public static void main(String[] args) {
       new Study() {

           @Override
           public void learn() {
               System.out.println(name +"在学习...");
           }
       }.learn();

       new Study() {
           @Override
           public void learn() {
               System.out.println(name + "在休息...");
           }
       }.learn();
       learnJava(new Study() {
	@Override
	public void learn(){
	System.out.println(name+"学习Java课程");
	}
       });
    }

static void learnJava(Study study) {
	study.learn();
}
}
