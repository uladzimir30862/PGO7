package thirdExercise;

public class Manager extends Employee{
    private final int bonus;

    public Manager(String firstName, String lastName, int birthdayYear, int hireDate, String companyName, int salary, int bonus) {
        super(firstName, lastName, birthdayYear, hireDate, companyName, salary);
        this.bonus = bonus;
    }

    public int getSalary() {
        return super.getSalary()+bonus;
    }

    public String toString() {
        return "Manager with lastName " + getLastName() + " and age " + getAge() + " has salary " + getSalary();
    }
}
