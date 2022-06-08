package 异常处理;

public class TryCatch {
    public static void main(String[] args) {
        int a = 90;
        int b = 0;
        try {
            int c = -1;
            c = a / b;
            System.out.println(c);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("当前程序发生错误，请检查！");
        } finally {
            System.out.println("finally语句：" + 999);
        }
        /*
        * 加不加finally的区别：当catch捕获不到系统异常时，finally语句也会被执行
        * 但在try之后的函数体语句块就不会被执行了，除此之外和外部语句没有区别
        *
        * 多个catch时，通常是子类异常在前面，父类异常在后面
        *
        * //通常将释放资源的代码写在finally中，保证它一定会关闭
        *try——finally也可用：应用场景：执行一段代码，不管是否发生异常，都必须执行某个业务逻辑
        *
        * finally比try中的异常优先执行
        *
        * */
        System.out.println("函数体最后语句" + 1000);
    }
}
