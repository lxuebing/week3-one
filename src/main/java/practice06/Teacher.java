package practice06;

public class Teacher extends Person {
    int klass;

    public Teacher(String name, int age, int klass){
        super(name, age);
        this.klass = klass;
    }
    public Teacher(String name, int age){
        super(name, age);
    }

    public int getKlass(){
        return klass;
    }

    public String introduce(){
        if(this.klass != 0){
            return super.introduce()+" I am a Teacher. I teach Class "+klass+".";
        }else{
            return super.introduce()+" I am a Teacher. I teach No Class.";
        }
    }
}