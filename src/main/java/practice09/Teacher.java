package practice09;

public class Teacher extends Person{
    Klass klass;

    public Teacher(int id, String name, int age){
        super(id ,name, age);
    }

    public Teacher(int id, String name, int age, Klass klass){
        super(id ,name, age);
        this.klass = klass;
    }

    public Klass getKlass(){
        return this.klass;
    }
    public String introduce(){
        if (this.klass == null)
            return super.introduce() + " I am a Teacher. I teach No Class.";
        return super.introduce() + String.format(" I am a Teacher. I teach Class %d.", this.klass.getNumber());
    }

    public String introduceWith(Student student){
        if (this.klass != null && this.klass.equals(student.klass))
            return super.introduce() + String.format(" I am a Teacher. I teach %s.", student.name);
        return super.introduce() + String.format(" I am a Teacher. I don't teach %s.", student.name);
    }
}
