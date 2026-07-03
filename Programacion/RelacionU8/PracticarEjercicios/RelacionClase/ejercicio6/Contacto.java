public class Contacto implements Comparable<Contacto>{
    //atributos
    private String nombre, telefono, correo;

    //constructor
    public Contacto(String nombre, String telefono, String correo){
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
    }

    //metodos
    @Override
    public String toString(){
        return String.format("{%s, %s, %s}",nombre, telefono, correo);
    }

    @Override
    public int compareTo(Contacto otro){
        return nombre.compareTo(otro.nombre);
    }
}