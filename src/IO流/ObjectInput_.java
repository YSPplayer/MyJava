package IO流;

import java.io.*;

//对象处理流，如把数值存储成int类型，或者保存一个数据对象
public class ObjectInput_ {
    /*
    * 1.序列化：保存数据时保存数据的值和类型
    * 2.反序列化：恢复数据的值和数据类型
    * 我们的对象要实现一些接口才能序列化
    * */
    public static void main(String[] args) throws IOException {
        //序列化后，保存的文件格式不是纯文本，而是按照它的方式存储
        String filePath = "D:\\javaGit\\MyJava\\data.dat";
        ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(filePath));
        //序列化数据到filePath，这些对象要实现对应接口serialize，以下数据类型都实现了
        os.writeInt(100);
        os.writeBoolean(true);
        os.writeChar('a');
        os.writeUTF("测试");//String

        //反序列化
        ObjectInputStream oi = new ObjectInputStream(new FileInputStream(filePath));
        System.out.println(oi.readInt());
        System.out.println(oi.readChar());
        System.out.println(oi.readUTF());
        os.close();
        oi.close();

        
    }


}
