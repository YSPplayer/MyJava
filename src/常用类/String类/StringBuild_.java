package 常用类.String类;

public class StringBuild_ {
    public static void main(String[] args) {
        /*
        * 1.该类涉及多线程的问题（单线程的情况优先使用此类）
        * 2.该类被设计用作StringBuffer的简易替换
        * 3.StringBuild的方面，没有互斥的处理，没有sy的处理，一般推荐单线程使用
        *
        * 4.结论：如果我们要对String字符做大量修改，就不要用String
        *        如果字符串很少修改，被多个对象引用，使用String
        * */


    }
}
