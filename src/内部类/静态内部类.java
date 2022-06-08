package 内部类;

public class 静态内部类 {
    public static void main(String[] args) {
        //因为是静态内部类，这样写是可以的，前提满足访问权限
        //注意：java中的静态类是可以有非静态方法的，且外部类不能被声明为静态类，和C#有区别
        MyTempB.MyTempC myTempC = new MyTempB.MyTempC();
        int a = MyTempB.MyTempC.Id;
    }
}
 class MyTempB {
 public String name;
 
 public static int A;
 //MyTempC就是静态内部类，放在外部类的成员位置，使用static修饰
 static class MyTempC {
   public static int Id;

   public void say() {
       //静态类中只能访问外部类的静态成员
       System.out.println(A);
   }
 }
}
