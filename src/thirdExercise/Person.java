package thirdExercise;

import java.util.Date;

public abstract class Person {
    private String firstName;
    private String lastName;
    private int birthdayYear;

    public Person(String firstName, String lastName, int birthdayYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthdayYear = birthdayYear;
    }

    public int getAge(){
        return (2024-birthdayYear);
    }

    public String getLastName() {
        return lastName;
    }
}
