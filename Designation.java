package sample;

abstract class Designation extends Employee{

    // public void performDuties() {
    //     // TODO Auto-generated method stub
    //     throw new UnsupportedOperationException("Unimplemented method 'performDuties'");
    // }

    String position;
    int level;
   public Designation(String name, String id, String department, String position, String level) {
        super(name, id, department);
        this.position = position;
        this.level = level;
    }

    public String getPosition(){
        return position;
    }
    public int getLevel(){
        return level;
    }
public abstract double calculateBonus();
    public abstract String performDuties();

}
