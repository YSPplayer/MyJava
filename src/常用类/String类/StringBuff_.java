package 常用类.String类;

public class StringBuff_ {
    public static void main(String[] args) {
        /*
        * StringBuffer:代表可变的字符序列
        *
        *1.StringBuffer:
        *它的char[] value,不是final类型的，所以是存放在堆内的
        *
        * stringBuffer不能被继承
        *
        * stringBuffer保存的是字符串变量，不用每次更新地址，只有在对象的字符数组空间不够时，才会改变地址
        * 1.转换
        * String ——> StringBuffer 和 StringBuffer——>String
        * 构造器   和  StringBuffer的toSting方法或String的构造器
        *
        * 2.方法：增、删、替换、长度、插入
        *
        * */
        StringBuffer stringBuffer = new StringBuffer("hello");
        StringBuffer stringBuffer1 = new StringBuffer(100);
        stringBuffer.append(";");//增加;
        stringBuffer.delete(2,4);//删除索引大于等于2小于4的内容
        stringBuffer.replace(2,4,"小明");//2到4[2，4）替换成小明

    }
}
