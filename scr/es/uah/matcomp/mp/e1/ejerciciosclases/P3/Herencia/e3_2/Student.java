package es.uah.matcomp.mp.e1.ejerciciosclases.P3.Herencia.e3_2;

public class Student extends Person {
    String program;
    Integer year;
    double fee;

    ///////////////
    public Student(String name, String address, String program, int year, double fee) {
        super(name, address);
        this.year=year;
        this.program=program;
        this.fee=fee;
    }
    //////////////////

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    @Override
    public String toString(){
        return "Student["+super.toString()+", program= "+program+", year= "+year+", fee= "+fee+"]";
    }
}
