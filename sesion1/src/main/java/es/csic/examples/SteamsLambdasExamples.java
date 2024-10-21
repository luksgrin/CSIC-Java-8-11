package es.csic.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SteamsLambdasExamples {
    public static void main(String[] args) {
        List<Empleado> lista = new ArrayList<>();
        Empleado a = new Empleado("Carlos", "Pérez", 30);
        Empleado b = new Empleado("Juan", "López", 40);
        Empleado c = new Empleado("María", "Pérez", 20);
        Empleado d = new Empleado("Laura", "López", 35);

        lista.add(a);
        lista.add(b);
        lista.add(c);
        lista.add(d);

        // Foreach
        lista.stream().forEach((p)-> {
            System.out.println(p.getNombre());
            System.out.println(p.getApellidos());
            System.out.println(p.getEdad());
        });

        // Stream + filter + map + collect
        List<String> listaRes = lista.stream()
                .filter(s -> s.getEdad() > 30)
                .map(s -> s.getNombre().toUpperCase())
                .collect(Collectors.toList());

        // Stream + filter + findFirst
        Empleado res = lista.stream()
                .filter(s -> s.getEdad() > 30)
                .findFirst()
                .orElse(null);

        listaRes.stream().forEach((p)-> {System.out.println(p);});

        // Stream + flatmap
        List<List<String>> listas = Arrays.asList(
                Arrays.asList("A", "B"),
                Arrays.asList("C", "D"),
                Arrays.asList("E", "F"));

        List<String> flatList = listas.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList());

        System.out.println(listas);
        System.out.println(flatList);
    }

    private static class Empleado {
        private String nombre;
        private String apellidos;
        private Integer edad;

        public Empleado(String nombre, String apellidos, Integer edad) {
            this.nombre = nombre;
            this.apellidos = apellidos;
            this.edad = edad;
        }

        public String getNombre() {
            return nombre;
        }

        public String getApellidos() {
            return apellidos;
        }

        public Integer getEdad() {
            return edad;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public void setApellidos(String apellidos) {
            this.apellidos = apellidos;
        }

        public void setEdad(Integer edad) {
            this.edad = edad;
        }
    }
}
