package es.csic.exercises;


import java.util.*;
import java.util.function.BiFunction;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import es.csic.models.Album;
import es.csic.models.Artist;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.*;

public class ExercisesLambdasResolved {


    // ----------- Ejercicio 0 ----------
	@FunctionalInterface
    interface SumCalculator {
        int sum(int a, int b);
    }

    public static int sum(int a, int b) {
        SumCalculator sumCalculator = (x, y) -> x + y;
        return sumCalculator.sum(a, b);
    }
    
    // ----------- Ejercicio 1 ----------
    public static String concat(String str1, String str2) {
    	BiFunction<String, String, String> concatStr = (str1Value, str2Value) -> str1 + str2;
    	return concatStr.apply(str1, str2);
    }

    // ----------- Ejercicio 2 ----------
    public static List<String> listToLowerCase(List<String> stringList){
    	stringList.replaceAll(str -> str.toLowerCase());
    	return stringList;
    }

    // ----------- Ejercicio 3 ----------
    public static List<Integer> getEvenNumbers(List<Integer> numbers){
        return numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
    }
    
    // ----------- Ejercicio 4 ----------
    public static List<String> sortList(List<String> stringList){
        stringList.sort((str1, str2) -> str1.compareToIgnoreCase(str2));
        return stringList;
    }
    
    // ----------- Ejercicio 5 ----------
    public static Double getAverage(List<Double> numbers){
        Double value = numbers.stream()
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(0.0);
        return value;
    }
    
    // ----------- Ejercicio 6 ----------
    public static List<Integer> removeDuplicates(List<Integer> numbers){
        List<Integer> uniqueNumbers = new ArrayList<>();
        numbers.stream()
                .distinct()
                .forEach(uniqueNumbers::add);
        return uniqueNumbers;
    }
    
    // ----------- Ejercicio 7 ----------
    public static Integer getMax(List<Integer> numbers){
        return numbers.stream()
                .max((x, y) -> x.compareTo(y)).orElse(-1);
    }
    
    // ----------- Ejercicio 8 ----------
    public static Integer sumMultiplyAll(List<Integer> numbers){
        return numbers.stream()
                .reduce(1, (x, y) -> x * y)
                .intValue();
    }
    
    // ----------- Ejercicio 9 ----------
    public static int sumTotal(List<Integer> numbers) {
        return numbers.stream().reduce(0, (acc, x) -> acc + x);
    }
    
    // ----------- Ejercicio 10 ----------
    public static List<String> getNamesAndOrigins(List<Artist> artists) {
        return artists.stream()
                .flatMap(artist -> Stream.of(artist.getName(), artist.getNationality()))
                .collect(toList());
    }
    
    // ----------- Ejercicio 11 ----------
    public static List<Album> getAlbumsWithAtMostThreeTracks(List<Album> input) {
        return input.stream()
                .filter(album -> album.getTrackList().size() >= 3)
                .collect(toList());
    }
    
    // ----------- Ejercicio 12 ----------
    public static int countLowercaseLetters(String string) {
        return (int) string.chars()
                .filter(Character::isLowerCase)
                .count();
    }
    
    // ----------- Ejercicio 13 ----------
    public static String mostLowercaseString(List<String> strings) {
        return strings.stream()
                .max(Comparator.comparingInt(ExercisesLambdasResolved::countLowercaseLetters)).orElse("");
    }

    // ----------- Ejercicio 14 ----------
    private static Comparator<Artist> byNameLength = comparing(artist -> artist.getName().length());
    
    public static Artist getLongestNameByReduce(List<Artist> artists) {
        return artists.stream()
                .reduce((acc, artist) -> {
                    return (byNameLength.compare(acc, artist) >= 0) ? acc : artist;
                })
                .orElseThrow(RuntimeException::new);
    }
    
    // ----------- Ejercicio 15 ----------
    public static Artist getLongestNameByCollecting(List<Artist> artists) {
        return artists.stream()
                .collect(Collectors.maxBy(byNameLength))
                .orElseThrow(RuntimeException::new);
    }
    
    // ----------- Ejercicio 16 ----------
    public static Map<String, Long> countWords(List<String> names) {
        return names.stream().collect(groupingBy(name -> name, counting()));
    }
   
    // ----------- Ejercicio 17 ----------
    public static int sumOfSquaresParallel(IntStream range) {
        return range.parallel()
                .map(x -> x * x)
                .sum();
    }
}
