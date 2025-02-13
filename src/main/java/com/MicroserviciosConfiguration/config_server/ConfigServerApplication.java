package com.MicroserviciosConfiguration.config_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer // Habilita el servidor de configuración
public class ConfigServerApplication {

	// http://localhost:8888/booking-microservice/dev
	// Acceso a las propiedades de configuración del microservicio booking-microservice en el entorno dev
	// http://localhost:8888/booking-microservice/prod
	// Acceso a las propiedades de configuración del microservicio booking-microservice en el entorno prod
	public static void main(String[] args) {
		SpringApplication.run(ConfigServerApplication.class, args);
	}

}
