package 异常处理;

import jdk.nashorn.internal.runtime.ECMAException;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Throws {
    public static void main(String[] args) {
        /*
        * Throws可以抛出多个异常
        *Throws关键字后也可以是异常列表
        *
        * 子类重写方法所抛出的异常，要么和父类所抛出异常一致，要么是父类抛出异常的子类
        *
        * Throws和Throw区别：Throws是处理方式，在方法后面，是异常的类型
        * Throw：手动生成异常关键字，是异常的对象
        * */

    }

    //主动抛出Exception异常，让调用Do方法的调用者处理
    public static void Do() throws Exception {
        FileInputStream fileInputStream = new FileInputStream("D://aa.txt");
    }
    public static void Do2() throws FileNotFoundException,NullPointerException {
        FileInputStream fileInputStream = new FileInputStream("D://aa.txt");
        throw new RuntimeException("测试异常");
    }
}
