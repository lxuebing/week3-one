package practice09;

import java.util.HashSet;
import java.util.Set;

public class Klass {
    int number;
    Student leader;
    Set<Student> students;

    public Klass(int number){
        this.number = number;
        students = new HashSet<>();
    }

    public int getNumber() {
        return number;
    }

    public void assignLeader(Student student){
        if (this.students.contains(student))
            this.leader = student;
        else System.out.print("It is not one of us.\n");
    }
    public void appendMember(Student student) {
        this.students.add(student);
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
