package one.dio.Desafio_projetos_CRUD;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class DesafioProjetosCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesafioProjetosCrudApplication.class, args);
	}

}
