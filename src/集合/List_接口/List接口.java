package 集合.List_接口;

import java.util.ArrayList;
import java.util.List;

public class List接口 {
    public static void main(String[] args) {
        //实现List接口的：添加和取除的顺序一致
        List list = new ArrayList();
        list.add("小明");
        list.add("小明");
        System.out.println(list);

        //实现List接口的：都有对应的顺序索引
        list.get(1);
    }
}
