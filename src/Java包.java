import com.temp1.Student;

import java.util.Arrays;

public class Java包 {
    public static void main(String[] args) {
        int[] arr = {-1, 5, 7, 8};
        Arrays.sort(arr);
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
   /*
    包的本质：创建不同的文件夹来保存文件
    包的创建：单击src,new一个package
    包的命名规范：com.公司名.项目名.业务模块名
    java中有默认的包，该包不需要引用即可用，即无需import

    使用教程：
    java.util.Scanner; 表示只会引入java.util 包下的Scanner类
    java.util.*; 表示将java.util下的所有类都引入
    --注意：最好是需要使用哪个类，导入哪个类即可

    包需要放在类的最上面，一个类当中最多只能有一个package
    import指令在package的下面
    */
}

