package sample;

public class Employee {
    private String name;
    private int ID;
    private String department;
    public void setName(String name) {
        this.name = name;
    }
    public void setID(int iD) {
        ID = iD;
    }
    public void setDepartment(String department) {
        this.department = department;
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
