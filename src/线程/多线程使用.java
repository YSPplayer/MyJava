package 线程;

import javax.management.relation.RelationNotFoundException;

public class 多线程使用 {
    public static void main(String[] args) throws InterruptedException {
        T1 t1 = new T1();
        T1 t2 = new T1();
        Thread thread = new Thread(t1);//线程一
        Thread thread2 = new Thread(t2);//线程二
        thread.start();
        thread2.start();

        Thread.sleep(10*1000);
        System.out.println("主线程的信息");

        /*
         线程终止：1.线程运行完毕
                 2.使用变量，在主线程中调用变量来控制子线程run方法的运行

        * */

    }
}
class T1 implements Runnable {
    int times = 0;

    @Override
    public void run() {
        while (true) {
            //每隔一秒输出hi
            System.out.println("hello world" + (++times));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (times == 15) break;
        }
    }
}
