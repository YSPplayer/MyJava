package 集合.Map接口;

import Object教程.Tostring;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Map遍历 {
    public static void main(String[] args) {
        /*
        * 例：使用HashMap添加3个员工对象，要求
        *   Key键:员工Id
        *   Value值：员工对象
        *
        * 并遍历显示工资>18000的员工（遍历的方式至少两种）
        * 员工类：姓名、工资、员工id
        *
        * */
        HashMap hashMap = new HashMap();
        Student student1 = new Student("小明",1,20000);
        Student student2 = new Student("小刚",2,14000);
        Student student3 = new Student("小华",3,19000);

        hashMap.put(student1.getId(),student1);
        hashMap.put(student2.getId(),student2);
        hashMap.put(student3.getId(),student3);

        Set set = hashMap.keySet();
        //方法一：使用增强for循环/foreach循环
        for (Object obj : set)//这里不能直接hashMap，要转换一下，转换已实现Iterable接口的类，Set接口继承自Collection集合类
        {
            Object key = hashMap.get(obj);
            if(((Student)key).getMoney() >= 18000)
            System.out.println(key);
    }
        //方法二：使用Iterable接口
        Set set2 = hashMap.keySet();//这里不能直接hashMap，要转换一下
        Iterator ite = set2.iterator();
        while (ite.hasNext()) {
            Object key = hashMap.get(ite.next());
            if(((Student)key).getMoney() >= 18000)
            System.out.println(key);
        }

    }
}
class Student {
   private String name;
   private int Id;
   private int Money;

    public String getName() {
        return name;
    }

    public int getId() {
        return Id;
    }

    public int getMoney() {
        return Money;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        Id = id;
    }

    public void setMoney(int money) {
        Money = money;
    }

    public Student(String name, int id, int money) {
        this.name = name;
        Id = id;
        Money = money;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", Id=" + Id +
                ", Money=" + Money +
                '}';
    }
}
