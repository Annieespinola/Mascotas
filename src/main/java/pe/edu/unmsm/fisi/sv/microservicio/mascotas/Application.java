package pe.edu.unmsm.fisi.sv.microservicio.mascotas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "pe.edu.unmsm.fisi.sv.microservicio.mascotas.repositorio")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
