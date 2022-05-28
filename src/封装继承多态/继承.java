package 封装继承多态;

public class 继承 {
    public static void main(String[] args) {
        Student student = new Student("小明",10,2,Sex.Man);
        /*
        * 1.子类必须调用父类的构造器，完成父类的初始化
        * 2.如果父类的构造器有多个，则子类需要super指定实现父类的哪一个构造器，否则编译会报错。
        * 3.super必须放在构造器的第一行
        * 4.子类最多只能继承一个父类
        *
        * 5.继承的本质:
        *  创建子类对象时，会先加载父类的信息
        * 如果子类和父类中有属性是同名的
        * 调用属性时会先找子类中的那个属性，然后再向父类中依次寻找
        *
        * 6.super的使用（必须使用在类体里面，而不是被创建的对象）
        * super可以访问父类的属性/构造器，不能访问私有属性
        * super. 的方式来访问父类的属性方法
        * this.  是先查找当前，找不到还会向上查，等价于不加this
        *
        * */
      A a = new A();
      System.out.println(a.age);
      a.GetFather();

      B b = new B();
      System.out.println(b.age);

      C c =new C();
        System.out.println(c.age);
    }
}
class C {
    int age;

    public C() {
        this.age = 100;
    }
    public void Say(String name) {
        System.out.println("我是C类" + name);
    }
    public void GetBase() {
        System.out.println("这是C类");
    }
}
class B extends C {
    int age;

    public B() {
       this.age = 50;
    }
    @Override
    public void Say(String name) {
        System.out.println("我是B类" + name);
    }
    @Override
    public void GetBase() {
        System.out.println("这是B类");
    }
}
class A extends B {
    int age;
    public A() {
       this.age = -1;
    }
    public void GetFather() {
        //访问父类的属性，就近原则
        System.out.println(super.age);
        //访问父类的方法
        super.Say("super");
    }
    @Override
    public void GetBase() {
        System.out.println("这是A类");
    }
}

enum Sex {
  Man,
  WoMan
}
class Student extends 封装继承多态.Person {
  private Sex sex;
    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public Student(String name, int age, int lever, Sex sex) {
        super(name, age, lever);//默认调用父类的无参构造器
        this.sex = sex;
    }
}