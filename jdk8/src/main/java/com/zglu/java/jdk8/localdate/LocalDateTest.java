package com.zglu.java.jdk8.localdate;

import lombok.extern.log4j.Log4j2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;

/**
 * 测试java8特性LocalDate
 *
 * @author zglu
 */
@Log4j2
public class LocalDateTest {
    public static void main(String[] args) {
        var localDate = LocalDate.now();
        log.info(localDate);
        var time = LocalDateTime.now();
        log.info(time);
        log.info(time.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL, FormatStyle.MEDIUM)));
        var zonedDateTime = ZonedDateTime.now();
        log.info(zonedDateTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL)));
        log.info(time.plusDays(1));
        log.info(time.withDayOfMonth(1));
        Date date = Date.from(zonedDateTime.toInstant());
        log.info(date);
        time = LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault());
        log.info(time);
        zonedDateTime = ZonedDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault());
        log.info(zonedDateTime);
    }
}