package IO流;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriter_ {
    public static void main(String[] args) throws IOException {
        //要读取文件的路径
        String filepath = "D:\\javaGit\\MyJava\\temp.txt";
        //带true表示以追加的方式写
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filepath,true));
        bufferedWriter.write("hello，小明！");
        bufferedWriter.close();

    }
}
