package 内部类;

public class 局部内部类 {
    public static void main(String[] args) {
        /*
        * 定义在外部类的局部位置中，比如方法里，有类名
        *
        * */
    }
}
class LocalClass {//外部类
    private int n1;
    private void m2(String name) {};
    private void m1() {
    //局部内部类通常定义在方法中
        class InnerClass {//局部内部类
        /*
        * 1.可以访问外部类的所有成员包括私有的
        * 2.不能添加访问修饰符，但可用final修饰
        * 3.作用域：仅在定义的方法或者代码块中
        * 4.外部类在方法中可以创建内部类的对象实例，然后调用方法即可
        * 5.外部其他类不能直接访问局部内部类，因为它只相当于一个局部变量
        * 6.局部类和外部类的属性重名时，调用外部类方法：外部类名.this.属性名
        * */
            private int n1;
            private String name;
            private void doN1() {
                System.out.println("n1 =" + LocalClass.this.n1);
                m2(name);
            }
        }
    }
}
