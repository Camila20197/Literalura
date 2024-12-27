package com.AluraDesafios.challenge_literalura.model;

import com.AluraDesafios.challenge_literalura.dto.DataBook;
import jakarta.persistence.*;

/**
 * Esta clase representa la entidad Libro en la base de datos.

 * La tabla asociada a esta clase se llama "books".

 * Un libro se identifica por su ID (generado automáticamente), título, autor, idioma y número de descargas.

 * Un libro pertenece a un único autor.
 */
@Entity
@Table(name = "books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;


    @ManyToOne
    @JoinColumn(name = "author_id", nullable = false)
    private Author author;

    @Enumerated(EnumType.STRING)
    private Language idiomas;

    private Integer descargas;


    public Book(){}


    public Book(DataBook datosBook, Author autor) {
        this.titulo = datosBook.titulo();
        this.author = autor;
        this.idiomas = Language.fromString(datosBook.idiomas().get(0));
        this.descargas = datosBook.descargas();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Language getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(Language idiomas) {
        this.idiomas = idiomas;
    }

    public Integer getDescargas() {
        return descargas;
    }

    public void setDescargas(Integer descargas) {
        this.descargas = descargas;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author=" + author.getNombre() +
                ", idiomas=" + idiomas +
                ", descargas=" + descargas +
                ", titulo='" + titulo + '\'' +
                '}';
    }
}
