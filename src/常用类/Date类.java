package 常用类;

//这里类引用的是util下的Data
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Date类 {
    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        //获取当前系统时间，获取的格式是外国的习惯
        System.out.println("当前日期：" + date);

        //创建一个该对象，可以指定相应的格式
        //这里格式使用的字母都是规定好的
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 hh:mm:ss E");
        String res = simpleDateFormat.format(date);
        System.out.println(res);

        Date date2 = new Date(78213136);//通过指定毫秒数获取时间
        System.out.println(date2);

        //这里是把simpleDateFormat转换成原始的数据格式，这里需要抛弃异常才能转
        Date date1 = simpleDateFormat.parse(res);
        System.out.println(date1);

    }
}
