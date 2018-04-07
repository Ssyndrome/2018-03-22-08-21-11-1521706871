package practice07;

public class Teacher extends Person{
    Klass klass;
    boolean noKlass;

    public Teacher(String name, Integer age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }
    public Teacher(String name, Integer age) {
        super(name, age);
        this.noKlass = true;
    }

    public String introduce() {
        String klassStr = noKlass ? " I am a Teacher. I teach No Class."
                : " I am a Teacher. I teach Class " + klass.number + ".";
        return super.introduce() + klassStr;
    }

    public String introduceWith(Student student){
        String introCo = super.introduce()+" I am a Teacher. I ";
        if(this.klass.number == student.klass.number){
            return introCo+"teach "+student.name+".";
        }else {
            return introCo+"don't teach "+student.name+".";
        }
    }

    public Klass getKlass(){
        return klass;
    }

}
