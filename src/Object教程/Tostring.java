package Object教程;

public class Tostring {
    //类名+16进制的哈希值
    public static void main(String[] args) {
    AA a = new AA();
    a.a = "小明";
    System.out.println(a.toString());

    }
}
class AA {
    String a ;
    int s;

    @Override
    public String toString() {
        return this.a;
    }

}
