package practice03;

public class Student extends Person{
    int klass;

    public int getKlass() {
        return klass;
    }

    public Student(String name, Integer age, Integer klass) {
        super(name, age);
        this.klass = klass;
    }

    public String introduce(){
        return "I am a Student. I am at Class "+klass+".";
    }
}
