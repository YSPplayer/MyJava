package 封装继承多态;

public class 多态参数 {
    /*
    * 1.方法定义的形参类型为父类类型，实参类型允许为子类类型
    * 2.
    * */
    public static void main(String[] args) {
        Employee employee = new Employee("小明", 1000);
        getAnyMoney(employee);
    }
    //在此方法中实现获取任何员工的工资
    public static void getAnyMoney(Employee e) {
        System.out.println(e.getMyMoney());//动态绑定机制
    }
}
//员工
class Employee {
    private String name;
    private int money;

    public Employee(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
    //得到年工资的方法
    public int getMyMoney() {
        return 12 * this.money;
    }
}
class Worker extends Employee {

    public Worker(String name, int money) {
        super(name, money);
    }
    public void work() {
        System.out.println("普通员工"+getName()+"正在工作");
    }

    @Override
    public int getMyMoney() {//普通员工直接调用父类的方法
        return super.getMyMoney();
    }
}
class Manager extends Employee {
    private int bonus;

    public Manager(String name, int money, int bouns) {
        super(name, money);
        this.bonus = bouns;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
    public void manage() {
        System.out.println("经理"+getName()+"正在工作");
    }
    //重写年薪 年薪=此年薪+员工年薪
    @Override
    public int getMyMoney() {
        return super.getMyMoney() + bonus;
    }
}
