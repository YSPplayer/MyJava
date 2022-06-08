package 常用类;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Calendar;

public class Calendar类 {
    public static void main(String[] args) {
        /*
        * 第二代日期类
        *Calendar是一个抽象类，构造器是私有的
        * */
        //创建一个对象
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);

        /*
        *
        *第三代日期类
        * 处理一些闰秒、日期不准确的问题
        *
        * */
        LocalDateTime temp = LocalDateTime.now();
        LocalTime temp2 = LocalTime.now();
        LocalDate temp3 = LocalDate.now();

        temp.getYear();
        temp.getMonth();
        temp.getMonthValue();

        //将日期格式化
        DateTimeFormatter d = DateTimeFormatter.ofPattern("yyyy年dd日");
        String res2 = d.format(temp);
        System.out.println(res2);

        //还有方块可以做日期的加减
    }
}
