package 线程;

public class 线程同步 {
    public static void main(String[] args) {
        //线程同步，当几个线程同时运行行，必须等待一个线程运行完之后，才执行后面的线程的操作
        Tmep00 tmep00 = new Tmep00();
        Tmep00 tmep01 = new Tmep00();
        Tmep00 tmep02 = new Tmep00();
        Thread thread = new Thread(tmep00);//如果这里用temp01的对象来开的话，是不一样的，因为不是方法区
        Thread thread2 = new Thread(tmep00);
        Thread thread3 = new Thread(tmep00);
        thread.start();
        thread2.start();
        thread3.start();

        //线程同步原理
        //通过对象的锁来实现，互斥锁

        //同步的局限性：影响程序的效率，导致效率降低
        //非静态方法的锁是对象，而静态方法的锁是类本身

    }
}
class Tmep00 implements Runnable {

    public static int times = 0;
    public static int times2 = 0;

    public static  void work3() {
        synchronized (Tmep00.class) {//静态方法的锁就是类本身
            System.out.println(++times2);
        }
    }
    //在代码块上加锁
    public void work2() {
        synchronized (this /*tmep01*/) {//互斥锁，这个锁可以是当前对象，也可以是另外其他的对象
            while (true) {

                System.out.println(++times2);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (times2 >= 10) {
                    times2 = 1;
                    System.out.println("线程结束啦");
                    break;
                }
            }
        }

    }
     public synchronized void work() {//这里使用同步方法，在同一时刻，只能有一个线程来操作run方法
        //一个线程把这个事情做完了之后，后续的线程才会接上
         while (true) {
             System.out.println(++times);
             try {
                 Thread.sleep(1000);
             } catch (InterruptedException e) {
                 e.printStackTrace();
             }
             if(times>=10) {
                 times = 1;
                 System.out.println("线程结束啦");
                 break;
             }
         }
     }
    @Override
    public void run() {
        work();
        //work2();
    }
}