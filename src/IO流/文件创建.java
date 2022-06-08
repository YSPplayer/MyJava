package IO流;


import java.io.File;
import java.io.IOException;

public class 文件创建 {
    public static void main(String[] args) throws IOException {
        //演示创建文件
        //create();
        create2();
    }
    public static void create() throws IOException {
        String path ="D:\\javaGit\\MyJava";
        File file = new File(path);
        file.createNewFile();
        System.out.println("文件创建成功");
    }
    public static void create2() throws IOException {
        File parentFile = new File("D:\\javaGit\\MyJava");
        String filename = "temp.txt";
        File file = new File(parentFile, filename);
        file.createNewFile();
        System.out.println("文件创建成功");
    }
    public static void create3() throws IOException {
        File parentFile = new File("D:\\javaGit\\MyJava");
        String filename = "temp.txt";
        File file = new File(parentFile, filename);
        file.createNewFile();
        System.out.println("文件创建成功");
    }
}
