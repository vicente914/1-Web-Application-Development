package objetos;
import java.util.Scanner;
public class Modulo(){
    private String nombre, profesor;
    private int curso;
    private Alumno[] alumnos;
    private Scanner sc = new Scanner(System.in);

    public Modulo(String nombre, String profesor, int curso){
        this.nombre = nombre;
        this.profesor = profesor;
        this.curso = curso;
        this.alumnos = new Alumno[5];
    }

    //Metodos setter

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setProfesor(String profesor){
        this.profesor = profesor;
    }

    public void setCurso(int curso){
        this.curso = curso;
    }

    public void setAlumnos(){
       for(int i = 0; i < alumnos.length; i++)
       {
            System.out.println("Introduce un alumno");
            String nombre = sc.nextLine();
            alumnos[i] = new Alumno(nombre);
       }
    }

    //Metodos GETTER
    public String getNombre(){
        return nombre;
    }

    public String getProfesor(){
        return profesor;
    }

    public int getCurso(){
        return curso;
    }

    public void getAlumnos(){
        for(int i = 0; i < alumnos.length; i++)
        {
            System.out.println(i +": "+ alumnos[i].getNombre());
        }
    }
    

    public double calcularMediaTrimestre(int trimestre){
        //variable
        int i = 0;
        double media = 0;
        boolean evaluado = true;

        switch(trimestre)
        {
            case 1:
                for(i = 0; i < alumnos.length && evaluado; i++)
                {
                    if(alumnos[i].getPrimerTrimestre() != -1){
                        media += alumnos[i].getPrimerTrimestre();
                    }
                    else
                    {
                        media = -1;
                        evaluado = false;

                    }
                }
                break;
            case 2:
                for(i = 0; i < alumnos.length && evaluado; i++)
                {
                    if(alumnos[i].getSegundoTrimestre() != -1)
                    {
                        media += alumnos[i].getSegundoTrimestre;
                    }
                    else
                    {
                        media = -1;
                        evaluado = false;
                    }
                }
                break;
            case 3:
                break;
        }
    }

}