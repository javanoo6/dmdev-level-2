package com.javanoo6.oop.lesson7.task1;

public class TimeInterval {
    private int seconds;
    private int minutes;
    private int hours;

    public TimeInterval(int seconds) {
        checkInput(seconds);
        this.hours = seconds / 3600;
        seconds %= 3600;
        this.minutes = seconds / 60;
        this.seconds = seconds % 60;
    }

    public TimeInterval(int seconds, int minutes, int hours) {
        checkInput(seconds, minutes, hours);
        this.seconds = seconds % 60;
        this.minutes = (seconds / 60 + minutes) % 60;
        this.hours = hours + minutes / 60 + seconds / 3600;
    }

    public int getTotalSeconds() {
        return seconds + minutes * 60 + hours * 60 * 60;
    }

    public void printTotalSeconds() {
        System.out.println("Seconds: " + getTotalSeconds());
    }

    public TimeInterval sum(TimeInterval second) {
        return new TimeInterval(getTotalSeconds() + second.getTotalSeconds());
    }

    public void print() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "HOURS " + hours + ", MINUTES " + minutes + ", SECONDS " + seconds;
    }

    private void checkInput(int seconds) {
        checkInput(seconds, 0 , 0);
    }

    private void checkInput(int seconds, int minutes, int hours) {
        if (seconds < 0 || minutes < 0 || hours < 0) {
            throw new IllegalArgumentException("NEGATIVE VALUES! https://www.youtube.com/watch?v=3xYXUeSmb-Y");
        }
    }
}
