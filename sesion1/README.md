# Ejercicios Sesión 1

## Preliminares

Para instalar las dependencias del proyect (especificadas en el fichero `pom.xml`), ejecutamos:

```bash
mvn clean install
```

A continuación, para lanzar los tests, ejecutamos:

```bash
mvn test
```

y veremos que obtendremos errores. Nuestro objetivo es corregir estos errores para que los tests pasen.

## Ejercicio lambdas

En el fichero [ExercisesLambdas.java](src/main/java/es/csic/exercises/ExercisesLambdas.java) se encuentran los ejercicios sobre funciones/declaraciones lambda. Para ejecutar los tests, asociados a estos ejercicios, ejecutamos:

```bash
mvn -Dtest=es.csic.exercises.ExercisesLambdasTest test
```

## Ejercicio Dates

En el fichero [ExercisesDate.java](src/main/java/es/csic/exercises/ExercisesDate.java) se encuentran los ejercicios sobre el tratamiento de fechas. Para ejecutar los tests, asociados a estos ejercicios, ejecutamos:

```bash
mvn -Dtest=es.csic.exercises.ExercisesDateTest test
```

## Ejercicios Avanzados

El último conjunto de ejercicios se encuentra en el fichero [AdvancedExercises.java](src/main/java/es/csic/exercises/AdvancedExercises.java). Para ejecutar los tests, asociados a estos ejercicios, ejecutamos:

```bash
mvn -Dtest=es.csic.exercises.AdvancedExercisesTest test
```