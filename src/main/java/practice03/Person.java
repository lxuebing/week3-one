package practice03;

public class Person {
    String name;
    int age;

    public Person(String name,int age){
        this.age = age;
        this.name = name;
    }
    public Person(){}

    public int getAge(){
        return age;
    }

    public String getName(){
        return name;
    }

    public String introduce() {
        return "My name is "+this.name+". I am "+this.age+" years old.";
    }
}
