package 集合.Set接口;

import java.util.HashSet;

public class HashSet_ {
    public static void main(String[] args) {
        /*
        * HashSet底层是HashMap，HashMap底层是数组+链表+红黑树
        * 这样存储的优势是效率很高，因为如果把一个数据本身存进去的话会很大，取除的效率也低
        *
        * 0.HashSet的存储是无序的
        * 1.HashSet第一次添加时扩容16，扩容的临界值是16*0.75=12（不是到了16才扩容）
        * 2.扩容到16*2，临界值是32*0.75=24
        * 3.如果一条链表的元素>=8，且table表的大小>=64，会进化成红黑树添加机制，否则使用常规的数组扩容机制
        *
        * */
        HashSet hashSet = new HashSet();
        hashSet.add(new Dog("汪汪"));
        hashSet.add(new Dog("汪汪"));//这个属于2个不同的东西，都可以加进去

        hashSet.add(new String("汪汪"));
        hashSet.add(new String("汪汪"));//这个不能加进去
        String res = hashSet.toString();
        System.out.println(res);
    }
}
class Dog {
    String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
