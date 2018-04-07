package practice07;

public class Try {

    public static void main(String[] args) {
        Klass klass = new Klass(2);
        Student student = new Student("Tom",21,klass);
        System.out.println(student.getKlass() == klass);
        System.out.println(2);
//        System.out.println(klass.students.contains(stude
    }

}
