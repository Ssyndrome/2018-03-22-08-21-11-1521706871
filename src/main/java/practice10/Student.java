package practice10;

public class Student extends Person{
    Klass klass;

    public Student(int id,String name, Integer age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public String introduce() {
        if(this.klass.getLeader() == this){
            return super.introduce() + " I am a Student. I am Leader of Class " + klass.number + ".";
        }else {
            return super.introduce() + " I am a Student. I am at Class " + klass.number + ".";
        }
    }

    public Klass getKlass() {
        return klass;
    }

}
