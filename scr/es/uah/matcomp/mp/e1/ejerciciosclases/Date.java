package es.uah.matcomp.mp.e1.ejerciciosclases;

public class Date {
    int day;
    int month;
    int year;

    public void date(int day, int month, int year){
        this.day=day;
        this.month=month;
        this.year=year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public void setDate(int day, int month, int year){
        this.day=day;
        this.month=month;
        this.year=year;
    }

    public String toString() {
        String days;
        String months;
        if (day<10){
            days = "0" + day;
        }else{
            days= String.valueOf(day);
        }
        if (month<10){
            months="0"+month;
        }else {
            months = String.valueOf(month);
        }
        return days+"/"+months+"/"+year;
    }
}
