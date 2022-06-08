public class 注解 {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        //元数据
        //和注释一样，注解不影响程序逻辑，但会被编译运行
        /*
        * @override：限定某个方法，是重写父类方法，该注解只用于方法（就是给编译器提示报错说明的方法）
        * @Target：修饰注解的注解，元注解
        * @Deprecated:表示某个方法已经过时
        * @SuppressWarnings：抑制编译器警告（有时候我们不希望看到这些警告的时候，可以使用这个注解）
        * 如上图抑制所有警告
        *
        * */


    }
}
