public class System方法 {
    public static void main(String[] args) {
        //exit:退出当前程序
        System.out.println("ok1");
        System.exit(0);//0代表正常退出
        System.out.println("ok2");

        //
        int[] a = {1,2,3};
        int[] b = new int[3];//{0, 0, 0}
        //从原数组a的0索引开始拷贝到b数组的0索引位置，共拷贝了3个数据
        System.arraycopy(a,0,b,0,3);
    }
}
