package 异常处理;

public class 异常简介 {
    public static void main(String[] args) {
        /*
        * 异常2大类：
        * 一类：Error:虚拟机无法解决的严重错误：系统内部错误、栈溢出、内存不足
        *
        * 二类：Exception:空指针访问，网络连接中断。运行时异常和编译时异常
        *
        * 异常体系图（重要）ThrowAble类——
        *
        * 自定义异常：自己设计异常类，写异常信息
        * 写类继承自Exception，属于编译异常
        * 继承自RuntimeException，属于运行异常（一般来讲使用这个）
        *
        * */
    }
}
class MyException extends RuntimeException {
     public MyException(String message) {
         super(message);
     }
}
