package Classes;

public class Student extends Person {
    private int gpa;
    public Student(String name,int age,int gpa) {
        super(name,age);
        this.gpa = gpa;
    }
    public int getGpa(){
        return gpa;
    }
    public void setGpa(int gpa){
        this.gpa = gpa;
    }
}
