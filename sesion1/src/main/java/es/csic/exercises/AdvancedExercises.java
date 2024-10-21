package es.csic.exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class AdvancedExercises {

	
	// ----------- Ejercicio 1 ----------
    public static <I, O> List<O> map(Stream<I> stream, Function<I, O> mapper) {
        return new ArrayList<>();
    }

    
    // ----------- Ejercicio 2 ----------
    public static <I> List<I> filter(Stream<I> stream, Predicate<I> predicate) {
        return new ArrayList<>();
    }
}
