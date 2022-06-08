package 线程;

public class 线程插队练习 {
    public static void main(String[] args) throws InterruptedException {
        /*
        * 1.主线程每隔1s，输出hi，一共10次
        * 2.当输出到hi 5 时，启动一个子线程（实现Runnable），每隔1s输出Hello
        *   等该线程输出10次 hello后，退出
        *
        * 3.主线程继续输出hi，直到主线程退出
        *
        *
        *
        * */
        int times = 0;
        while(true) {
            times++;
            System.out.println("hi");
            Thread.sleep(1000);
            if(times == 5) {
                Tmep tmep = new Tmep();
                Thread thread = new Thread(tmep);
                thread.start();
                thread.join();//让这个线程先执行完，才执行下面的东西

            }
            if(times == 10) break;
        }
    }
}
class Tmep implements Runnable {


    @Override
    public void run() {
        int times = 0;
        while(true) {
            times++;
            System.out.println("hello");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(times==10) break;
        }
    }
}