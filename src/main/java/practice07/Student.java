package practice07;

public class Student extends Person{
    Klass klass;

    public Student(String name, Integer age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }

    public String introduce(){
        return super.introduce()+" I am a Student. I am at Class "+klass.number+".";
    }

    public Klass getKlass(){
        return klass;
    }
}
