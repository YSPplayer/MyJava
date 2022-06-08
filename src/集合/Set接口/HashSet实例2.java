package 集合.Set接口;

import java.util.HashSet;
import java.util.Objects;

public class HashSet实例2 {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        hashSet.add(new Person("小明",new Birthday(2001,10,19)));
        hashSet.add(new Person("小华",new Birthday(2001,10,19)));
        hashSet.add(new Person("小明",new Birthday(2010,9,7)));
        hashSet.add(new Person("小张",new Birthday(2009,4,13)));
        hashSet.add(new Person("小明",new Birthday(2001,10,19)));
        System.out.println(hashSet);
    }
}
class Person {
    private String name;
    private Birthday birthday;

    public Person(String name, Birthday birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "姓名" + name + ":" + "年月日" + birthday.year + "/" + birthday.month  + "/" + birthday.day;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(this.name, person.name) && Objects.equals(this.birthday.year, person.birthday.year)
                && Objects.equals(this.birthday.month, person.birthday.month)
                && Objects.equals(this.birthday.day, person.birthday.day);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.name, this.birthday.year, this.birthday.month, this.birthday.day);
    }
}
class Birthday {
    public int year;
    public int month;
    public int day;

    public Birthday(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
}
