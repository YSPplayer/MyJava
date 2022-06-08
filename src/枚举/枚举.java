package 枚举;

public class 枚举 {
    /*
    * 枚举是一种特殊的类，是常量的集合
    * */
    public static void main(String[] args) {
       int a = Myenum.Father.age;//这个还是有 new的操作
        Myenum.Monther.age = 10 ;
        System.out.println(a);
        Myenum.Father.doSome();

        MyNewEnum boy = MyNewEnum.BOY;
    }
}
enum MyNewEnum {//这里就是调用这个枚举类的无参构造器
    //本质上是静态的存储
    BOY,
    GIRL;
}
//enum默认继承自Enum类，也是最终类
enum Myenum{
    //1.使用关键字enum 替代class，这里的常量就是对象
    //这个定义的常量对象要写在最前面
    //如果用无参构造器创造常量对象，则可以省略小括号
    Father("小明",10,10000.0),
    Son("小张",9,5000.0),
    Monther;

    String name;
    int age;
    double money;

    Myenum() {

    }
     Myenum(String name, int age, double money) {
        this.name = name;
        this.age = age;
        this.money = money;
    }
    public void doSome() {

    }
}