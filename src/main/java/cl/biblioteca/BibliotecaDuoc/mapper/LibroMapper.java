package cl.biblioteca.BibliotecaDuoc.mapper;

import cl.biblioteca.BibliotecaDuoc.dto.CreateLibroRequest;
import cl.biblioteca.BibliotecaDuoc.dto.UpdateLibroRequest;
import cl.biblioteca.BibliotecaDuoc.model.Libro;

public class LibroMapper {
public static Libro toModel(CreateLibroRequest request) {
        return new Libro(0, // ID temporal, será asignado por el service/repository
                request.isbn(),
                request.titulo(), 
                request.editorial(), 
                request.fechaPublicacion(),
                request.autor());
    }

    /**
     * Convierte UpdateLibroRequest a Libro (para PUT) El ID se obtiene del path parameter
     */
    public static Libro toModel(int id, UpdateLibroRequest request) {
        return new Libro(id, // ID del path parameter
                request.isbn(), request.titulo(), request.editorial(), request.fechaPublicacion(),
                request.autor());
    }
}
