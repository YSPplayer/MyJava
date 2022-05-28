package 封装继承多态;

public class 封装 {
    public static void main(String[] args) {
        //get 和 set 方法的使用
        Person person = new Person("小明",10,3);
        person.setAge(-10);
        System.out.println(person.getAge());
    }
}
class Person{
   private String name;
   private int age;
   private int lever;

   //快捷键:alt+insert——>get and set
   public void setName(String name) {
       if(name.length() <= 4) {
           this.name = name;
       } else {
           System.out.println("你输入的名字不合法！请重新输入");
       }
   }
   public String getName() {
       return this.name;
   }
   public void setAge(int age){
       if(age <= 0) {
           System.out.println("你输入的年龄不合法！请重新输入");
       } else {
           this.age = age;
       }
   }
   public int getAge() {
       return this.age;
   }

    public int getLever() {
        return lever;
    }

    public void setLever(int lever) {
        this.lever = lever;
    }

    public Person(String name, int age, int lever) {
        //这样构造的缺点:防护机制就失效了
        /*
        this.name = name;
        this.age = age;
        this.lever = lever;*/
        setName(name);
        setAge(age);
        setLever(lever);
    }
}