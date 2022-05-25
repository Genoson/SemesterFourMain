package com.qap1_ssquire;
// Class for problem 2 of QAP1 (Java)
// Coded by Stephen Squire
// Date: 05/15/2022

// Declaring the class Time
public class Time {

    // Declaring the variables
    private int hour, minute, second;

    // Declaring constraint functions for the variables
    private static void hourConstraint(int hour) {
        if (hour < 0 || hour > 23) {
            throw new IllegalArgumentException("Hour must be between 0 and 23.");
        }
    }

    private static void minuteConstraint(int minute) {
        if (minute < 0 || minute > 59) {
            throw new IllegalArgumentException("Minute must be between 0 and 59.");
        }
    }

    private static void secondConstraint(int second) {
        if (second < 0 || second > 59) {
            throw new IllegalArgumentException("Second must be between 0 and 59.");
        }
    }

    //Declaring the constructor
    public Time(int hour, int minute, int second) {
        hourConstraint(hour);
        minuteConstraint(minute);
        secondConstraint(second);
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    //Declaring the getters
    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    //Declaring the setters
    public void setHour(int hour) {
        hourConstraint(hour);
        this.hour = hour;
    }

    public void setMinute(int minute) {
        minuteConstraint(minute);
        this.minute = minute;
    }

    public void setSecond(int second) {
        secondConstraint(second);
        this.second = second;
    }

    public void setTime(int hour, int minute, int second) {
        hourConstraint(hour);
        minuteConstraint(minute);
        secondConstraint(second);
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    //Declaring the toString method
    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    // declaring methods to increment and decrement the time, by seconds
    public Time nextSecond() {
        second++;
        if (second == 60) {
            second = 0;
            minute++;
            if (minute == 60) {
                minute = 0;
                hour++;
                if (hour == 24) {
                    hour = 0;
                }
            }
        }
        return this;
    }

    public Time previousSecond() {
        second--;
        if (second == -1) {
            second = 59;
            minute--;
            if (minute == -1) {
                minute = 59;
                hour--;
                if (hour == -1) {
                    hour = 23;
                }
            }
        }
        return this;
    }

}

