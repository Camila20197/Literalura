package com.AluraDesafios.challenge_literalura;

import com.AluraDesafios.challenge_literalura.Repository.AuthorRepository;
import com.AluraDesafios.challenge_literalura.Repository.BookRepository;
import com.AluraDesafios.challenge_literalura.principal.Principal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class ChallengeLiteraluraApplication implements  CommandLineRunner{

	private AuthorRepository authorRepository;

	private BookRepository bookRepository;

	public ChallengeLiteraluraApplication(AuthorRepository authorRepository, BookRepository bookRepository) {
		this.authorRepository = authorRepository;
		this.bookRepository = bookRepository;
	}


	public static void main(String[] args) {
	SpringApplication.run(ChallengeLiteraluraApplication.class, args);

	}

	/**
	 * Punto de entrada de la aplicación.
	 *
	 * 1. Crea una instancia de la clase Principal.
	 * 2. Muestra el menú principal de la aplicación y permite al usuario interactuar con ella.
	 *
	 * @param args Argumentos de línea de comandos (no utilizados en esta aplicación).
	 * @throws Exception Si ocurre algún error durante la ejecución.
	 */
	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal(authorRepository, bookRepository);
		principal.muestraElMenu();
	}
}
