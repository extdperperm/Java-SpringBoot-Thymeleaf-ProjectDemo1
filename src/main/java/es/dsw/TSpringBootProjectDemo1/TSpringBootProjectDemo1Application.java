package es.dsw.TSpringBootProjectDemo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/*
 * [8] - Clase principal de inicio de la aplicación (main()). En ella se establecerá muchas de las configuraciones
 *       necesarias. En este caso, con @ComponentScan(basePackages = "es.dsw") se está indicando que Spring debe
 *       escanear todas las clases que cuelguen de es.dsw. Si las java annotations de Spring no están bajo dicha
 *       configuración, entonces no las tendrá en cuenta.
 *       
 *       Otro de los lugares donde Spring Boot nos permite realizar configuración del proyecto, es en el fichero
 *       application.properties situado bajo src/main/resources. Además, en dicho fichero puedes añadir los parámetros
 *       que estimes oportuno. Ahora mismo, tiene configurado dos propiedades a efectos de depuración. spring.thymeleaf.cache=false
 *       establece que las vistas se puedan modificar y al refrescar en el navegador surjan los cambios, esto solo es
 *       interesante para depurar, pues en producción se debe activar la cache. Por otro lado, server.port=8081
 *       indica el puerto en el que estará disponible la aplicación al ejecutarla.
 */
@SpringBootApplication
@ComponentScan(basePackages = "es.dsw")
public class TSpringBootProjectDemo1Application {

	public static void main(String[] args) {
		SpringApplication.run(TSpringBootProjectDemo1Application.class, args);
	}

}
