package es.csic.examples;

import java.util.function.BiFunction;

public class MethodReferencesExamples {

    public static <T> T merge(T a, T b, BiFunction<T, T, T> merger) {
        return merger.apply(a, b);
    }

    public static String concat(String a, String b) {
        return a + b;
    }

    public String append(String a, String b) {
        return a + b;
    }

    public static void main(String[] args) {

        MethodReferencesExamples instance = new MethodReferencesExamples();

        // Calling the method mergeThings with a lambda expression
        //System.out.println(ExamplesClass.
        //        merge("Hello ", "World!", (a, b) -> a + b));

        // Reference to a static method
        //System.out.println(MethodReferencesExamples.
        //        mergeThings("Hello ", "World!", ExamplesClassStatic::appendStrings));

        // Reference to an instance method of a particular object
        //System.out.println(MethodReferencesExamples.
        //        mergeThings("Hello ", "World!", myApp::appendStrings2));

        // Reference to an instance method of an arbitrary object of a
        // particular type
        //System.out.println(MethodReferencesExamples.
        //        mergeThings("Hello ", "World!", String::concat));
    }
}
