public class Provincia{
    //atributos
    private String abreviatura, nombre;
    private int codPostal;

    //constructor
    public Provincia(String abreviatura, String nombre, int codPostal){
        this.abreviatura = abreviatura;
        this.nombre = nombre;
        this.codPostal = codPostal;
    }

    //metodos
    public String getAbreviatura(){
        return abreviatura;
    }

    public String getNombre(){
        return nombre;
    }

    public int getCodPostal(){
        return codPostal;
    }

    @Override
    public String toString(){
        return String.format("{%s, %s, %d}",abreviatura,nombre,codPostal);
    }
}