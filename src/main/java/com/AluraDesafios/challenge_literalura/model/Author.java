package com.AluraDesafios.challenge_literalura.model;

import com.AluraDesafios.challenge_literalura.dto.DataAuthor;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Esta clase representa la entidad Autor en la base de datos.

 * La tabla asociada a esta clase se llama "authors".

 * Un autor se identifica por su ID (generado automáticamente), nombre, año de nacimiento y año de muerte.

 * Un autor puede tener varios libros asociados.
 */
@Entity
@Table(name="authors")
public class Author {

    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private String nombre;

    private int anioNacimiento;

    private int anioMuerte;

    @OneToMany(mappedBy = "author", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Book> book = new ArrayList<>();

    public Author(){}

    public Author(DataAuthor authorData ) {
        this.nombre = authorData.nombre();
        this.anioNacimiento = authorData.anioNacimiento();
        this.anioMuerte = authorData.anioMuerte();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return anioNacimiento == author.anioNacimiento &&
                anioMuerte == author.anioMuerte &&
                Objects.equals(nombre, author.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, anioNacimiento, anioMuerte);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnioNacimiento() {
        return anioNacimiento;
    }

    public void setAnioNacimiento(int anioNacimiento) {
        this.anioNacimiento = anioNacimiento;
    }

    public int getAnioMuerte() {
        return anioMuerte;
    }

    public void setAnioMuerte(int anioMuerte) {
        this.anioMuerte = anioMuerte;
    }

    public List<Book> getBook() {
        return book;
    }

    public void setBook(List<Book> book) {
        this.book = book;
    }

    @Override
    public String toString() {
        return "Author{" +
                "nombre='" + nombre + '\'' +
                ", anioNacimiento=" + anioNacimiento +
                ", anioMuerte=" + anioMuerte +
                ", book=" + book +
                '}';
    }
}
