package practice08;

public class Try00 {

    public static void main(String[] args) {
        Person person1 = new Person(1,"Tom",21);
        Person person2 = new Person(1,"Tom",21);
        System.out.println(person1.isEqualTo(person2));
    }
}
