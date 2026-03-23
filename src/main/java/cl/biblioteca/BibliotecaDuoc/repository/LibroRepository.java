package cl.biblioteca.BibliotecaDuoc.repository;

import org.springframework.stereotype.Repository;
import cl.biblioteca.BibliotecaDuoc.model.Libro;

import java.util.ArrayList;
import java.util.List;

@Repository
public class LibroRepository {
    private ArrayList<Libro> lista = new ArrayList<>();
    public List<Libro> getAllLibros() {
        return lista;
    }



    public Libro buscarLibro( int id) {
        for (Libro libro : lista) {
            if (libro.getId() == id) {
                return libro;
            }
        }
        return null;
    }

    public Libro buscarIsbn ( String isbn) {
        for (Libro libro : lista) {
            if (libro.getIsbn().equals(isbn)) {
                return libro;
            }
        }
        return null;
    }

    public void agregarLibro(Libro libro) {
        lista.add(libro);
    }

    public Libro actualizarLibro(Libro lib ){
        int id = 0;
        int idposicion = 0;
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getId() == lib.getId()) {
                id = lib.getId();
                idposicion = i;
            }
        }

        Libro libro1 = new Libro();
        libro1.setId(id);
        libro1.setIsbn(lib.getIsbn());
        libro1.setTitulo(lib.getTitulo());
        libro1.setEditorial(lib.getEditorial());
        libro1.setFechaPublicacion(lib.getFechaPublicacion());
        libro1.setAutor(lib.getAutor());
            lista.set(idposicion, libro1);
            return libro1;
    }

        public void eliminarLibro(int id) {
            int idPosicion = 0;
            for (int i = 0; i < lista.size(); i++) {
                if (lista.get(i).getId() == id) {
                    idPosicion = i;
                    break;
                }
            }
    
            if (idPosicion >= 0) {
                lista.remove(idPosicion);
            }
        }
    }

