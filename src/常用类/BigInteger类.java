package 常用类;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigInteger类 {
    public static void main(String[] args) {
        /*
        * 开发中遇到太大数字的解决方案
        *
        * 对bigInteger进行算术运算时不能使用传统符号，要用对应方法
        * 创建一个BigInteger，然后进行相应操作即可
        *
        * double类型使用的是BigDecimal
        * */
        long l = 23335555;
        BigInteger bigInteger = new BigInteger("23999999999999999999999999999999");
        BigInteger bigInteger2 = new BigInteger("23999999999999999999999999999999");
        BigInteger newBig = bigInteger.add(bigInteger2);//加
        BigInteger newBig2 = bigInteger.subtract(bigInteger2);//减
        BigInteger newBig3 = bigInteger.multiply(bigInteger2);//乘
        BigInteger newBig4 = bigInteger.divide(bigInteger2);//除
        System.out.println(newBig);

    }
}
