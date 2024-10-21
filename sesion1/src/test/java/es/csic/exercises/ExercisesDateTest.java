package es.csic.exercises;

import java.util.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class ExercisesDateTest {

	/**
	 * Ejercicio 0
	 * Crear una función que devuelva la fecha actual y la imprima por pantalla
	 */
	@Test
	public void  getCurrentDateTest() {
		LocalTime time = ExercisesDate.getCurrentDate("es");
		Assert.assertEquals(time.getHour(),LocalTime.now().getHour());
	}

	/**
	 * Ejercicio 1
	 * Crear un calendario y un objeto Date a partir del calendario
	 */
	@Test
	public void  getDateFromCalendarTest() {
		Date date = ExercisesDate.getDateFromCalendar(2023, 10, 9);
		Assert.assertEquals(date.toString(),"Thu Nov 09 00:00:00 CET 2023");
	}

	/**
	 * Ejercicio 2
	 * Crear una función que devuelva la hora actual de una región
	 */
	@Test
	public void  getTimeInTest() {
		Date date = ExercisesDate.getTimeIn("Europe/Madrid");
		System.out.println("Ejercicio 3 " + date.toString());
	}

	/**
	 * Ejercicio 3
	 * Crear una función que devuelva el último día del mes
	 */
	@Test
	public void  getLastMonthDayTest() {
		int day = ExercisesDate.getLastMonthDay();
		Assert.assertEquals(31, day);
	}

	/**
	 * Ejercicio 4
	 * Crear una función que imprima por pantalla los días de la semana en un determinado idioma
	 */
	@Test
	public void  getDaysOfWeekTest() {
		int day = ExercisesDate.getLastMonthDay();
		Assert.assertEquals(31, day);
	}

	/**
	 * Ejercicio 5
	 * Crear una función que sume horas a la fecha actual
	 */
	@Test
	public void  addHoursTest() {
		LocalTime localtime = ExercisesDate.addHours(2);
		System.out.println("Ejercicio 5 " + localtime.toString());
	}

	/**
	 * Ejercicio 6
	 * Crear una función que sume días a la fecha actual
	 */
	@Test
	public void  addDaysTest() {
		Date date = ExercisesDate.addDays(1);
		System.out.println("Ejercicio 6 " + date.toString());
	}

	/**
	 * Ejercicio 7
	 * Crear una función que devuelva los días entre dos fechas
	 */
	@Test
	public void  daysBetweenTest() {
		int days = ExercisesDate.daysBetween(LocalDate.of(2023, 5, 25), LocalDate.of(2023, 5, 29));
		Assert.assertEquals(4, days);
	}

	/**
	 * Ejercicio 8
	 * Crear una función que imprima por pantalla una fecha en los siguientes formatos:
        2023-05-16
        16::May::2023 11::46::01
	 */
	@Test
	public void  formatDateTest() {
		ExercisesDate.formatDate(LocalDateTime.of(2023, 5, 25, 12, 0, 0));
	}

	/**
	 * Ejercicio 9
	 * Crear una función que dado un String devuelva una fecha.
	 */
	@Test
	public void  parseDatesTest() {
		LocalDate date = ExercisesDate.parseDates("2023-05-25");
		Assert.assertEquals("2023-05-25", date.toString());
	}

	/**
	 * Ejercicio 10
	 * Crear una función que dada un String devuelva una fecha con tiempo.
	 */
	@Test
	public void  parseDates2Test() {
		LocalDateTime date = ExercisesDate.parseDates2("2023-05-25T12:00:00");
		Assert.assertEquals("2023-05-25T12:00", date.toString());
	}




}
