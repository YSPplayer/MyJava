package Object教程;

public class Equals {
    /*
    * 1.== 是比较运算符，既可以判断基本类型，又可以判断引用类型
    * 2.Equals本质上也用到了==符号，只是封装了一个方法
    * //基本数据类型判断的都是值是否相等
    *
    * */
    public static void main(String[] args) {
        //==
        A a = new A();
        A b = a;
        A c = b;
        B b2 = a;
        System.out.println(a == b); //true 因为存的是地址引用
        System.out.println(b == c); //true
        System.out.println(b2 == a); //true 继承类同理
        String str = new String("小明");
        String str2 =new String("小明");

        //equals 只能运用于引用类型
        System.out.println(a.equals(b));//默认判断的是地址是否相等，子类中会重写这个方法，String就会判断内容是否相同
        System.out.println(str == str2); //false 如果不new的话，是true，因为放在池子里
        System.out.println(str.equals(str2));//true，不比较引用地址，比较的是字符串本身


    }
}
class A extends B {
    String name ;
    int age ;
    int level ;
    //自定义一个equals方法，判断类A的属性是否都相同
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof A) {
            A a = (A)obj;
            if(this.name.equals(a) && this.age == a.age
                    && this.level == a.level )
                return true;
        }
        return false;
    }
}
class B {

}
class C {

}