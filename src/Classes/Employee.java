package Classes;

public class Employee extends Person{
    private int employeeId;
    public Employee(String name,int age,int employeeId){
        super(name,age);
        this.employeeId = employeeId;
    }
    public int getEmployeeId(){
        return employeeId;
    }
    public void setEmployeeId(int employeeId){
        this.employeeId = employeeId;
    }
}
