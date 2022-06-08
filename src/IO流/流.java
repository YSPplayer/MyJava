package IO流;

import java.io.*;

public class 流 {
    public static void main(String[] args) throws IOException {
        //流的分类：字节流(8bit) 字符流(一个字符对应的字节数和编码有关)
        //二进制文件 文本文件
        //文本文件最好用字符流处理，因为可能一个字符是用二个或多个字节组成，那样的话字节读取会乱码
        //都是抽象类
        //InputStream OutStream Reader Writer
        readFile();
        readFile2();
    }

    //使用byte[]提高效率
    public static void readFile2() throws IOException{
        //定义字节数组
        int read = 0;
        byte[] buf =new byte[8];//一次读8个字节
        String path = "D:\\javaGit\\MyJava\\temp.txt";
        FileInputStream fileInputStream = new FileInputStream(path);
        //read返回读取的字节数
        while ((read = fileInputStream.read(buf)) !=-1) {
            System.out.print(new String(buf,0,read));//转成char显示
        }


    }
    //单个字节的读取，效率低
    public static void readFile() throws IOException {
        //创建FileInputStream对象，用于读取文件
        int read = 0;
        String path = "D:\\javaGit\\MyJava\\temp.txt";
        FileInputStream fileInputStream = new FileInputStream(path);
        //如果返回-1，则读取完毕
       while ((read = fileInputStream.read()) !=-1) {
           System.out.print((char)read);//转成char显示
       }
       //关闭文件流，释放资源
        fileInputStream.close();

    }

    //这个是读取字符，不是byte字节
    public static void readStringFile() throws IOException {
        int read = 0;
        String path = "D:\\javaGit\\MyJava\\temp.txt";
        FileReader fileReader = new FileReader(path);
        while ((read = fileReader.read()) != -1) {

            System.out.println((char) read);
        }
        fileReader.close();
    }
}

//包装流
