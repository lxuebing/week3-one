package practice11;

public class Student extends Person{
    Klass klass;

    Student(){}
    public Student(int id, String name, int age, Klass klass){
        super(id ,name, age);
        this.klass = klass;
        this.klass.students.add(this);
    }

    public Klass getKlass(){
        return this.klass;
    }

    public String introduce(){
        if (this.klass.leader != null && this.equals( this.klass.leader))
            return super.introduce() + String.format(" I am a Student. I am Leader of Class %d.", this.klass.getNumber());
        return super.introduce() + String.format(" I am a Student. I am at Class %d.", this.klass.getNumber());
    }
}