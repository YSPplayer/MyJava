package 类高级;
/*
* 访问权限：默认：是包访问权限，在同一个包下都可以访问
*         private：只能访问自身
*         protected：在同一个包中或不同包的子类中
*   public > protected > 默认 > private
 * */
public class 接口 {
    public static void main(String[] args) {
        /*
        *1.接口就是没有实现的方法，封装到一起，到某个类要使用的时候，再根据情况写出来
        * jdk7之前接口所有方法都没有方法体
        * jdk8之后接口可以有自己方法体的实现（这里和C#不同），需要用default来修饰
        *
        * 2.接口中可以写属性+方法
        *
        * 3.接口不能被实例化
        *
        * 4.接口的方法继承者必须全部实现
        *
        * 5.一个类可以实现多个接口
        *
        * 6.接口只能继承接口，不能继承类(这个时候接口是被继承而不是实现，即用extends)
        *
        * 7.实现接口机制可以看成是对单继承机制的补充
        *
        * 8.接口在一定程度上实现代码的解耦（就是让代码写地更活而不是写死）【接口规范性+动态绑定】
        *
        * */
        Temp01A temp01A = new Temp01A();
        temp01A.cry();

    }
}
interface Temp03 {
    void cry();
}
interface Temp02 extends Temp03{
    void cry();
}
interface Temp01 {
    //接口中的变量只可以是常量 public static final int
    int n1 = 10;
    //java中的接口可以加访问修饰符(加了也多余可省略)，C#不写，默认Public

    //这里的全称是public abstract void
     void hi();

     //default就是默认的意思
     default void myText() {
         System.out.println("接口中可用default实现方法");
     }
     static void myText2() {
        System.out.println("接口中可用static实现方法");
    }
}
//implements 实现接口（抽象类可以不实现抽象方法）
class Temp01A implements Temp01,Temp02,Temp03 {
    @Override
    public void hi() {
        System.out.println("hi");
    }
    public void bye() {
        System.out.println("再见");
    }

    @Override
    public void cry() {
        System.out.println("我实现了2个同样的方法");
    }
}

