package IO流;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferReader_ {
    public static void main(String[] args) throws IOException {
        //要读取文件的路径
        String filepath = "D:\\javaGit\\MyJava\\temp.txt";
        //创建bufferRead对象
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filepath));
        //读取，底层用的是filereader
        String line;
        while ((line = bufferedReader.readLine())!=null) {//按行读取,返回空时表示读取完毕
                System.out.println(line);
        }
        bufferedReader.close();//只需关闭bufferedReader即可，底层会自动关闭FileReader
    }

    //字符操作了流：bufferReader

}
