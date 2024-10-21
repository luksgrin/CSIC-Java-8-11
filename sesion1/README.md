# Ejercicios Sesión 1

## Contenidos

### DÍA 1 – Java versión 8, 11

- Repaso a versiones previas de Java
- Configuración del IDE Eclipse y uso básico de Maven
- Configuración de proyectos para entornos IC
- Introducción al Framework THOR
- Nuevas características en Java 8 y Java 11
    - Lambda Expressions
    - Method References
    - Default Methods
    - Local Variable Type Inference
    - Collections
    - Date-Time package
    - Internacionalización
    - Seguridad
    - Concurrencia
    - Módulos
- Talleres prácticos y ejercicios

## Preliminares

Para instalar las dependencias del proyecto (especificadas en el fichero `pom.xml`), ejecutamos:

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