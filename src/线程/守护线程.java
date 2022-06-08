package 线程;

public class 守护线程 {
    public static void main(String[] args) {
        //通常情况下，主线程结束后子线程还会在运行

        Thread thread = new Thread();
        //如果我们需要实现这个需求，只需将这个线程设置为守护线程即可
        thread.setDaemon(true);
        thread.start();
    }
}

