package practice06;

public class Teacher extends Person {

    int klass;
    boolean noKlass;

    public Teacher(String name, Integer age, int klass) {
        super(name, age);
        this.klass = klass;
    }
    public Teacher(String name, Integer age) {
        super(name, age);
        this.noKlass = true;
    }


    public int getKlass() {
        return klass;
    }

    public String introduce() {
        String klassStr = noKlass ? " I am a Teacher. I teach No Class."
                : " I am a Teacher. I teach Class " + klass + ".";
        return super.introduce() + klassStr;
    }
}
