package vistacontrol;
import java.util.List;
import modelo.Libro;
import modelo.Autor;
import modeloDAO.autorDAO;
import modeloDAO.libroDAO;
import utils.leer;


public class index {
     public static void listarlibro()
    {
        libroDAO libroDAO = new libroDAO();
        List<Libro>libros = libroDAO.listarlibro();
        System.out.println("Listado de libros");
        for (Libro libro : libros) {
            System.out.println(libro.getIdlibro()+ "\t"+
                               darFormato(libro.getNombre())+ "\t"+
                               darFormato(libro.getCodigo())+"\t"+
                               darFormato(libro.getISBN())+
                               (libro.getFecha_publicacion())+"\t"+
                               (libro.getStock())+"\t"+
                               (libro.getPrecio_compra())+"\t"+                              
                              darFormato( libro.getEstado())
                    
                    );
        }
    }
     public static void listarautor()
     {
         autorDAO autorDAO = new autorDAO();
        List<Autor>autores = autorDAO.listarautor();
        System.out.println("Listado de autores");
        for (Autor autor : autores) {
            System.out.println(autor.getIdautor()+ "\t"+
                               darFormato(autor.getNombre())+ "\t"+
                               darFormato(autor.getApellidos())+"\t"+
                               darFormato(autor.getNacionalidad())+"\t"+
                               (autor.getDni())+"\t"+
                               (autor.getEstado())
                    );
     }
     }
     
     
     
     
     
     public static String darFormato(String cadena){
        if (cadena.length()>=15) {
            cadena = cadena.substring(0,12) + "  "+" ";
        }else if (cadena.length()>=8) {
        	cadena = cadena + "";
        }else if (cadena.length()>=4) {
            cadena = cadena + "\t";
        }else if (cadena.length()>=2){
            cadena = cadena + "\t\t";
        }
        else if (cadena.length()==7) {
        	cadena = cadena + "\t";
        }
         else {
            cadena = cadena + "\t";
        }
        
        return cadena;
    }
     public static void salir()
     {
         System.out.println("Gracias por visitarnos ");
     }
     public static void menu()
     {
         System.out.println("1.Listar Libros");
         System.out.println("2.Listar Autores");
         System.out.println("3.Salir");
         System.out.println("Agregando nueva linea");
        
     }
    public static void inicio()
     {
         int op;
         do {             
             menu();
             op = leer.entero();
             switch(op)
             {
                 case 1:
                  listarlibro();
                  break;
                  case 2:
                   listarautor();
                    break;
                    case 3:
                        salir();
                  break;
                    default:
                        System.out.println("ERROR");
                  break;
             }
         } while (op != 3);
     }
     public static void main(String[] args) {
         inicio();
    }
}
