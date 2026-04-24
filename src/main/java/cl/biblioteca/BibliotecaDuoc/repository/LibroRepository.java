package cl.biblioteca.BibliotecaDuoc.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import cl.biblioteca.BibliotecaDuoc.model.Libro;


@Repository

public interface LibroRepository extends JpaRepository<Libro, Integer> {

      @Query(value = "SELECT * FROM libros WHERE autor = :autor", nativeQuery = true)
     List<Libro> findByAutor(@Param("autor") String autor);

     @Query(value = "SELECT * FROM libros WHERE editorial = :editorial", nativeQuery = true)
     List<Libro> selectEditorial(@Param("editorial") String editorial);
 
    default int totalLibros() {
        return (int) this.count(); // ← "this" se refiere a la instancia del repository
    }

}
