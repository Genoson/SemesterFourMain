package AdvancedProgramming.Week2.lab2_SSquire.Exe2_5;


public class Date {
    // implement a range on the date variables
    private int day, month, year;

    public Date() {
        day = 1;
        month = 1;
        year = 1900;
    }

    public Date(int dayArg, int monthArg, int yearArg) {
        if (yearArg <1000 || yearArg > 9999) {
            throw new IllegalArgumentException("Year must be between 1000 and 9999");
        } 
        if (monthArg < 1 || monthArg > 12) {
            throw new IllegalArgumentException("Month must be between 1 and 12");
        } 
         if (dayArg < 1 || dayArg > 31) {
            throw new IllegalArgumentException("Day must be between 1 and 31");
        }
        day = dayArg;
        month = monthArg;
        year = yearArg;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int dayArg) {
        if (dayArg < 1 || dayArg > 31) {
            throw new IllegalArgumentException("Day must be between 1 and 31");
        }
        day = dayArg;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int monthArg) {
        if (monthArg < 1 || monthArg > 12) {
            throw new IllegalArgumentException("Month must be between 1 and 12");
        }
        month = monthArg;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int yearArg) {
        if (yearArg <1000 || yearArg > 9999) {
            throw new IllegalArgumentException("Year must be between 1000 and 9999");
        }
        year = yearArg;
    }

    public void setDate (int dayArg, int monthArg, int yearArg) {
        if (yearArg <1000 || yearArg > 9999) {
            throw new IllegalArgumentException("Year must be between 1000 and 9999");
        }
        if (monthArg < 1 || monthArg > 12) {
            throw new IllegalArgumentException("Month must be between 1 and 12");
        } 
         if (dayArg < 1 || dayArg > 31) {
            throw new IllegalArgumentException("Day must be between 1 and 31");
        }
        day = dayArg;
        month = monthArg;
        year = yearArg;
    }

    public String toString() {
        if (day < 10 && month < 10) {
            return "0" + day + "/0" + month + "/" + year;
        } else if (month < 10) {
            return day + "/" + "0" + month + "/" + year;
        } else if (day < 10) {
            return "0" + day + "/" + month + "/" + year;
        } else {
            return day + "/" + month + "/" + year;
        }
        
    }

}
