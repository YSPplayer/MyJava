package IO流;

import java.io.*;

public class BufferedInput_ {
    public static void main(String[] args) throws IOException {
        //完成图片的拷贝，二进制文件处理
        String srcFilepath = "D:\\javaGit\\MyJava\\77240480.jpg";
        String destFilePath = "D:\\javaGit\\MyJava\\77240465.jpg";//目标文件路径
        //创建对象
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        //因为FileInputStream继承了inputStream类
        bis = new BufferedInputStream(new FileInputStream(srcFilepath));
        bos = new BufferedOutputStream(new FileOutputStream(destFilePath));

        //循环读取文件，并写入到destFilePath
        byte[] buff = new byte[1024];
        int readlen = 0;
        //不等于-1表示成功读取
        while ((readlen = bis.read(buff)) != -1) {
            bos.write(buff,0,readlen);
        }
        //关闭流
        bis.close();
        bos.close();
    }
}
