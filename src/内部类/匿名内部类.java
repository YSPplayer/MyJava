package 内部类;
//重要！！！！！！！！！！！！
public class 匿名内部类 {
    public static void main(String[] args) {
    /*
    * 1.本质是类
    * 2.本质是内部类
    * 3.它没有名字（系统会取一个名字，我们看不到）
    * 4.同时它还是一个对象
    *
    *
    * */
        MyPublicClass myPublicClass = new MyPublicClass();
        myPublicClass.doMain();
        myPublicClass.doMain_2();
    }
}
class MyPublicClass {
    public void doMain() {//方法
        /*
        * 1.基于接口的匿名内部类
        *
        * 需求:使用接口
        *       传统写法：写一个类，实现这个接口，并创建对象
        *       写法问题：我们这个MyTempClass只是使用一次，以后再也不使用。所以这样写就浪费
        *
        * 2.解决方案：使用匿名内部类简化开发
        *
        * 3.temp 编译类型：ClassInterface
        *        运行类型：匿名内部类
        *       底层源码：
        *       class XXXX implements ClassInterface {
        *        @Override
                  public void cry() {
                   System.out.println("他在笑");
                  }
        *    }
        * 底层名称就是：外部类名称+$1
        *
        * 4.创建类之后就直接new了一下，就创建了一个对象
        *
        * 5.匿名内部类使用一次就没有了，对象还在
        * */
        //传统写法
      /*  MyTempClass myTempClass = new MyTempClass();
        myTempClass.cry();*/

        //ClassInterface temp = new ClassInterface()
        ClassInterface temp = new ClassInterface() {
            @Override
            public void cry() {
                System.out.println("他在笑");
            }
        };
        temp.cry();
    }

    //基于类的匿名内部类
    public void doMain_2() {
        /*
        * 编译类型：MyTempClass
        * 运行类型：匿名内部类
        * 可以看成是一个父类new了一个子类的对象
        *
        * */
        MyTempClass myTempClass = new MyTempClass() {
            private int n1 = 100;
            @Override
            public void cry() {
                System.out.println("匿名内部类在笑" + n1);
            }

            public void run() {
                System.out.println("我正在跑");
            }

        };
        System.out.println("myTempClass的运行类型 =" + myTempClass.getClass());
        myTempClass.cry();
        //这里不能这样调用run方法，因为编译类型识别不了，需要强制转换
        //myTempClass.run();
    }

}
class MyTempClass implements ClassInterface {
    @Override
    public void cry() {
        System.out.println("他在笑");
    }

}
interface ClassInterface {
    void cry();
}
