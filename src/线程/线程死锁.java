package 线程;

public class 线程死锁 {
    public static void main(String[] args) {
        /*
        *  多个线程占用了对方的锁资源，但不肯相让，导致了死锁
        *  在一个代码块里不要同时抢2个对象锁
        *
        * */
        

        /*
        * 释放锁： 1.同步代码块执行完毕
        *        2.在同步方法中遇到break/return;
        *        3.同步方法中出现错误退出
        *        4.执行了线程的wait()方法，线程暂停，释放锁
        *
        * 下面的操作不会释放锁：1.sleep()/yield()方法，暂停当前线程的运行
        * */


    }
}

