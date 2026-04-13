package cl.biblioteca.BibliotecaDuoc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.biblioteca.BibliotecaDuoc.model.Libro;


@Repository

public interface LibroRepository extends JpaRepository<Libro, Integer> {


 
    default int totalLibros() {
        return (int) this.count(); // ← "this" se refiere a la instancia del repository
    }

}
