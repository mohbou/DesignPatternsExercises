package main.miscellaneous;

public class Alarm {
    private int hour;
    private int minute;


    public Alarm() {
        minute  =0;
        hour =0;
    }

    public int getHour() {

        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public boolean setTime(int hour, int minute) {
        if(hour >23 || hour < 0 || minute > 59 || minute < 0) {
            return false;
        }
        else {

        this.hour = hour;
        this.minute = minute;
        return true;}

    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append(hour);
        sb.append(":");
        if(minute <10)
        sb.append("0"+minute);
        else
        sb.append(minute);
        if(hour>12 && hour<24)
            sb.append("PM");
        else
            sb.append("AM");
        return sb.toString();
    }
}
