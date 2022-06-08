package 集合.Set接口;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSet接口 {
    public static void main(String[] args) {
        /*
        * 1.可以排序
        * 2.底层是TreeMap
        *
        * */

        //按照添加元素字符串大小排序
        //使用TreeSet的构造器，匿名内部类
        TreeSet treeSet = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String)o1).compareTo((String)o2);
            }
        });
    }
}
