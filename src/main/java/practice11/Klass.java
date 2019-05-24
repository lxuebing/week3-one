package practice11;

import java.util.HashSet;
import java.util.Set;

public class Klass {
    int number;
    Student leader;
    Set<Student> students;
    Teacher teacher;

    public Klass(int number){
        this.number = number;
        students = new HashSet<>();
    }

    public int getNumber() {
        return number;
    }

    public void assignLeader(Student student){
        if (this.students.contains(student)){
            this.leader = student;
            if(this.teacher != null)
                System.out.print(String.format("I am %s. I know Jerry become Leader of Class %d.\n", this.teacher.name, this.number));
        }

        else System.out.print("It is not one of us.\n");
    }

    public boolean isIn(Student student) {
        return this.students.contains(student);
    }
    public void appendMember(Student student) {
        this.students.add(student);
        if(this.teacher != null)
            System.out.print(String.format("I am %s. I know Jerry has joined Class %d.\n", this.teacher.name, this.number));
    }
    public String getDisplayName(){
        return String.format("Class %d", this.number);
    }

    public Student getLeader(){
        if (this.leader == null)
            return new Student();
        return this.leader;
    }
}
