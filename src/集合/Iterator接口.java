package 集合;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Iterator接口 {
    public static void main(String[] args) {
        /*
         * 遍历  Collection接口 实现—— Iterator（迭代器接口）
         * Iterator对象成为迭代器，用于遍历集合中的元素——底层是数据结构和算法
         * */

        Collection arrayList = new ArrayList();
        arrayList.add(new Book("三国",100,"小明"));
        arrayList.add(new Book("怪兽",50,"小刚"));
        arrayList.add(new Book("自然",150,"小华"));
        //迭代器
        Iterator ie = arrayList.iterator();
        //ie.hasNext() 判断下面还有没有元素
        while (ie.hasNext()) {
            //通过next方法获取，返回Object数据类型
            Object next = ie.next();
            //这里根据动态绑定机制，会调用运行类型的toString方法，这里的next是Book
            System.out.println(next);
        }

        System.out.println(arrayList);

        /*
        * java的foreach循环
        *增强for，就是简化版的iterator迭代器
        *
        * 底层仍然是迭代器
        * */
        for(Object book : arrayList) {
            System.out.println(book);
        }

    }
}
class Book {
   private String name;
   private int money;
   private String author;

    public String getName() {
        return name;
    }

    public int getMoney() {
        return money;
    }

    public String getAuthor() {
        return author;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Book(String name, int money, String author) {
        this.name = name;
        this.money = money;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", money=" + money +
                ", author='" + author + '\'' +
                '}';
    }
}