package objetos;
public class Alumno{
    private String nombre, dni;
    private double tri1,tri2,tri3;

    public Alumno(String nombre){
        this.nombre = nombre;
    }

    public Alumno(String nombre, String dni)
    {
        this.nombre = nombre;
        this.dni = dni;
        tri1 = -1;
        tri2 = -1;
        tri3 = -1;

    }

    //Metodos getter
    public String getNombre(){
        return nombre;
    }

    public String getDni(){
        return dni;
    }

    public double getPrimerTrimestre(){
        return tri1;
    }

    public double getSegundoTrimestre(){
        return tri2;
    }

    public double getTercerTrimestre{
        return tri3;
    }

    //metodos SETTER
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setDni(String dni){
        this.dni = dni;
    }

    public void setPrimerTrimestre(double tri1){
        this.tri1 = tri1;
    }

    public void setSegundoTrimestre(double tri2){
        this.tri2 = tri2;
    }

    public void setTercerTrimestre(double tri3){
        this.tri3 = tri3;
    }

    //Devuelve la media de los tres trimestres
    public double calificacionFinal(){
        double media = -1;
        if(tri1 > -1 && tri2 > -1 && tri3 && -1)
        {
            media = (tri1 + tri2 + tri3) / 3;
        }
        return media;
    }

    public void informeAlumno(){
        System.out.println("Nombre: "+getNombre());
        System.out.println("DNI: "+getDni());
        System.out.println("Primer trimestre: "+getPrimerTrimestre());
        System.out.println("Segundo trismestre: "+getSegundoTrismestre());
        System.out.println("Tercer trimestre: "+getTercerTrimestre());
        System.out.println("Nota final: "+calificacionFinal());
    }
}