package Practice.DeitelExercises.Chapter3;

public class Clock {
    private int hour;
    private int minutes;
    private int seconds;

    public Clock (int hour, int minutes, int seconds) {
        this.hour = hour;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public void setHour(int hour) {
        if (hour>= 0 && hour < 24) {
            this.hour = hour;
        }
    }
    public void setMinutes(int minutes) {
        if (minutes >= 60) {
            hour += (minutes / 60);
            minutes  %= 60;
        }
        if (minutes>= 0) {
            this.minutes = minutes;
        }
    }
    public void setSeconds(int seconds) {
        if (seconds >= 60) {
            minutes += (seconds / 60);
            seconds %= 60;
        }
        if (seconds>= 0) {
            this.seconds = seconds;
        }
    }
    public int getHour() {
        return hour;
    }
    public int getMinutes() {
        return minutes;
    }
    public int getSeconds() {
        return seconds;
    }
    public String displayTime() {
        return getHour() + ":" + getMinutes() + ":" + getSeconds();
    }
}
