package 封装继承多态;

public class 多态数组 {
    //把对象放在数组中
    public static void main(String[] args) {
        People[] people = new People[5];
        people[0] = new Teacher("王老师",30,1000);
        people[1] = new Child("小明",18,80);
        people[2] = new Child("小张",19,90);
        //循环调用对象中的方法
        for(int i = 0; i < people.length; i++) {
            //people[i].say();//内含动态的绑定机制 编译类型是people，运行类型根据需求决定
            //如果类型是学生/老师则输出他们特有的方法
            if(people[i] instanceof Child) {
                ((Child)people[i]).study();
            } else if (people[i] instanceof Teacher) {
                ((Teacher)people[i]).teach();
            }
        }

    }

}
class People {
    String name;
    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void say() {
        System.out.println("我是大人");
    }
}
class Teacher extends People {
    int money;

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public Teacher(String name, int age, int money) {
        super(name, age);
        this.money = money;
    }

    @Override
    public void say() {
        System.out.println("我是老师");
    }
    public void teach() {
        System.out.println("老师正在授课");
    }
}
class Child extends People {
    int grade;
    public Child(String name, int age, int grade) {
        super(name, age);
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public void say() {
        System.out.println("我是学生");
    }

    public void study() {
        System.out.println("学生正在学习");
    }

}