
package modeloDAO;

import java.sql.*;
import config.bd.ConectaBd;
import interfaces.CRUD;
import java.util.ArrayList;
import java.util.List;
import modelo.Libro;

public class libroDAO implements CRUD{
 ConectaBd cn = new ConectaBd();
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    Libro e = new Libro();
    
    public List listarlibro() {
        ArrayList<Libro> libros = new ArrayList<>();
        String consulta = " select * from libro ";
        try {
            con = cn.getConnection();
            pst = con.prepareStatement(consulta);
            rs = pst.executeQuery();
            while (rs.next()) {                
                Libro libro = new Libro();
                libro.setIdlibro(rs.getInt("idlibro"));
                libro.setNombre(rs.getString("nombre"));
                libro.setCodigo(rs.getString("codigo"));
                libro.setISBN(rs.getString("ISBN"));
                libro.setFecha_publicacion(rs.getString("fecha_publicacion"));
                libro.setStock(rs.getInt("stock"));
                libro.setPrecio_compradecimal(rs.getDouble("precio_compra"));
                libro.setEstado(rs.getString("estado"));
                libros.add(libro);
            }
        } catch (SQLException e) {
            System.out.println("Error: Problemas con el LISTAR");
            System.out.println(e.getMessage());
        }
        return libros;
        
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    public Libro buscarlibro(Libro libro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    public boolean agregarlibro(Libro libro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  
    public boolean editarlibro(Libro libro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
