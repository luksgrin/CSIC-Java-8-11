package es.csic.exercises;

import java.text.DateFormatSymbols;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class ExercisesDate {
	
	// ----------- Ejercicio 0 ----------
    public static LocalTime getCurrentDate(String locale){
        return LocalTime.of(12, 15);
    }

    // ----------- Ejercicio 1 ----------
    public static Date getDateFromCalendar(int year, int month, int day){
        return new Date();
    }
    
    // ----------- Ejercicio 2 ----------
    public static Date getTimeIn(String region){
        return new Date();
    }
    
    // ----------- Ejercicio 3 ----------
    public static int getLastMonthDay(){
        return 0;
    }
    
    // ----------- Ejercicio 4 ----------
    public static void getDaysOfWeek(String locale){
        // To Implement
    }

    // ----------- Ejercicio 5 ----------
    public static LocalTime addHours(int hours){
        return LocalTime.of(12, 15);
    }

    // ----------- Ejercicio 6 ----------
    public static Date addDays(int days){
        return new Date();
    }

    // ----------- Ejercicio 7 ----------
    public static int daysBetween(LocalDate d1, LocalDate d2){
        return 0;
    }

    // ----------- Ejercicio 8 ----------
    public static void formatDate(LocalDateTime dateTime){
        // TO IMPLEMENT
    }

    // ----------- Ejercicio 9 ----------
    public static LocalDate parseDates(String date){
        return LocalDate.now();
    }

    // ----------- Ejercicio 10 ----------
    public static LocalDateTime parseDates2(String date){
        return LocalDateTime.now();
    }
}
