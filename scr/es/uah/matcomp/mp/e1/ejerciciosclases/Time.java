package es.uah.matcomp.mp.e1.ejerciciosclases;

public class Time {
    int hour;
    int minute;
    int second;
    public void time(int h, int m, int s){
        this.hour=h;
        this.minute=m;
        this.second=s;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }
    public void setTime(int h,int m, int s){
        this.hour=h;
        this.minute=m;
        this.second=s;
    }
    public String toString() {
        String hours;
        String minutes;
        String seconds;
        if (hour<10){
            hours = "0" + hour;
        }else{
            hours= String.valueOf(hour);
        }
        if (minute<10){
            minutes="0"+minute;
        }else {
            minutes = String.valueOf(minute);
        }
        if (second<10){
            seconds="0"+second;
        }else {
            seconds = String.valueOf(second);
        }
        return hours+":"+minutes+":"+seconds;
    }
    public String nextSecond(){
        second+=1;
        if (second==60){
            minute+=1;
            second=0;
        }
        if (minute==60) {
            hour += 1;
            minute = 0;
        }
        if (hour==24) {
            hour=0;
        }
        return toString();
    }
    public String previousSecond(){
        second-=1;
        if (second<0){
            minute-=1;
            second=59;
        }
        if (minute<0) {
            hour -= 1;
            minute = 59;
        }
        if (hour<0) {
            hour=23;
        }
        return toString();
    }
}
