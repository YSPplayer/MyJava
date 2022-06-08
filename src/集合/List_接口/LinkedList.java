package 集合.List_接口;

import Object教程.Tostring;

import java.net.PortUnreachableException;

public class LinkedList {
    public static void main(String[] args) {
        /*
        *   涉及到数据结构和算法
        * LinkedList底层双向链表和双端队列特点
        *线程不安全，未同步
        *首节点 尾节点
        *
        * LinkedList元素的添加和删除不是通过数组完成的，所以效率比较高
        *
        * 使用ArrayList场合：改查次数多
        * 使用LinkedList场合：增删次数多
        * */
        Node jack1 = new Node("小明");
        Node jack2 = new Node("小刚");
        Node jack3 = new Node("小华");

        //连接三个节点，形成双向链表
        jack1.next = jack2;
        jack2.next = jack3;

        jack3.pre = jack2;
        jack2.pre = jack1;

        //让first引用指向jack1，第一个头节点
        Node first = jack1;
        //让last引用指向jack3，第一个尾节点
        Node last = jack3;

        //遍历
        while (true) {
            if(first == null) {
                break;
            }
            //输出first信息
            System.out.println(first);
            first = first.next;
        }
    }
}
//定义一个Node类，它的对象表示双向链表的节点
class Node {
    public Object item;//真正存放数据的地方
    public Node next;//指向下一个节点
    public Node pre;//指向上一个节点

    public Node(Object item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "Node name =" + item;
    }
}
