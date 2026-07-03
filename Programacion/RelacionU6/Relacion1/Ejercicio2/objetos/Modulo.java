package objetos;
import java.util.Scanner;
public class Modulo
{
    private String nombre;
    private int curso;
    private String profesor;
    private Alumno[] alumnos;
    private Scanner sc = new Scanner(System.in);

    public Modulo(String nombre, int curso, String profesor)
    {
        System.out.println();
        this.nombre = nombre;
        this.curso = curso;
        this.profesor = profesor;
        this.alumnos = new Alumno[5];
    }

    //METODOS SET
    public void setNombreModulo(String nombre)
    {
        this.nombre = nombre;
    }

    public void setCursoModulo(int curso)
    {
        this.curso = curso;
    }

    public void setProfesorModulo(String profesor)
    {
        this.profesor = profesor;
    }

    //Para establecer los nombres de cada alumno del array clase
    public void setAlumnosClase()
    {
        for(int i = 0; i < alumnos.length; i++)
        {
            System.out.print("Introduce el nombre del alumno: ");
            String nombre = sc.nextLine();
            alumnos[i] = new Alumno(nombre, "12345Y");
        }
        
    }

    public void getAlumnos()
    {
        for(int i = 0; i < alumnos.length; i++)
        {
            System.out.println(i +": "+ alumnos[i].getNombreAlumno());
        }
    }

    
    
    public double calcularMediaTrimestre(int trimestre)
    {
        //VARIABLES
        int i = 0;
        boolean evaluado = true;
        double media = 0;


        switch(trimestre)
        {
            case 1:
                for(i= 0; i < alumnos.length && evaluado;i++)
                {
                    if(alumnos[i].getPrimerTrimestre() != -1)
                    {
                        media += alumnos[i].getPrimerTrimestre();
                    }
                    else
                    {
                        evaluado = false;
                        media = -1;
                    }   
                } 
                break;

            case 2:
                for(i= 0; i < alumnos.length && evaluado;i++)
                {
                    if(alumnos[i].getSegundoTrimestre() != -1)
                    {
                        media += alumnos[i].getSegundoTrimestre();
                    }
                    else
                    {
                        evaluado = false;
                        media = -1;
                    }
                } 
                break;

            case 3:
                for(i= 0; i < alumnos.length && evaluado;i++)
                {
                    if(alumnos[i].getTercerTrimestre() != -1)
                    {
                        media += alumnos[i].getTercerTrimestre();
                    }
                    else
                    {
                        evaluado = false;
                        media = -1;
                    }
                } 
                break;
        }
        if(media != -1)
            media = media/alumnos.length;
        return media;
    }
    
    
    
    public void informeCurso()
    {
        for(int i = 0; i < 5; i++)
        {
            alumnos[i].informeAlumno();

        }
    }
    
}