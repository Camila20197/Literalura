package com.AluraDesafios.challenge_literalura.Repository;

import com.AluraDesafios.challenge_literalura.model.Book;
import com.AluraDesafios.challenge_literalura.model.Language;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 *  Esta interfaz define los métodos para interactuar con la base de datos y realizar
 *  operaciones relacionadas con los libros. Por ejemplo, buscar libros por idioma,
 *  encontrar todos los libros, etc. Al extender JpaRepository, también hereda métodos
 *  predefinidos para realizar operaciones CRUD sobre entidades de tipo Book.
 * */
public interface BookRepository extends JpaRepository<Book, Long> {

    /**
     * Busca libros por idioma.
     *
     * @param idioma El idioma del libro a buscar.
     * @return Una lista de libros en el idioma especificado.
     */
    List<Book> findByIdiomas(Language idioma);
}
