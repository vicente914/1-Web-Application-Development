package objetos;

public class Alumno
{
    private String nombre;
    private String dni;
    private int primeraCalificacion;
    private int segundaCalificacion;
    private int terceraCalificacion;    

    //CONTRUCTORES
    public Alumno(String nombre, String dni)
    {
        this.nombre = nombre;
        this.dni = dni;
        this.primeraCalificacion = -1;
        this.segundaCalificacion = -1;
        this.terceraCalificacion = -1;
        System.out.printf("El alumno %s todavía no ha sido calificado\nNotas:\nPrimer trimestre: %d\nSegundo trimestre: %d\nTercer trimestre: %d\n",nombre,this.primeraCalificacion,this.segundaCalificacion,this.terceraCalificacion);
    }

    public Alumno()
    {
        this.nombre = nombre;
        this.primeraCalificacion = -1;
        this.segundaCalificacion = -1;
        this.terceraCalificacion = -1;
        System.out.println("Este es el Alumno: "+nombre);
    }


    // METODOS SET PARA ESTABLECER VALORES
    public void setNombreAlumno(String nombre)
    {
        this.nombre = nombre;
    }

    public void setDniAlumno(String dni)
    {
        this.dni = dni;
    }

    public void setPrimeraCalificacion(int primeraCalificacion)
    {
        this.primeraCalificacion = primeraCalificacion;
    }

    public void setSegundaCalificacion(int segundaCalificacion)
    {
        this.segundaCalificacion = segundaCalificacion;
    }

    public void setTerceraCalificacion(int terceraCalificacion)
    {
        this.terceraCalificacion = terceraCalificacion;
    }

    // METODOS GET PARA PEDIR VALORES
    public String getNombreAlumno()
    {
        return nombre;
    }

    public String getDniAlumno()
    {
        return dni;
    }

    public int getPrimerTrimestre()
    {
        return primeraCalificacion;
    }

    public int getSegundoTrimestre()
    {
        return segundaCalificacion;
    }

    public int getTercerTrimestre()
    {
        return terceraCalificacion;
    }

    public int calificacionFinal()
    {
        int media = (primeraCalificacion + segundaCalificacion + terceraCalificacion) / 3;

        if(primeraCalificacion == -1 || segundaCalificacion == -1 || terceraCalificacion == -1)
        {
            media = -1;
        }

        return media;
    }

    public void informeAlumno()
    {
        System.out.println();
        System.out.printf("Datos del alumno: \nNombre: %s\nDNI: %s\nPrimer trimestre: %d\nSegundo trimestre: %d\nTercer trimestre: %d\nNota final: %d\n",nombre,dni,primeraCalificacion,segundaCalificacion,terceraCalificacion,calificacionFinal());
        
    }
}