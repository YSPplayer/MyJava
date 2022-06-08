package 集合;

public class 开发中集合的选择 {
    public static void main(String[] args) {
        /*
        * 1.先判断存储的类型（单例/双例）
        * 一组对象：Collection接口的某一个子类
        *      逻辑允许重复：List
        *           增删 多：LinkedList【底层维护了一个双向链表】
        *           改查 多：ArrayList【底层维护了一个Object类型的可变数组】
        *       逻辑不允许重复：Set
        *           无序：HashSet【底层是HashMap,维护了一个哈希表，即数组+链表+红黑树】
        *           排序：TreeSet
        *           插入和取除排序一致：LinkHashSet【维护数组+双向链表】
        * 一组键值对：Map
        *        键无序：HashMap【底层：哈希表，数组+链表+红黑树】
        *        键排序：TreeMap
        *        键插入和取除顺序一致：LinkedHashMap
        *        读取文件：Properties
        *
        * */
    }
}
