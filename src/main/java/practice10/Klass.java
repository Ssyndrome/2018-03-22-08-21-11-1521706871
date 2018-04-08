package practice10;

import java.util.ArrayList;
import java.util.List;

public class Klass {
    int number;
    Student leader;
    List<Student> members = new ArrayList<>();

    public Klass(int number) {
        this.number = number;
    }

    public String getDisplayName(){
        return "Class "+number;
    }

    public void assignLeader(Student student){
        if(student.klass == this || members.contains(student)){
            this.leader = student;
        }else {
            System.out.println("It is not one of us.\n");
        }
    }

    public void appendMember(Student student){
        members.add(student);
    }

    public Student getLeader() {
        return leader;
    }

    public int getNumber() {
        return number;
    }

}
