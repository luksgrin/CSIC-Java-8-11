package es.csic.exercises;

import java.text.DateFormatSymbols;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class ExercisesDateResolved {

	
	// ----------- Ejercicio 0 ----------
    public static LocalTime getCurrentDate(String locale){
        LocalTime now = LocalTime.now();
        System.out.println("Ejercicio 0 Local time now : " + now);
        return now;
    }

    // ----------- Ejercicio 1 ----------
    public static Date getDateFromCalendar(int year, int month, int day){
        Calendar cal = Calendar.getInstance();
        cal.clear();
        cal.set(Calendar.YEAR, year);
        cal.set(Calendar.MONTH, month);
        cal.set(Calendar.DATE, day);

        return cal.getTime();
    }
    
    // ----------- Ejercicio 2 ----------
    public static Date getTimeIn(String region){
        ZoneId zoneId = ZoneId.of(region);
        Calendar cal = Calendar.getInstance();

        cal.setTimeZone(TimeZone.getTimeZone(zoneId));
        return cal.getTime();
    }
    
    // ----------- Ejercicio 3 ----------
    public static int getLastMonthDay(){
        Calendar calendar = Calendar.getInstance();
        return calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
    }
    
    // ----------- Ejercicio 4 ----------
    public static void getDaysOfWeek(String locale){
        DateFormatSymbols symbols = new DateFormatSymbols(new Locale(locale));
        String[] dayNames = symbols.getWeekdays();
        for (String s : dayNames) {
            System.out.println(s);
        }
    }

    // ----------- Ejercicio 5 ----------
    public static LocalTime addHours(int hours){
        LocalTime time = LocalTime.now();
        LocalTime newTime = time.plusHours(hours);
        System.out.println("Time after 2 hours : " + newTime);
        return newTime;
    }

    // ----------- Ejercicio 6 ----------
    public static Date addDays(int days){
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DAY_OF_YEAR, days);
        return cal.getTime();
    }

    // ----------- Ejercicio 7 ----------
    public static int daysBetween(LocalDate d1, LocalDate d2){
        Period diff = Period.between(d1, d2);
        return diff.getDays() ;
    }

    // ----------- Ejercicio 8 ----------
    public static void formatDate(LocalDateTime dateTime){
        LocalDate localDate = dateTime.toLocalDate();
        System.out.println(localDate.format(DateTimeFormatter.ofPattern("d::MMM::uuuu")));
        System.out.println(dateTime.format(DateTimeFormatter.ofPattern("d::MMM::uuuu HH::mm::ss")));
    }

    // ----------- Ejercicio 9 ----------
    public static LocalDate parseDates(String date){
        return LocalDate.parse(date);
    }

    // ----------- Ejercicio 10 ----------
    public static LocalDateTime parseDates2(String date){
        return LocalDateTime.parse(date);
    }
}
