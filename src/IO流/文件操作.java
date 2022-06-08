package IO流;

import java.io.File;

public class 文件操作 {
    public static void main(String[] args) {
        
    }

    //判断d盘下是否有temp存在，有则删除
    public void m1() {
        String path = "D:\\javaGit\\MyJava\\temp.txt";
        File file = new File(path);
        if(file.exists()) {
            //如果存在，就删除
            file.delete();
            System.out.println("删除成功！");
        }

    }

    //需求三

}

