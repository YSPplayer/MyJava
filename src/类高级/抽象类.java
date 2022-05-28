package 类高级;

public class 抽象类 {
    public static void main(String[] args) {
        /*
        * 1.抽象类不能被实例化
        * 2.抽象类可以没有抽象方法
        * 3.抽象类可以有实现的方法
        * 4.抽象方法一定要是抽象类。但抽象类不一定要有抽象方法
        * 5.abstract只能修饰类和方法，不能修饰属性（属性不被继承）
        *
        * 6.抽象类还是类，所以包含类的所有范式，类有什么成员，抽象类都有
        * 7.
        * */
        Cat cat = new Cat();
        cat.eat2();//cat可以调用抽象类的方法，因为存在继承关系


    }
}
//既有继承又有实现就这么写
class Cat extends Animal implements Temp01 {
    @Override
    public void eat() {
        System.out.println("吃东西");
    }

    @Override
    public void hi() {

    }
}
 abstract class Animal {
    String name;

    //父类方法不确定性问题，将该方法设计成抽象方法
    public void eat2() {
        System.out.println("我不知道吃什么");
    }
    //抽象方法实现
    public abstract void eat();

}