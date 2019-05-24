package practice11;

import java.util.LinkedList;

public class Teacher extends Person{
    private LinkedList<Klass> classes = new LinkedList<>();

    public Teacher(int id, String name, int age){
        super(id ,name, age);
    }

    public Teacher(int id, String name, int age, LinkedList<Klass> classes){
        super(id ,name, age);
        for(Klass klass : classes){
            klass.teacher = this;
            this.classes.add(klass);
        }
    }

    public boolean isTeaching(Student student){
        for(Klass klass : this.classes){
            if(klass.isIn(student)) return true;
        }
        return false;
    }

    public LinkedList<Klass> getClasses(){
        return this.classes;
    }
    public String introduce(){
        if (this.classes.size() == 0)
            return super.introduce() + " I am a Teacher. I teach No Class.";
        String s = this.classes.get(0).number + "";
        for (int i = 1; i < this.classes.size(); i++) {
            s += ", " + this.classes.get(i).number;
        }
        return super.introduce() + String.format(" I am a Teacher. I teach Class %s.", s);
    }

    public String introduceWith(Student student){
        for(Klass klass : classes){
            if (klass.equals(student.getKlass()))
                return super.introduce() + String.format(" I am a Teacher. I teach %s.", student.name);
        }
        return super.introduce() + String.format(" I am a Teacher. I don't teach %s.", student.name);
    }
}

