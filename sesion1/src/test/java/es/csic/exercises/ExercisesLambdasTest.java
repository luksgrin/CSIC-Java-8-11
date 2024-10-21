package es.csic.exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import es.csic.models.Album;
import es.csic.models.Artist;
import es.csic.models.Track;


@RunWith(JUnit4.class)
public class ExercisesLambdasTest {
	
	/**
	 * Ejercicio 0
	 * Implementar una interfaz "SumCalculator" que permita sumar dos números mediante una función lambda 
	 */
	@Test
	public void  sumCalculatorTest() {
		int suma = ExercisesLambdas.sum(3 , 2);
		Assert.assertEquals(suma,5);
	}

	/**
	 * Ejercicio 1
	 * Crear Expresión lambda para concatenar dos Strings 
	 */
	@Test
	public void  concatTest() {
		String concatStr = ExercisesLambdas.concat("Hola " , "Mundo");
		Assert.assertEquals("Hola Mundo",concatStr);
	}
	
	/**
	 * Ejercicio 2
	 * Crear una expresion lambda para convertir una lista de strings a minusculas 
	 */
	@Test
	public void  listToLowerCaseTest() {
		List<String> list = getListUpperCase();
		List<String> listLowerCase = ExercisesLambdas.listToLowerCase(list);
		Assert.assertEquals("alberto",listLowerCase.get(0));
		Assert.assertEquals("juan", listLowerCase.get(1));
		Assert.assertEquals("pedro", listLowerCase.get(2));
	}
	
	
	private List<String> getListUpperCase() {
		List<String> list = new ArrayList<>();
		list.add("Alberto");
		list.add("JuAn");
		list.add("pEdrO");
		return list;
	}
	
	
	/**
	 * Ejercicio 3
	 * Expresión lambda para filtrar los números pares de una lista 
	 */
	@Test
	public void  getEvenNumbersTest() {
		List<Integer> list = getListOddNumbers();
		List<Integer> listOddNumbers = ExercisesLambdas.getEvenNumbers(list);
		Assert.assertEquals(Integer.valueOf(2),listOddNumbers.get(0));
		Assert.assertEquals(Integer.valueOf(4), listOddNumbers.get(1));
	}
	
	private List<Integer> getListOddNumbers() {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		return list;
	}
	
	/**
	 * Ejercicio 4
	 *  Expresión lambda para ordenar una lista de Strings alfabéticamente 
	 */
	@Test
	public void  sortListTest() {
		List<String> list = getSortList();
		List<String> listSorted = ExercisesLambdas.sortList(list);
		Assert.assertEquals("Antonio",listSorted.get(0));
		Assert.assertEquals("Julio", listSorted.get(1));
		Assert.assertEquals("Paco", listSorted.get(2));

	}
	
	private List<String> getSortList() {
		List<String> list = new ArrayList<>();
		list.add("Paco");
		list.add("Antonio");
		list.add("Julio");
		return list;
	}
	

	/**
	 * Ejercicio 5
	 *  Expresión lambda para calcular la media en una lista de doubles 
	 */
	@Test
	public void  getAverageTest() {
		List<Double> list = getDoubleList();
		Double average = ExercisesLambdas.getAverage(list);
		Assert.assertEquals(Double.valueOf(4),average);

	}
	
	private List<Double> getDoubleList() {
		List<Double> list = new ArrayList<>();
		list.add(4.5);
		list.add(3.0);
		list.add(4.5);
		return list;
	}
	
	/**
	 * Ejercicio 6
	 *  Expresión lambda para eliminar duplicados en una lista de números 
	 */
	@Test
	public void  removeDuplicatesTest() {
		List<Integer> list = getListDuplicatesNumbers();
		List<Integer> distinctNumbers = ExercisesLambdas.removeDuplicates(list);
		Integer fourMatchs = 0;
		Integer threeMatchs = 0;
		for(Integer number: distinctNumbers) {
			if(4 == number) {
				fourMatchs++;
			}
			if(3 == number) {
				threeMatchs++;
			}
		}
		Assert.assertEquals(Integer.valueOf(1), fourMatchs);
		Assert.assertEquals(Integer.valueOf(1), threeMatchs);
	}
	
	private List<Integer> getListDuplicatesNumbers() {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(4);
		list.add(3);
		list.add(3);
		list.add(4);
		return list;
	}
	
	/**
	 * Ejercicio 7
	 *  Expresión lambda para devolver el número más grande de una lista de Integers 
	 */
	@Test
	public void  getMaxTest() {
		List<Integer> list = getMaxNumbers();
		Integer maxNumber = ExercisesLambdas.getMax(list);
		Assert.assertEquals(Integer.valueOf(4),maxNumber);

	}
	
	private List<Integer> getMaxNumbers() {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		return list;
	}
	
	/**
	 * Ejercicio 8
	 *  Expresión lambda para multiplicar todos los elementos de una lista de enteros 
	 */
	@Test
	public void  sumMultiplyAllTest() {
		List<Integer> list = getNumbers();
		Integer result = ExercisesLambdas.sumMultiplyAll(list);
		Assert.assertEquals(Integer.valueOf(24),result);

	}
	
	private List<Integer> getNumbers() {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		return list;
	}
	
	/**
	 * Ejercicio 9
	 *  Expresión lambda para sumar todos los elementos de una lista de enteros 
	 */
	@Test
	public void  sumTotalTest() {
		List<Integer> list = getNumbers();
		Integer result = ExercisesLambdas.sumTotal(list);
		Assert.assertEquals(Integer.valueOf(10),result);

	}
	
