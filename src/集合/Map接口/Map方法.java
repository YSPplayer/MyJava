package 集合.Map接口;

import java.util.HashMap;
import java.util.Map;

public class Map方法 {
    public static void main(String[] args) {
        //演示Map接口常用方法
        Map map = new HashMap();
        map.put("no1","小明");
        map.put("no2","小红");
        map.put("no3","小张");
        map.put("no3","小刚");
        map.put("no5","小华");
        OldStudent od = new OldStudent("小强","2");
        map.put("no4",od);
        map.remove("no3");//移除对应元素
        System.out.println("map = " + map);
        Object obj = map.get("no5");//返回对应的对象
        Object obj2 = map.get("no4");//返回对应的对象
        System.out.println(obj.getClass());
        System.out.println(obj2.getClass());
        System.out.println(obj);//返回key对应的value
        System.out.println(obj2);//返回key对应的value

        map.size();//获取元素数
        map.isEmpty();//元素是否为空？
        map.clear();//清除元素

    }
}
class OldStudent {
    String name;
    String level;

    public OldStudent(String name, String level) {
        this.name = name;
        this.level = level;
    }
}
