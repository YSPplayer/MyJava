package 集合.Set接口;

public class LinkedHashSet {
    public static void main(String[] args) {
        /*
        * 1.LinkedHashSet是HashSet的子类,LinkedHashSet底层是LinkedHashMap,底层是数组+双向链表
        * 数组是HashMap$Node[] 存放的元素数据是LinkedHashMap$Entry类型，实现了HashMap$Node类
        * 继承关系在内部类完成
        * 2.元素的顺序是以插入的顺序保存的，而非乱序，但其在存储中仍是乱序，只链接是有序的，遍历的是next的连接
        * 3.LinkedHashSet不允许添加重复元素
        *
        * 4.第一次添加，扩容16
        * */

    }
}
