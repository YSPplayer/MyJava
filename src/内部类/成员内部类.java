package 内部类;

public class 成员内部类 {
    public static void main(String[] args) {
        /*
        *1.定义在外部类的成员位置，没有static修饰
        * 2.作用域只在类体中，在外面new时要加上外部类的类名
        * 3.成员内部类可以用修饰符
        * */
        MyTemp01 myTemp01 = new MyTemp01();
        myTemp01.test();
        //内部类只有用对象实例才能new出来，可以理解成这个类是作为成员变量存储的
        MyTemp01.MyTemp02 temp02 = myTemp01.new  MyTemp02();

    }
}
class MyTemp01 {
    String name;
    int age;

    //成员内部类
   public class  MyTemp02 {
        public void say() {

        }
    }
    public void test() {
        MyTemp02 myTemp02 = new MyTemp02();
        myTemp02.say();

    }
}
