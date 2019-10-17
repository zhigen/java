package com.zglu.java.jdk8.localdate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;

public class LocalDateTest {
    public static void main(String[] args) {
        var localDate = LocalDate.now();
        System.out.println(localDate);
        var time = LocalDateTime.now();
        System.out.println(time);
        System.out.println(time.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL, FormatStyle.MEDIUM)));
        var zonedDateTime = ZonedDateTime.now();
        System.out.println(zonedDateTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL)));
        System.out.println(time.plusDays(1));
        System.out.println(time.withDayOfMonth(1));
        Date date = Date.from(zonedDateTime.toInstant());
        System.out.println(date);
        time = LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault());
        System.out.println(time);
        zonedDateTime = ZonedDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault());
        System.out.println(zonedDateTime);
    }
}
