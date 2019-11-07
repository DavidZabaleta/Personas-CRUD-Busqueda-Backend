package co.edu.uco.uconotas;

import co.edu.uco.uconotas.controller.PersonaController;
import co.edu.uco.uconotas.entity.PersonaEntity;
import co.edu.uco.uconotas.model.Persona;
import co.edu.uco.uconotas.service.persona.impl.PersonaServiceImpl;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@SpringBootApplication
public class UcoNotasApplication {

	public static void main(String[] args) {
		SpringApplication.run(UcoNotasApplication.class, args);
	}

}
