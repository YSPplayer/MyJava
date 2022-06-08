package 泛型;

import java.util.ArrayList;
import java.util.List;

public class 泛型语法 {
    public static void main(String[] args) {
        /*
        * 1.泛型：一种表示数据类型的数据类型 E
        *
        * 2.泛型使用细节：
        *  ①给泛型指定的类型必须是引用类型，不能是基本数据类型
        *  ②在给泛型指定具体的类型后，可传入（接收）该类型或其子类类型，该类型是运行类型
        *  ③泛型后面可以简写，因为编译器会推断运行类型
        *  ④如果没有泛型指定具体类型，默认是Object
        *  ⑤泛型本身不具备继承性
        * */
        //1.指定集合只能添加Dog类的元素
        //2.在遍历的时候直接取除Dog类型而不是Object
        //Dog——>Dog——>Dog
        ArrayList<Dog> objects = new ArrayList<Dog>();

        //简写（推荐这种写法）
        ArrayList<Dog> objects2 = new ArrayList<>();

        objects.add(new Dog("汪汪",1));
        objects.add(new Dog("小汪",2));
        for (Dog dog : objects) {
            System.out.println(dog);
        }
    }
}
//这个E是在创建对象时就会被调用的，在编译期间就知道了E是什么类型
class Dog<E> {
    String name;
    int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
