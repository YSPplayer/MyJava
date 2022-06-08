package 常用类.String类;

public class String_ {
    public static void main(String[] args) {
        /*
         * 1.字符串的本质是char数组 final char[] value
         *2.注意：value是final类型，不可以修改（不是字符不能改，而是地址不能改）
         * */
        if (true) {
            //先从常量池看是否有“小明”数据空间，如果有则直接指向，如果没有则重新创建，然后指向。name指向
            //的是常量池的空间地址
            String name = "小明";

            //先在堆中创建空间，里面维护了value属性，指向了常量池的“小明”空间。如果有则直接指向，
            //如果没有则重新创建，然后指向。name2指向的是堆中的空间地址
            String name2 = new String("小明");

            //这个只创建了一个字符串对象，右边编译器会优化，等价于“哈哈小明”
            String name3 = "哈哈" + "小明";

            String name4 = "哈哈";//创建一个对象
            String name5 = "小明";//创建一个对象
            //这个是调用StringBuild类来创建对象的，这里的name6指向的是堆中的对象，然后堆再指向池子的地址
            //共创建了2个对象
            String name6 = name4 + name5;
        }else {
            p p1 = new p();
            p1.name = "小明";
            p p2 = new p();
            p2.name = "小明";
            System.out.println(p1 == p2);//false
            //这里是true的原因：比较的是name所存储的地址，而不是比较name本身所处在的地址
            System.out.println(p1.name== p2.name);//true

        }

    }
}
class p {
  public String name;
}
