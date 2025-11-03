package sample;

public class Employee {
    private String name;
    private int ID;
    private String department;
    public Employee(String name,int ID,String department){
        this.name=name;
        this.ID=ID;
        this.department=department;
    }
    
    public String getName() {
        return name;
    }
    public int getID() {
        return ID;
    }
    public String getDepartment() {
        return department;
    }
  public void displayEmployeeDetails()   {
    System.out.println("Employee name: "+name+"\n Employee ID: "+ID+"\n Department: "+department);
  }
}

