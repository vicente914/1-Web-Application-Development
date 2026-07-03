package objetos;
import java.util.regex.*;

public class Motocicleta{
    private int cv;
    private int kilometrosHora;
    private String matricula;
    String patron = "[0-9]{4}[A-Z]{3}";

    public Motocicleta(String nombre)
    {
        System.out.println("Bienvenido "+nombre);
    }

    public Motocicleta(int cv, int kilometrosHora, String matricula) throws Exception
    {
            Pattern pattern = Pattern.compile(patron);
            Matcher m = pattern.matcher(matricula);

            if(m.matches())
            {
                this.cv = cv;
                this.kilometrosHora = kilometrosHora;
                this.matricula = matricula;
                System.out.printf("La motocicleta tiene:\n%d caballos de potencia\nAlcanza %d Kilometros hora\nSu matricula es %s\n",cv,kilometrosHora, matricula);
            }
            else
            {
                Exception exception = new Exception("Matricula incorrecta");
                throw exception;
            }
       
       
    }


    public int getCV()
    {
        return cv;
    }

    public int getKilometrosHora()
    {
        return kilometrosHora;
    }

    public String getMatricula()
    {
        return matricula;
    }

    public void setCv(int cv)
    {
        this.cv = cv;
    }

    public void setKilometrosHoras(int kilometrosHora)
    {
        this.kilometrosHora = kilometrosHora;
    }

    public void setMatricula(String matricula) throws Exception
    {
        Pattern pattern = Pattern.compile(patron);
        Matcher m = pattern.matcher(matricula);
        if(m.matches())
        {
            this.matricula = matricula; 
        }
        else
        {
            System.out.println("Matrícula introducida INCORRECTA");
            Exception exception = new Exception("Matricula incorrecta");
            throw exception;
        }
    }
}