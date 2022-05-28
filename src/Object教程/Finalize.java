package Object教程;

public class Finalize {
    //当垃圾回收器确定不存在对该对象的更多引用时，由对象的垃圾回收器调用此方法
    //相当于C#的Dispose;
    //System.gc() //主动触发GC垃圾回收机制


    public static void main(String[] args) {
        A a = new A();
        System.gc();//一般可以，取决于系统，可能调用了也不会有用
    }
}
