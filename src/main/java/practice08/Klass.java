package practice08;

public class Klass {
    int number;
    Student leader;

    public Klass(int number){
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void assignLeader(Student student){
        this.leader = student;
    }

    public String getDisplayName(){
        return String.format("Class %d", this.number);
    }

    public Student getLeader(){
        return this.leader;
    }
}
