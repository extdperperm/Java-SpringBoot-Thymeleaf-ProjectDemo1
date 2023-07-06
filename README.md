######################################################################################################################
#                                                                                                                    #
#                                          TSpringBootProjectDemo1                                                   #
#                                                                                                                    #
#                                         Autor: Daniel Pérez Pérez                                                  #
#                                            Fecha: 18/06/2023                                                       #
######################################################################################################################
----------------------------------------------------------------------------------------------------------------------
DESCRIPCIÓN
----------------------------------------------------------------------------------------------------------------------
Ejemplo de creación de un proyecto web con maven en el contexto de Spring Boot. Ejemplo de uso de controladoras, mapeos de
rutas, modelo de spring e introducción a la tecnología Thymeleaf para las vistas.

----------------------------------------------------------------------------------------------------------------------
ESPECIFICACIÓN TÉCNICA DE DESARROLLO UTILIZADO
----------------------------------------------------------------------------------------------------------------------
Entorno de Desarrollo: Spring Boot Suite, versión: 4
Servidor de referencia: Apache Tomcat, versión: 10
Jdk: OpenJdk, versión: 17.1
Gestor de proyecto: Maven, versión: 4.0

----------------------------------------------------------------------------------------------------------------------
DEPENDENCIAS
----------------------------------------------------------------------------------------------------------------------
Spring Boot Framework: versión 3.1.0 
       - spring-boot-starter-web
       - spring-boot-starter-tomcat
       - spring-boot-starter-test
       - tomcat-embed-jasper
       - spring-boot-starter-thymeleaf
              
----------------------------------------------------------------------------------------------------------------------
RECOMENDACIÓN PARA ABRIR EL PROYECTO EN EL IDE: Spring Boot Suite
----------------------------------------------------------------------------------------------------------------------
1º. Copie el directorio TSpringBootProjectDemo1 en el directorio de su espacio de trabajo.
2º. Desde el IDE (Spring Boot Suite), importe el proyecto haciendo click en File -> Open Projects from File System 
3º. En Import source, haciendo click en el botón "Directory..." seleccione la carpeta que contiene el proyecto.
4º. Haga click en Finish
5º. Se recomienda realizar un Maven Update (Click derecho sobre el proyecto Maven -> Update Project...)
6º. Recompilar (salvo que tenga activado compilación automática).
7º. Ejecutar, por ejemplo haciendo click derecho sobre el proyecto -> Run As -> Java Application

----------------------------------------------------------------------------------------------------------------------
RECOMENDACIÓN PARA LA LECTURA Y ANÁLISIS DEL PROYECTO
----------------------------------------------------------------------------------------------------------------------

1º pom.xml (maven)
2º es.dsw.SpringBootProjectDemo1.ServletInitializer
3º es.dsw.SpringBootProjectDemo1.TSpringBootProjectDemo1Application
4º src/main/resources/application.properties
5º es.dsw.controllers.* (Desde la interfaz, capturando el mapeo url localice los mapeos en las controladoras)
