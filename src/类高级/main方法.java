package 类高级;

public class main方法 {
    public static void main(String[] args) {
     /*
     * main方法是java虚拟机（jdk）调用的，所以是public
     *
     * static:我们没有必要创建这个main方法对象，直接类名点就可以调用
     *
     * args:是我们在执行程序的时候给它传进去的 就是java 类名+ 字符串 运行class文件时传进去的
     * */
        System.out.println(args.length);

    }
}
class StaticTemp {

    public static void GetStatic() {
    }
}
