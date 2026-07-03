package compraonline;
import java.util.regex.*;
public class Producto{
    //Atributos
    private String nombre, marca,fechaRegistro;
    
    //Constructor
    public Producto(String nombre, String marca, String fechaRegistro) throws Exception{
        Pattern patron = Pattern.compile("(3[01]|[21][0-9]|0?[1-9])[/](1[0-2]|0?[1-9])[/][\\d]+");
        Matcher m = patron.matcher(fechaRegistro);
        if(m.matches()){
            this.nombre = nombre;
            this.marca = marca;
            this.fechaRegistro = fechaRegistro;
        }
        else{
            Exception exception = new Exception("Formato de fecha incorrecto");
            throw exception;
        }
    }

    //Metodos
    public void validarFecha(String fechaRegistro) throws Exception{
        Pattern patron = Pattern.compile("(3[01]|[21][0-9]|0?[1-9])[/](1[0-2]|0?[1-9])[/][\\d]+");
        Matcher m = patron.matcher(fechaRegistro);
        if(m.matches()){
            this.fechaRegistro = fechaRegistro;
        }
        else{
            Exception exception = new Exception("Formato de fecha incorrecto");
            throw exception;
        }
    }

    public String toString(){
        return String.format("Nombre: %s\nMarca: %s\nFecha de registro: %s\n");

    }

    //Metodos que necesitamos añadir
    public String getNombre(){
        return nombre;
    }

}