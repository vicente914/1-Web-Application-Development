public class Par implements Comparable<Par>{
//atributos de clase
private String clave;
private int valor;

//constructores
public Par(String clave, int valor){
    this.clave=clave;
    this.valor=valor;
}

//Metodos
    public String getClave(){
    return clave;
    }
    public int getValor(){
    return valor;
    }
    public void setClave(String clave){
    this.clave=clave;
    }
    public void setValor(int valor){
    this.valor=valor;
    }

    @Override
    public String toString(){
    return String.format("{%s,%d}",clave,valor);
    }
    @Override
    public int hashCode(){
    return clave.hashCode();
    }

    @Override
    public boolean equals(Object obj){
        boolean iguales= false;
        if(this.clave.equals(((Par)obj).clave) && this.valor==((Par)obj).valor){
            iguales=true;
        }
        return iguales;
    }
    @Override
    public int compareTo(Par otro){
        int salida=0; //negativo 0 o positivo
        if(this.valor<otro.valor){
        salida=1;
    }
        else if (this.valor<otro.valor){
        salida=-1;
    }
        return salida;
    }
    public static void main(String[]args){
        //Crear un objeto par
        Par p1 = new Par("Granada",18);
        System.out.println(p1);
        p1.setClave("Grana");
        System.out.println(p1.getClave());
    }
}