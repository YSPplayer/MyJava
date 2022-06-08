public class 装箱和拆箱 {
    /*
     * 装箱：基本类型——>包装类型
     * 拆箱：包装类型——>基本类型
     *
     * 自动装箱：valueOf()
     *
     *
     * */
    public static void main(String[] args) {
     //jdk5之前：手动装箱
      int n1 = 100;
      Integer integer = new Integer(n1);
      Integer integer2 = Integer.valueOf(n1);

        //手动拆箱
        int i = integer.intValue();

        //jdk5之后
        Integer integer3 = n1;//底层使用的仍然是new 当值在-128 ——127之间，没有new，是一样的

        //自动拆箱
        int n3 = integer3;//底层使用的仍然是new

        Integer a = 128 ;
        int a2 = 128 ;
        //只要有基本数据类型，判断的就是值是否相等而不是地址
        System.out.println(a == a2);

    }
    /*
    *
    *Object i == true? new Integer(1) :new Double(2.0);
    * 输出的是1.0，三元运算符要看成整体，会提升精度
    *
    * */
}
