package IO流;

import java.io.File;

public class 获取文件信息 {
    public static void main(String[] args) {

    }
    //获取文件的信息
    public void info() {
        //先创建文件对象
        File file = new File("D:\\javaGit\\MyJava\\temp.txt");

        //调用相应方法
        System.out.println("文件名字" + file.getName());
        System.out.println("绝对路径" + file.getAbsolutePath());
        System.out.println("父级目录" + file.getParent());
        System.out.println("文件大小" + file.length());
        System.out.println("文件是不是存在" + file.exists());
        System.out.println("文件是不是文件" + file.isFile());
        System.out.println("文件是不是目录" + file.isDirectory());
    }
}
