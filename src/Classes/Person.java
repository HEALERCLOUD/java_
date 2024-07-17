package Classes;

public class Person {
    private String name;
    private int age;

    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }

    //getters
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    //setters
    public void setAge(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }


}
