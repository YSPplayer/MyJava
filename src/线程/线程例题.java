package 线程;

public class 线程例题 {
    public static void main(String[] args) {
        //两人取款，每次取1000，不能出现超取现象
        Temp12 tmep = new Temp12();
        Thread thread = new Thread(tmep);
        Thread thread2 = new Thread(tmep);
        thread.start();
        thread2.start();


    }
}
class Temp12 implements Runnable{

    public static int money = 10000;
    //this对象锁是非公平锁
    @Override
    public synchronized void run() {
            while (true) {
                if (money <= 0) {
                    System.out.println("当前不能再被提取！");
                    break;
                }
                money -= 1000;
                System.out.println("当前余额为" + money);
            }

    }
}