package objetos;
import java.util.regex.*;
public class Motocicleta{
    private int cv, velocidadPunta;
    private String matricula;

    public Motocicleta(){}

    public Motocicleta(int cv, int velocidadPunta, String matricula)throws Exception{
        Pattern pattern = Pattern.compile("[0-9]{4}[A-Z]{3}");
        Matcher m = pattern.matcher(matricula);
        if(m.matches())
        {
            this.cv = cv;
            this.velocidadPunta = velocidadPunta;
            this.matricula = matricula;
        }
        else
        {
            Exception exception = new Exception("Matricula incorrecta");
            throw exception;
        }
        
    }

    //Metodo getter
    public int getCv(){
        return cv;
    }

    public int getVelocidadPunta(){
        return velocidadPunta;
    }

    //Metodo que muestra la matricula completa
    public String mostrarMatricula(){
        return matricula;
    }

    //Metodos setter
    public void setCv(int cv){
        this.cv = cv;
    }

    public void setVelocidadPunta(int velocidadPunta){
        this.velocidadPunta = velocidadPunta;
    }

    public void setMatricula(String matricula) throws Exception{
      Pattern patron = Pattern.compile("[0-9]{4}[A-Z]{3}");
      Matcher m = patron.matcher(matricula);
      if(m.matches())
      {
        this.matricula = matricula;
      }
      else
      {
        Exception exception = new Exception("Matricula incorrecta");
        throw exception;
      }
    }



}