package 类高级;

public class 继承复杂代码块 {
    public static void main(String[] args) {

        /*
        * 运行顺序：
        * 1.先父类的静态代码块和静态属性
        * 2.再子类的静态代码块和静态属性
        * （）中间还有一部，子类调用父类的super
        * 3.再父类的普通代码块和普通属性初始化
        * 4.再父类的构造方法
        * 5.再子类的普通代码块和普通属性初始化
        * 6.再子类的构造方法
        * */

    }
}
