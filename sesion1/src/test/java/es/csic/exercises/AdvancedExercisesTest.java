package es.csic.exercises;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;


@RunWith(JUnit4.class)
public class AdvancedExercisesTest {
	
	/**
	 * Ejercicio 1
	 * Crear una implementación de la función "map" usando solo las funciones "reduce" y expresiones lambda.
	 */
	@Test
	public void  mapTest() {
		int suma = ExercisesLambdas.sum(3 , 2);
		Assert.assertEquals(suma,5);
	}
	
	/**
	 * Ejercicio 2
	 *  Crear una implementación de la función "filter" usando solo las funciones "reduce" y expresiones lambda.
	 */
	@Test
	public void  filterTest() {
		int suma = ExercisesLambdas.sum(3 , 2);
		Assert.assertEquals(suma,5);
	}

}