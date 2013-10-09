package Kata0;

import java.util.Date;

public class Student {

    private String name;
    private Date birthDate;

    public Student(String name, Date birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public Date getDate() {
        return birthDate;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return calculateAge();
    }

    private Date today() {
        return new Date();
    }

    private int calculateAge() {
        return (int) (GetYearsInDays(GetDaysInHours(GetHoursInMinutes(GetMinutesInSeconds(GetSecondsInMiliseconds(today().getTime() - birthDate.getTime()))))));
    }

    private long GetYearsInDays(long days) {
        return (int) (days / 365.25);
    }

    private long GetDaysInHours(long hours) {
        return hours / 24;
    }

    private long GetHoursInMinutes(long minutes) {
        return minutes / 60;
    }

    private long GetMinutesInSeconds(long seconds) {
        return seconds / 60;
    }

    private long GetSecondsInMiliseconds(long miliseconds) {
        return miliseconds / 1000;
    }
}