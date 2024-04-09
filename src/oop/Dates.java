package oop;

public class Dates {
    int day, month, year;
    public Dates(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    void printDDMM() {
        System.out.printf(day + "." + year);
    }

    void printDDMMYY() {
        System.out.printf(day + "." + month + "." + year);
    }

    boolean isLeapYear() {
        return year % 4 == 0 & year % 100 != 0;
    }
}
