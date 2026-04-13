package cl.biblioteca.BibliotecaDuoc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "cl.biblioteca.BibliotecaDuoc")
public class BibliotecaDuocApplication {

	public static void main(String[] args) {
		SpringApplication.run(BibliotecaDuocApplication.class, args);
	}

}
