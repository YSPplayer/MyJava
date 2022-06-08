package 集合;

import java.util.ArrayList;
import java.util.Collections;

public class Collections工具类 {
    public static void main(String[] args) {
        /*
        * 1.对集合中的元素进行操作的类
        *
        * */
        ArrayList arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        Collections.shuffle(arrayList);//随机排序
        Collections.reverse(arrayList);//顺序反转
    }
}
