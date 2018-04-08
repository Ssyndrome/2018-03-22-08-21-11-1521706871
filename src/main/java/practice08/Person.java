package practice08;

import java.util.List;
import java.util.Map;

public class Person {
    int id;
    String name;
    int age;
    Map<Integer,Person> ids;

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String introduce(){
        return "My name is "+name+". I am "+age+" years old.";
    }

    public boolean isEqualTo(Person person){
        return (this.id == person.id);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

}
