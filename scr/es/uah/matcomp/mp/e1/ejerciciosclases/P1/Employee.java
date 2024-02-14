package es.uah.matcomp.mp.e1.ejerciciosclases.P1;

public class Employee {
    int id;
    String firstName;
    String lastName;
    int salary;

    public void employee(int id, String FN, String LN, int Sal) {
        this.firstName = FN;
        this.id = id;
        this.lastName = LN;
        this.salary = Sal;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public String getName(){
        return firstName+" "+lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public int getAnnualSalary(){
        return salary*12;
    }
    public double raiseSalary(double percent){
        return salary*(percent/100)+salary;
    }

    /***
     * Hemos cambiado el Main porque no funcionaba al tener que trabajar con datos decimales
     */
    public String toString() {
        return "Employee[id= " + id +", name= "+firstName+" "+lastName+", salary= "+salary+"]";
    }
}
