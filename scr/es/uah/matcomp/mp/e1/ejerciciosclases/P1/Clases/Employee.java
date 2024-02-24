package es.uah.matcomp.mp.e1.ejerciciosclases.P1.Clases;

public class Employee {
    private final int id;
    private final String firstName;
    private final String lastName;
    private int salary;

    ////////////////////
    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }
    /////////////////////

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAnnualSalary() {
        return salary * 12;
    }

    public double raiseSalary(double percent) {
        return salary * (percent / 100) + salary;
    }

    /***
     * Hemos cambiado el Main porque no funcionaba al tener que trabajar con datos decimales
     */
    public String toString() {
        return "Employee[id= " + id + ", name= " + firstName + " " + lastName + ", salary= " + salary + "]";
    }
}
