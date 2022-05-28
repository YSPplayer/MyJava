package 类高级;

public class 代码块 {
    public static void main(String[] args) {
         //就是只有方法体的方法
        //是加载类时，或创建对象时隐式地调用
        //相当于是另外一种构造器，做初始化操作
        Movie movie = new Movie("小明");
        int age =Movie.age;
        //下面代码块的那段也会被调用
        //代码块调用顺序优先于构造器

    }
}
class TempA {
    //这个是在一个类当中的执行顺序
    //静态属性初始化 和下面执行的顺序优先级同级，所以是按定义顺序执行
    //先搞静态的，再搞非静态的代码块
    private static int n1 = getN1();
    private static int getN1() {
        System.out.println("n1被调用");
        return 100;
    }
   static {//静态代码块初始化
       System.out.println("静态代码块被调用");
    }
    public TempA() {
        //构造器的前面其实隐含调用了super和代码块，先super，再代码块
    }
}
class Movie {
    public static int age;
    String name;
    int level;
    //这段会在new时被调用
    {
        System.out.println("电影打开了");
    }

    //如果加了static，随着类加载而执行，并且只执行一次
    /*
    * 类加载情况：1.创建对象
    *          2.创建子类对象，父类也被加载
    *          3.使用类的静态成员时，也会被加载
    *       这个只会被调用1次
    * */
   static{
       System.out.println("哈哈");
    }

    public Movie(String name, int level) {
        this.name = name;
        this.level = level;
    }

    public Movie(String name) {
        System.out.println("构造器打开了");
        this.name = name;
    }
}
