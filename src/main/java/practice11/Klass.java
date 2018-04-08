package practice11;

import java.util.ArrayList;
import java.util.List;

public class Klass {
    int number;
    Student leader;
    List<Student> members = new ArrayList<>();
    Teacher teacher;

    public Klass(int number) {
        this.number = number;
        this.teacher = teacher;
    }

    public String getDisplayName(){
        return "Class "+number;
    }

    public void assignLeader(Student student){
        if(student.klass == this || members.contains(student)){
            this.leader = student;
//            System.out.println("I am "+this.teacher+". I know "+student.name+" become Leader of Class "+this.number+".");
        }else {
            System.out.println("It is not one of us.\n");
        }
    }

    public void appendMember(Student student){
        members.add(student);
//        System.out.println("I am "+this.teacher+". I know "+student.name+" has joined Class "+this.number+".");
    }

    public Student getLeader() {
        return leader;
    }

    public int getNumber() {
        return number;
    }


}
