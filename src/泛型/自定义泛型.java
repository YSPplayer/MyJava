package 泛型;

public class 自定义泛型 {
    public static void main(String[] args) {
    /*
    * ①：类属性可以使用泛型
    * ②：使用泛型的数组，不能初始化
    * ③：静态方法中不能用泛型，泛型是在创建对象时才指定的
    * <?>表示任意泛型类型
    * <? extend A>支持A类以及A类的子类，即只接收这种类型
    * <? super A>支持A类以及A类的父类
    * */
    }
}
//自定义泛型 有三个泛型参数，所以我们把Bird成为自定义泛型类
// T,R,M是泛型的标识符，一般是单个的大写字母
//普通成员也可以使用泛型（属性、方法）
//泛型数组不能初始化，因为对象还没有指定创建
//实现泛型接口，或者这里传入参数也可以
class Bird<T,R,M> implements IA{
    String name;
    T t;
    R r;
    M m;
    T[] ts;

    //自动替换方法中的参数类型
    @Override
    public void doWork(String s, Integer integer) {
        System.out.println("s" + integer.toString());
    }
    //这个不是泛型方法，这个是使用泛型的方法
    public void doSomething(T t,R r) {

    }
    //泛型方法，提供给该方法使用
    public<D> void doSomething(D d) {

    }
}
//接口中静态成员不能使用泛型
//接口中的属性成员都是静态的
//泛型接口中的泛型在继承/实现接口时实现的
interface IAnimal<T,R> {
     String name = "小明";
     void doWork(T t, R r);
}
//继承泛型接口，指定泛型类型
interface IA extends IAnimal<String,Integer> {

}
