public class Alumno{
    //atributos
    private String nombre, edad;

    //constructor
    public Alumno(String nombre, String edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    //metodos
    public String getNombre(){
        return nombre;
    }

    public String getEdad(){
        return edad;
    }

    public void setEdad(String edad){
        this.edad = edad;
    }

    @Override
    public String toString(){
        return String.format("{%s, %s}", nombre, edad);
    }
}