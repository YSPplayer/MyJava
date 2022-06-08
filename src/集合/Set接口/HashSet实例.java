package 集合.Set接口;

import Object教程.Tostring;

import java.util.HashSet;
import java.util.Objects;

public class HashSet实例 {
    public static void main(String[] args) {
        /*
        *需求：创建员工类，有名字、年龄属性，运用hashset存储，当有名字、年龄都
        * 相同的员工对象，则不去存储
        *
        * HashSet:先比较hash值，再比较equals方法
        * 如果hash不同或equals为false，则加不进去
        *
        * 所以我们的方法：给对象设置一个固定相同的Hash值
        *               给对象设置一个比较的equals方法
        *
        * */
        HashSet hashSet = new HashSet();
        hashSet.add(new Employee("小明",18));
        hashSet.add(new Employee("小张",18));
        hashSet.add(new Employee("小明",20));
        hashSet.add(new Employee("小华",22));
        hashSet.add(new Employee("小明",18));
        System.out.println(hashSet);
    }
}
class Employee {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;
        return this.age == ((Employee)obj).age
                && this.name == ((Employee)obj).name;
    }

    @Override
    public String toString() {
        return "姓名" + this.name + ":" + "年龄" + this.age;
    }

    @Override
    public int hashCode() {
        //这个地方就是返回name和age的哈希值，因为对象都是调用这个地址的引用，所以hash值是一样的
        return Objects.hash(name,age);
    }
}
