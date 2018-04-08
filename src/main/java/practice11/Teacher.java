package practice11;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Teacher extends Person{
    Set<Klass> klasses;
    boolean noKlass;

    public Teacher(int id, String name, Integer age, Set<Klass> klasses) {
        super(id, name, age);
        this.klasses = klasses;
        for (Klass item:klasses){
            item.teacher = this;
        }
    }
    public Teacher(int id, String name, Integer age) {
        super(id, name, age);
        this.noKlass = true;
    }

    public String introduce() {
        String klassStr = "";
        if(noKlass){
            klassStr = " I am a Teacher. I teach No Class.";
        }else{
            List<String> klassArr = new ArrayList<>();
            for(Klass item: klasses){
                klassArr.add(" "+item.number);
            }
            klassStr =" I am a Teacher. I teach Class" + klassJoin(klassArr) + ".";
        }
        return super.introduce() + klassStr;
    }
    private String klassJoin(List<String> list){
        String str = list.get(0);
        for (int i = 1;i < list.size();i++){
            str += ","+list.get(i);
        }
        return str;
    }

    public boolean isTeaching(Student student){
        return klasses.contains(student.klass);
    }
    public String introduceWith(Student student){
        String introCo = super.introduce()+" I am a Teacher. I ";
        if(isTeaching(student)){
            return introCo+"teach "+student.name+".";
        }else {
            return introCo+"don't teach "+student.name+".";
        }
    }



    public Set<Klass> getClasses(){
        return klasses;
    }

}
