package thirdExercise;

public class Employee extends Person{
    private int hireDate;
    private String companyName;
    private int salary;
    public Employee(String firstName, String lastName, int birthdayYear, int hireDate, String companyName, int salary) {
        super(firstName, lastName, birthdayYear);
        this.hireDate = hireDate;
        this.companyName = companyName;
        this.salary = salary;
    }
    private int getJobSeniority(){
        return 2024-hireDate;
    }
    public int getSalary() {
        return salary;
    }
}
