package practice04;

public class Student extends Person {
    int klass;

    public Student(String name, int age, int klass){
        super(name, age);
        this.klass = klass;
    }

    public int getKlass(){
        return klass;
    }

    public String introduce(){
        return this.basicIntroduce()+" I am a Student. I am at Class "+this.klass+".";
    }
}
