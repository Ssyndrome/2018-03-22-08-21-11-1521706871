package practice08;

public class Klass {
    int number;
    Student leader;

    public Klass(int number) {
        this.number = number;
    }

    public String getDisplayName(){
        return "Class "+number;
    }

    public void assignLeader(Student student){
        this.leader = student;
    }

    public Student getLeader() {
        return leader;
    }

    public int getNumber() {
        return number;
    }
}
