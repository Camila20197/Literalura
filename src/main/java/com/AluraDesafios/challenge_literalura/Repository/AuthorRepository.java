package com.AluraDesafios.challenge_literalura.Repository;

import com.AluraDesafios.challenge_literalura.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
/**
 * Esta interfaz define los métodos para interactuar con la base de datos y realizar
 * operaciones relacionadas con los autores. Por ejemplo, buscar un autor por nombre,
 * encontrar autores por rango de fechas de nacimiento y muerte, etc. Al extender
 * JpaRepository, hereda métodos predefinidos para realizar operaciones
 * CRUD (crear, leer, actualizar, eliminar) sobre entidades de tipo Author.
 * */
public interface AuthorRepository extends JpaRepository<Author, Long> {

    /**
     * Busca un autor por su nombre (ignorando mayúsculas y minúsculas).
     *
     * @param nombre El nombre del autor a buscar.
     * @return El autor encontrado o null si no se encuentra.
     */
    Author findByNombreIgnoreCase(String nombre);

    /**
     * Busca autores que nacieron en un año o antes y fallecieron después de otro año (o siguen vivos).
     *
     * @param anio El año de nacimiento (o antes).
     * @param anio2 El año de muerte (o 0 para autores vivos).
     * @return Una lista de autores que cumplen con el criterio de búsqueda.
     */
    List<Author> findByAnioNacimientoLessThanEqualAndAnioMuerteGreaterThan(int anio, int anio2);

    /**
     * Busca autores que nacieron en un año o antes y fallecieron en otro año (o siguen vivos).
     *
     * @param anio El año de nacimiento (o antes).
     * @param anioMuerte El año de muerte (o 0 para autores vivos).
     * @return Una lista de autores que cumplen con el criterio de búsqueda.
     */
    List<Author> findByAnioNacimientoLessThanEqualAndAnioMuerte(int anio, int anioMuerte);

}
