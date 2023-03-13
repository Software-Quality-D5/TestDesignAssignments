package com.adamtharani.nextdate;

import org.joda.time.DateTime;

import org.joda.time.IllegalFieldValueException;

/**
 * Hello world!
 *
 */
public class NextDate {
    private DateTime date;
    private DateTime tomorrow;

    public NextDate(int day, int month, int year) {
        if (day < 1 || day > 31 || month < 1 || month > 12 || year < 1812 || year > 2212) {
            throw new IllegalArgumentException("Invalid");
        }
        try {
            this.date = new DateTime(year, month, day, 0, 0);
        } catch (IllegalFieldValueException e) {
            throw new IllegalArgumentException("Invalid");
        }
    }

    public void calulateNextDay() {
        this.tomorrow = date.plusDays(1);;
    }

    public String getNextDate() {
        calulateNextDay();
        return tomorrow.getDayOfMonth() + "/" + tomorrow.getMonthOfYear() +"/" + tomorrow.getYear();
    }

    public static void main(String[] args) {
        NextDate nextDate = new NextDate(1, 1, 2018);
        nextDate.getNextDate();
    }
}
