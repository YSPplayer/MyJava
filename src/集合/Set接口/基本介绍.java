package 集合.Set接口;

import java.util.HashSet;
import java.util.Set;

public class 基本介绍 {
    public static void main(String[] args) {
        /*
        *1. 取出和添加的顺序不一样
        * 2.没有索引
        * 3.不允许有重复数据
        * */

        //不能存放一样的元素，存放是无序的，下次运行时也会保持原来的无序，而不会又变
        Set set = new HashSet();
        set.add(null);
        set.add("小明");
        set.add("小刚");
        set.add("haha");
        System.out.println(set);
    }
}
