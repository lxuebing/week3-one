package practice07;

public class Teacher extends Person {
    Klass klass;

    public Teacher(String name, int age, Klass klass){
        super(name, age);
        this.klass = klass;
    }
    public Teacher(String name, int age){
        super(name, age);
    }

    public String introduce(){
        if(this.klass != null){
            return super.introduce()+" I am a Teacher. I teach Class "+this.klass.getNumber()+".";
        }else{
            return super.introduce()+" I am a Teacher. I teach No Class.";
        }
    }

    public String introduceWith(Student student){
        if(student.klass.getNumber() == this.klass.getNumber()) {
            return "My name is " + this.name + ". I am " + this.age + " years old. I am a Teacher. I teach " + student.name + ".";
        }else{
            return "My name is " + this.name + ". I am " + this.age + " years old. I am a Teacher. I don't teach " + student.name + ".";
        }
    }

    public Klass getKlass(){return this.klass;}
}
