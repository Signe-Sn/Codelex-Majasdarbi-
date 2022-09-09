package io.codelex.typesandvariables.practice;

import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        int distance;
        int hours;
        int minutes;
        int seconds;

        Scanner num = new Scanner(System.in);
        System.out.println("Please enter distance (in meters): ");
        distance = num.nextInt();
        System.out.println("Please enter the time taken in hours: ");
        hours = num.nextInt();
        System.out.println("Please enter the time taken in minutes: ");
        minutes = num.nextInt();
        System.out.println("Please enter the time taken in seconds: ");
        seconds = num.nextInt();

        float timeInSeconds = (hours * 3600) + (minutes * 60) + seconds;
        float timeInHours = timeInSeconds / 3600.0f;
        float metersToKm = distance / 1000.0f;
        float metersASecond = distance / timeInSeconds;
        float kmAnHour = metersToKm / timeInHours;
        float milersPerHour = kmAnHour / 1.609f;

        System.out.println("Your speed in meters/second is " + metersASecond);
        System.out.println("Your speed in km/hour is " + kmAnHour);
        System.out.println("Your speed in miles/hour is " + milersPerHour);
    }
}