	/**
	 * Ejercicio 10
	 *  Expresión lambda para obtener un array de strings con los valores de nombre y nacionalidad de cada artista 
	 */
	@Test
	public void  getNamesAndOriginsTest() {
		List<Artist> list = getArtists();
		List<String> result = ExercisesLambdas.getNamesAndOrigins(list);
		Assert.assertEquals("Bach" ,result.get(0));
		Assert.assertEquals("Alemania" ,result.get(1));
		Assert.assertEquals("Mozart" ,result.get(2));
		Assert.assertEquals("Austria" ,result.get(3));
		Assert.assertEquals("Chopin" ,result.get(4));
		Assert.assertEquals("Polonia" ,result.get(5));
	}
	
	private List<Artist> getArtists() {
		List<Artist> artists = new ArrayList<>();
		Artist artistBach = new Artist("Bach", "Alemania");
		Artist artistMozart = new Artist("Mozart", "Austria");
		Artist artistChopin = new Artist("Chopin", "Polonia");
		artists.add(artistBach);
		artists.add(artistMozart);
		artists.add(artistChopin);
		return artists;
	}
	
	/**
	 * Ejercicio 11
	 *  Expresión lambda para obtener albums con al menos 3 canciones 
	 */
	@Test
	public void  getAlbumsWithAtMostThreeTracksTest() {
		List<Album> list = getAlbums();
		List<Album> result = ExercisesLambdas.getAlbumsWithAtMostThreeTracks(list);
		Assert.assertEquals("Vivaldi" ,result.get(0).getMainMusician().getName());
		Assert.assertEquals(1 ,result.size());
	}
	
	private List<Album> getAlbums() {
		List<Track> tracksVivaldi = new ArrayList<>();
		Track firstTrackVivaldi = new Track("Spring", 0);
		Track secondTracVivaldi = new Track("Summer", 0);
		Track thirdTrackVivaldi = new Track("Winter", 0);
		Track fourTracVivaldi = new Track("Autumn", 0);
		tracksVivaldi.addAll(Arrays.asList(firstTrackVivaldi, secondTracVivaldi, thirdTrackVivaldi, fourTracVivaldi));
		Artist artistVivaldi = new Artist("Vivaldi", "Italia"); 
		Album albumVivaldi = new Album("The Four Seasons" , tracksVivaldi, Arrays.asList(artistVivaldi));
		
		List<Track> tracksMozart = new ArrayList<>();
		Track firstTrackMozart = new Track("Overture", 0);
		Track secondTracMozart = new Track("Der Hölle Rache kocht in meinem Herzen", 0);
		tracksMozart.addAll(Arrays.asList(firstTrackMozart, secondTracMozart));
		Artist artistMozart = new Artist("Mozart", "Austria");
		Album albumMozart = new Album("The Magic Flute" , tracksMozart, Arrays.asList(artistMozart));
		
		return Arrays.asList(albumVivaldi, albumMozart);
	}
	
	/**
	 * Ejercicio 12
	 *  Expresión lambda para contar el numero de letras minusculas 
	 */
	@Test
	public void  countLowercaseTest() {
		int result = ExercisesLambdas.countLowercaseLetters("Curso JAVA para CSIC");
		Assert.assertEquals(8,result);

	}
	
	
	/**
	 * Ejercicio 13
	 *  Expresión lambda para devolver la cadena de texto con mayor numero de letras minúsculas 
	 */
	@Test
	public void  mostLowercaseStringTest() {
		String result = ExercisesLambdas.mostLowercaseString(Arrays.asList("Curso JAVA para CSIC", "Cursos de Spring MVC"));
		Assert.assertEquals("Cursos de Spring MVC",result);

	}
	
	
	/**
	 * Ejercicio 14
	 *  Expresión lambda para devolver el nombre más largo de los artistas por reduccion
	 */
	@Test
	public void  getLongestNameByReduceTest() {
		Artist result = ExercisesLambdas.getLongestNameByReduce(getArtists());
		Assert.assertEquals("Mozart",result.getName());

	}
	
	
	/**
	 * Ejercicio 15
	 *  Expresión lambda para devolver el nombre más largo de los artistas  por coleccion
	 */
	@Test
	public void  getLongestNameByCollectingTest() {
		Artist result = ExercisesLambdas.getLongestNameByCollecting(getArtists());
		Assert.assertEquals("Mozart",result.getName());

	}
	
	
	/**
	 * Ejercicio 16
	 *  Expresión lambda para que devuelva el número de coincidencias de los nombres de una lista
	 */
	@Test
	public void  countWordsTest() {
		Map<String, Long> result = ExercisesLambdas.countWords(getWordsList());
		Assert.assertEquals(Long.valueOf(2),result.get("Julio"));
		Assert.assertEquals(Long.valueOf(1),result.get("Paco"));
	}

	
	private List<String> getWordsList() {
		List<String> list = new ArrayList<>();
		list.add("Paco");
		list.add("Antonio");
		list.add("Julio");
		list.add("Julio");
		return list;
	}
	
	
	/**
	 * Ejercicio 17
	 *  Expresión lambda para que devuelva el cuandrado de un numero
	 */
	@Test
	public void  sumOfSquaresParallelTest() {
		int result = ExercisesLambdas.sumOfSquaresParallel(IntStream.of(2));
		Assert.assertEquals(4,result);
	}
}