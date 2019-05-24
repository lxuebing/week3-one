package practice10;

public class Person {
    int id;
    String name;
    int age;

    public Person(){}
    public Person(int id, String name, int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }



    public String introduce(){
        return "My name is "+this.name+". I am "+this.age+" years old.";
    }

    @Override
    public boolean equals(Object obj) {
        Person p = (Person)obj;
        if(p.getId() == this.id) return true;
        return false;
    }
}
