package es.csic.examples;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.Set;

public class DateTimeExample {
    public static void main(String args[])
    {
        localTimeExample();
        localDateTimeExample();
        localDateTimeExample();
        zoneDateTimeExample();
        offsetExample();
        periodDurationExample();
    }

    private void localDateExample(){
        // LocalDate
        LocalDate localDate = LocalDate.now();
        // Parsear fechas
        LocalDate.of(2023, 05, 24);
        LocalDate.parse("2023-05-24");
        // Sumar/restar fechas
        LocalDate tomorrow = LocalDate.now().plusDays(1);
        LocalDate previousMonthSameDay = LocalDate.now().minus(1, ChronoUnit.MONTHS);
        // Consultar fechas concretas
        DayOfWeek dayOfWeek = LocalDate.parse("2023-05-24").getDayOfWeek();
        int dayOfMonth = LocalDate.parse("2023-05-24").getDayOfMonth();
        boolean leapYear = LocalDate.now().isLeapYear();
        boolean notBefore = LocalDate.parse("2023-05-24").isBefore(LocalDate.parse("2024-05-24"));
        boolean isAfter = LocalDate.parse("2023-05-24").isAfter(LocalDate.parse("2019-01-23"));
    }

    private static void localTimeExample(){
        // LocalTime
        LocalTime now = LocalTime.now();
        // Parsear horas
        LocalTime parseHour = LocalTime.parse("11:30");
        LocalTime parseHour2 = LocalTime.of(1, 30);
        // Sumar/restar horas
        LocalTime nextHour = LocalTime.parse("11:30").plus(1, ChronoUnit.HOURS);
        // Consultar horas
        int eleven = LocalTime.parse("11:30").getHour();
        boolean isbefore = LocalTime.parse("11:30").isBefore(LocalTime.parse("07:30"));
    }

    private static void localDateTimeExample(){
        // LocalDateTime
        LocalDateTime localDateTime = LocalDateTime.now();
        // Parsear fechas
        LocalDateTime.of(2023, Month.MAY, 24, 9, 30);
        LocalDateTime.parse("2023-05-24T09:30:00");
        // Sumar/restar dias/horas
        localDateTime.plusDays(1);
        localDateTime.minusHours(2);
        // Consultar fechas
        localDateTime.getMonth();
    }

    private static void zoneDateTimeExample(){
        // ZoneDateTime AP
        ZoneId zoneId = ZoneId.of("Europe/Madrid");
        // Obtener el listado de identificadores de zonas
        Set<String> allZoneIds = ZoneId.getAvailableZoneIds();
        // Convertir la hora local a una zona horaria específica
        LocalDateTime localDateTime = LocalDateTime.now();
        ZonedDateTime zonedDateTime = ZonedDateTime.of(localDateTime, zoneId);
        ZonedDateTime.parse("2023-05-24T11:30:20+01:00[Europe/Madrid]");
    }

    private static void offsetExample(){
        // Offset
        LocalDateTime lDateTime = LocalDateTime.of(2023, Month.MAY, 24, 8, 30);
        // Añadir 1 hora mediante un offset
        ZoneOffset offset = ZoneOffset.of("+01:00");
        LocalDateTime localDateTime = LocalDateTime.now();
        OffsetDateTime offSetOne = OffsetDateTime.of(localDateTime, offset);
        // Resultado: 2023-05-24 8:30 +01:00
    }

    private static void periodDurationExample(){
        // Period
        LocalDate initialDate = LocalDate.parse("2023-05-24");
        LocalDate finalDate = initialDate.plus(Period.ofDays(10));
        // Calcular el tiempo transcurrido entre dos fechas
        int period = Period.between(initialDate, finalDate).getDays();
        long daysBetween = ChronoUnit.DAYS.between(initialDate, finalDate);

        // Duration
        LocalTime initTime = LocalTime.of(5, 15, 0);
        LocalTime finalTime = initTime.plus(Duration.ofSeconds(40));
        // Calcular el tiempo transcurrido entre dos horas
        long duration = Duration.between(initTime, finalTime).getSeconds();
        long duration2 = ChronoUnit.SECONDS.between(initTime, finalTime);
    }
}
