package Classes;

public class Teacher extends Person{
    private String school;
    public Teacher(String name,int age,String school){
        super(name,age);
        this.school = school;
    }

    public String getSchool() {
        return school;
    }
    public void setSchool(String school){
        this.school = school;
    }
}
