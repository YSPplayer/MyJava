package 类高级;

public class 类变量 {
    //就是静态变量-类变量
    /*
    * 常量池：常量池和堆在一块，当new一个String对象时，会同时在常量池和堆中存放这个对象
    * （常量池中有的话就不会再创建了），不new String的话是直接先在常量池中寻找是否有此对象，
    * 如果没有，则在常量池中new 一个此对象而不会在堆中new
    *
    * 堆：
    *
    * 静态内存分布：
    * 1.静态变量被所有对象共享
    * 2. jdk8 之前 静态变量放在方法区
    * 3. jdk8之后 当类进行加载时，会在堆里面生成对应类的Class类对象（反射），在该类的这个对应类的最后
    *
    * */
    public static void main(String[] args) {
      Children.age++;
      Children children = new Children();
      //不推荐这么用，直接类名点就可以了，这样做编译器最终也会改成上面那种形式，增加了编译器运行成本
      children.age++;
    }
}
class Children {
   private String name;
   //该静态变量会被所有该对象实例共享
   public static int age = 0;
}