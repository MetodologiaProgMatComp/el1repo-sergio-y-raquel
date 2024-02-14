package es.uah.matcomp.mp.e1.ejerciciosclases.P1;

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

    public Time nextSecond(){
        Time obj = new Time();
        obj.second=second;
        obj.hour=hour;
        obj.minute=minute;
        obj.second+=1;
        if (obj.second==60){
            obj.minute+=1;
            obj.second=0;
        }
        if (obj.minute==60) {
            obj.hour += 1;
            obj.minute = 0;
        }
        if (obj.hour==24) {
            obj.hour=0;
        }
        return obj;
    }
    public Time previousSecond(){
        Time obj = new Time();
        obj.second=second;
        obj.hour=hour;
        obj.minute=minute;
        obj.second-=1;
        if (obj.second<0){
            obj.minute-=1;
            obj.second=59;
        }
        if (obj.minute<0) {
            obj.hour -= 1;
            obj.minute = 59;
        }
        if (obj.hour<0) {
            obj.hour=23;
        }
        return obj;
    }
}
