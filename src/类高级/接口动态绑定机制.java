package 类高级;

public class 接口动态绑定机制 {
    public static void main(String[] args) {
        //doWork可以接收实现了这个接口的所有实例
        Temp01A temp01A = new Temp01A();
        doWork(temp01A);

    }
    private static void doWork(Temp01 temp01) {
        temp01.myText();
        temp01.hi();
        //动态机制
        if(temp01 instanceof Temp01A) {
            ((Temp01A) temp01).bye();
        }
    }
}
