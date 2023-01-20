package com.linkedin.javacodechallenges;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;

public class App {
    public static LocalDate calculateHundredDaysFromNow(LocalDate today) {
        Period hundredDays = Period.ofDays(200);
        System.out.println(today);
        System.out.println(hundredDays);
        return today.plus(hundredDays);
    }

    public static void main(String[] args) {
        LocalDate today = LocalDate.now(ZoneId.of("Asia/Ho_Chi_Minh"));
        System.out.println("100 days from now is... " +
                calculateHundredDaysFromNow(today));
    }
}
