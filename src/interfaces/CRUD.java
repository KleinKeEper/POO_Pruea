package interfaces;
import java.util.List;
import modelo.Libro;
public interface CRUD  {
    public List listarlibro();
    public Libro buscarlibro(Libro libro);
    public boolean agregarlibro(Libro libro);
    public boolean editarlibro(Libro libro); 
}
