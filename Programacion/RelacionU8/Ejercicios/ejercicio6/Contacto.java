public class Contacto implements Comparable<Contacto>{
    //Atributos
    private String nombre, telefono, correo;

    //constructor
    public Contacto(String nombre, String telefono, String correo){
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
    }

    //Metodos
    public String getNombre(){
        return this.nombre;
    }

    public String getTelefono(){
        return this.telefono;
    }

    public String getCorreo(){
        return this.correo;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setTelefono(String telefono){
        this.telefono = telefono;
    }

    public void setCorreo(String correo){
        this.correo = correo;
    }

    //Método para darle un formato de comparacion a los contactos
    //Comparamos y ordenamos mediante nombres en este caso 
    @Override
    public int compareTo(Contacto otro){
        return this.nombre.compareTo(otro.nombre);
    }

    @Override
    public String toString(){
        return String.format("Nombre: %s",nombre);
    }
}