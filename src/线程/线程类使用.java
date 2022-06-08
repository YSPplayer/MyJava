package 线程;

public class 线程类使用 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.start();//启动线程，调用start时会调用run方法
        //如果这里调用的是run，就是执行一个简单的方法，而不是调用线程
        //run时开启了一个进程，进程开启了一个线程main方法，main方法中再开一个线程Cat

        Thread thread =new Thread(cat);
        thread.start();

    }
}
//实现Runnable接口时，没有start方法，创建Thread对象，然后丢进去，调用start方法
class Cat extends Thread implements Runnable {

    //继承了Thread类，该类就是一个线程
    @Override
    public void run() {//重写run方法
        int times = 0;
        while (true) {
            super.run();
            System.out.println("我是小猫");
            try {
                Thread.sleep(1000);        //让线程休眠1秒
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(times ==80) {
                break;//80时退出线程
            }
        }
    }
}

