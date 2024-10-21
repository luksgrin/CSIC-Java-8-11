package es.csic.exercises;

import es.csic.models.Album;
import es.csic.models.Artist;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ExercisesLambdas {


    // ----------- Ejercicio 0 ----------
	@FunctionalInterface
    interface SumCalculator {
        int sum(int a, int b);
    }

    public static int sum(int a, int b) {
        return 0;
    }
    
    // ----------- Ejercicio 1 ----------
    public static String concat(String str1, String str2) {
    	return "";
    }

    // ----------- Ejercicio 2 ----------
    public static List<String> listToLowerCase(List<String> stringList){
    	return new ArrayList<>();
    }

    // ----------- Ejercicio 3 ----------
    public static List<Integer> getEvenNumbers(List<Integer> numbers){
        return new ArrayList<>();
    }
    
    // ----------- Ejercicio 4 ----------
    public static List<String> sortList(List<String> stringList){
        return new ArrayList<>();
    }
    
    // ----------- Ejercicio 5 ----------
    public static Double getAverage(List<Double> numbers){
        return 0.0;
    }
    
    // ----------- Ejercicio 6 ----------
    public static List<Integer> removeDuplicates(List<Integer> numbers){
        return new ArrayList<>();
    }
    
    // ----------- Ejercicio 7 ----------
    public static Integer getMax(List<Integer> numbers){
    	return 0;
    }
    
    // ----------- Ejercicio 8 ----------
    public static Integer sumMultiplyAll(List<Integer> numbers){
    	return 0;
    }
    
    // ----------- Ejercicio 9 ----------
    public static int sumTotal(List<Integer> numbers) {
        return 0;
    }
    
    // ----------- Ejercicio 10 ----------
    public static List<String> getNamesAndOrigins(List<Artist> artists) {
        return new ArrayList<>();
    }
    
    // ----------- Ejercicio 11 ----------
    public static List<Album> getAlbumsWithAtMostThreeTracks(List<Album> albums) {
        return new ArrayList<>();
    }
    
    // ----------- Ejercicio 12 ----------
    public static int countLowercaseLetters(String text) {
        return 0;
    }
    
    // ----------- Ejercicio 13 ----------
    public static String mostLowercaseString(List<String> strings) {
        return "";
    }

    // ----------- Ejercicio 14 ----------
    private static Comparator<Artist> byNameLength = comparing(artist -> artist.getName().length());
    public static Artist getLongestNameByReduce(List<Artist> artists) {
        return new Artist("", "");
    }
    
    // ----------- Ejercicio 15 ----------
    public static Artist getLongestNameByCollecting(List<Artist> artists) {
        return new Artist("", "");
    }
    
    // ----------- Ejercicio 16 ----------
    public static Map<String, Long> countWords(List<String> names) {
        return new HashMap<>();
    }
   
    // ----------- Ejercicio 17 ----------
    public static int sumOfSquaresParallel(IntStream range) {
        return 0;
    }
}
