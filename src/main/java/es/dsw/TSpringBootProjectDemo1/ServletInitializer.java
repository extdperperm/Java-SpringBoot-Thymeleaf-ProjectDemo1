package es.dsw.TSpringBootProjectDemo1;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/*
 * [7] - Esta clase la genera automáticamente el inicializador de spring boot si has marcado generar .war. A priori,
 *       no deberás tocarla. Permite que puedas generar un .war del proyecto. 
 */
public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(TSpringBootProjectDemo1Application.class);
	}

}
