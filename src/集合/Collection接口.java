package 集合;

import java.util.ArrayList;
import java.util.Arrays;

public class Collection接口 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList.add(1);//这里用的是装箱而不是基本数据类型
        arrayList.add("小明");

        arrayList2.add("小刚");
        arrayList.addAll(arrayList2);//传入多个元素
        arrayList.containsAll(arrayList2);//判断是否有多个元素存在
        arrayList.size();//返回元素的个数
        arrayList.remove(0);//删除索引
        arrayList.remove("小明");//删除指定值
        System.out.println(arrayList);


    }
}
