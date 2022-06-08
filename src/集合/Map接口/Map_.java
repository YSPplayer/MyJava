package 集合.Map接口;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map_ {
    public static void main(String[] args) {
        /*
        * Map特点一：
        * 1.Map与Collection并列存在
        * 2.必须有key-value 双列元素
        * 3.Map中的Key和Value可以是任意引用类型的数据，会封装到HashMap$Node中
        * 4.Map中的Key不允许重复，当Key重复时，会替换掉原先的数据值
        * 5.Map中的Value可以重复
        * 6.我们通过Key能找到对应的Value
        *
        *Map特点二：
        * 1.k-v最终是放在所new的HashMap$Node对象中
        * 2.k-v为了方便程序员的遍历，会创建EntrySSet集合，该集合存放的元素类型 Entry
        *   而Entry对象就要k,v EntrySet<Entry>(k,v),即Set集合，EntrySet中存放的是HashMap$Node
        *
        *Map特点三：
        * HashMap没有实现同步，线程不安全
        * */
        HashMap hashMap = new HashMap();
        //key-value
        hashMap.put("no1","小明") ;
        hashMap.put("no2","小张");
        System.out.println(hashMap);

        Set set = hashMap.entrySet();
        for (Object entry : set) {
            System.out.println(entry.getClass());

            //定义的类型是EntrySet，但存放的类型是HashMap$Node
            //因为HashMap$Node实现了这个接口Map.Entry
            //这样为了遍历集合的方便
            Map.Entry entry2 =(Map.Entry)entry;
            System.out.println(entry2.getKey().toString() + entry2.getValue().toString());
        }

    }
}
