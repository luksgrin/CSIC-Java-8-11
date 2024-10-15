# Curso CSIC "JAVA 8 Y 11 SOBRE SPRING"

Este es un curso organizado dentro del Plan de Formación del CSIC que imparte GMV.

## Objetivos

Profundizar en las características más importantes de las últimas versiones de Java 8 y 11 sobre Spring.

## Material 

_(Durante el curso se irá colgando el material en una carpeta de `SACO` del CSIC)_

Además, se irá colgando en este repositorio el material que se vaya generando durante el curso.
 
## Programa del curso

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
 

### DÍA 2 – Spring

- Introducción y conceptos fundamentales de Spring (core)
    - Dependency Injection
    - Bean Scopes
    - Spring Configuration
    - AOP
- Spring MVC
    - Controladores
    - Servicios y components
    - JSF
    - Validadores
    - Internacionalización
- Taller Desarrollo aplicación web JSF (Usando framework THOR)

### DÍA 3 – Spring
- Hibernate / JPA
    - Introducción a los ORM: JPA e Hibernate
        - Modelado de datos
    - Consultas avanzadas
    - Rendimiento y recomendaciones
-Liquibase
- Taller: Añadir persistencia a la aplicación del día 2 (Usando framework THOR)
- Spring REST
    - API, CRUD, DTO
    - Documentación (SpringDoc)
    - Validaciones
    - Cliente de API REST
    - Manejo de excepciones
- Taller: Añadir capa REST a la aplicación del día anterior
 

### DÍA 4 - JPA avanzado y Spring security
- JPA avanzado - Optimización de consultas con JPA
    - FetchType
    - Entity Graphs
    - Named Query
- Spring Security
    - Opciones de integracion
    - Integración con CAS
- Taller: Añadir seguridad a la aplicación del día anterior
 

### DÍA 5 – Spring Boot
- Introducción y conceptos fundamentales
    - Convención frente a configuración
    - Fat jar
    - @SpringBootApplication - Autoconfiguración
- Entorno de desarrollo y herramientas
    - Spring Initializr
    - Starters
    - Spring Tool Suite
    - Dev Tools
    - Actuators
- Taller práctico
 
## Prerrequisitos
 
### IDEs

El curso indica que se empleará [Eclipse 2024](https://www.eclipse.org/downloads/packages/) como IDE.

Yo me quedo con VSCode. Adicionalmente instalé el pack de extensiones de Java para VSCode.

```bash
code --install-extension vscjava.vscode-java-pack
```

y también el pack de extensiones de Spring Boot:

```bash
code --install-extension Pivotal.vscode-boot-dev-pack
```
 
### Software

#### Java
[OpenJDK 11](https://jdk.java.net/archive/) (obvio).

Yo trabajo en WSL, y se dio la casualidad que ya tenía instalado el OpenJDK 11:

```bash
$ java -version
openjdk version "11.0.23" 2024-04-16
OpenJDK Runtime Environment (build 11.0.23+9-post-Ubuntu-1ubuntu122.04.1)
OpenJDK 64-Bit Server VM (build 11.0.23+9-post-Ubuntu-1ubuntu122.04.1, mixed mode, sharing)
```

#### Maven

Maven es un gestor de dependencias y un sistema de construcción de proyectos. Se puede descargar desde [aquí](https://maven.apache.org/download.cgi).

Se indica que se empleará la versión 3.6.0 o superior.

Yo no tenía instalado Maven, así que lo instalé desde los repositorios de Ubuntu:

```bash
sudo apt update
sudo apt install maven
```

comprobando la versión:

```bash
$ mvn -version
Apache Maven 3.6.3
Maven home: /usr/share/maven
Java version: 11.0.23, vendor: Ubuntu, runtime: /usr/lib/jvm/java-11-openjdk-amd64
Default locale: en, platform encoding: UTF-8
OS name: "linux", version: "5.15.153.1-microsoft-standard-wsl2", arch: "amd64", family: "unix"
```

#### Tomcat

Tomcat es un servidor web de código abierto y contenedor de servlets. Se puede descargar [aquí](https://tomcat.apache.org/download-90.cgi), además se indica que se empleará Tomcat 9.0.

Este ha sido bastante más complicado de instalar en WSL...

Un simple `wget` para descargar el archivo `.tar.gz` del enlace anterior:

```bash
wget https://dlcdn.apache.org/tomcat/tomcat-9/v9.0.96/bin/apache-tomcat-9.0.96.tar.gz
```

Y descomprimimos el archivo después de crear un grupo y un usuario para el servicio:

```bash
mv apache-tomcat-9.0.96.tar.gz /tmp/.
cd /tmp
sudo groupadd tomcat
sudo mkdir /opt/tomcat # Aquí se instalará
sudo useradd -s /bin/false -g tomcat -d /opt/tomcat tomcat
sudo tar xzvf apache-tomcat-9*tar.gz -C /opt/tomcat --strip-components=1
```

La aplicación ahora existe en `/opt/tomcat`, pero no se puede ejecutar directamente. Para ello, necesitamos dar permisos al usuario `tomcat`:

```bash
cd /opt/tomcat
sudo chown -RH tomcat: /opt/tomcat
sudo sh -c 'chmod +x /opt/tomcat/bin/*.sh'
```

Finalmente, y por comodidad, en mi `.bashrc` genero el alias `catalina` para ejecutar tomcat:

```bash
echo 'alias catalina=$(sudo "/opt/tomcat/bin/catalina.sh")' >> ~/.bashrc
```

Y recargamos el `.bashrc`:

```bash
source ~/.bashrc
```

Ahora, podemos ejecutar Tomcat con el comando `catalina`:

```bash
$ catalina run
```

Y acceder a la página de inicio de Tomcat en `http://localhost:8080`.

