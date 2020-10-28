package modeloDAO;
import java.sql.*;
import config.bd.ConectaBd;
import java.util.ArrayList;
import java.util.List;
import interfaces.CRUD2;
import modelo.Autor;


public class autorDAO implements CRUD2 {

    ConectaBd cn = new ConectaBd();
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    Autor e = new Autor();
    public List listarautor() {
        ArrayList<Autor> autores = new ArrayList<>();
        String consulta = " select * from autor ";
        try {
            con = cn.getConnection();
            pst = con.prepareStatement(consulta);
            rs = pst.executeQuery();
            while (rs.next()) {                
                Autor autor = new Autor();
                autor.setIdautor(rs.getInt("idautor"));
                autor.setNombre(rs.getString("nombre"));
                autor.setApellidos(rs.getString("apellidos"));
                autor.setNacionalidad(rs.getString("nacionalidad"));
                autor.setDni(rs.getString("dni"));
                autor.setEstado(rs.getString("estado"));
                
                autores.add(autor);
            }
        } catch (SQLException e) {
            System.out.println("Error: Problemas con el LISTAR");
            System.out.println(e.getMessage());
        }
        return autores;
        
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Autor buscarautor(Autor autor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean agregarautor(Autor autor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean editarautor(Autor autor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
