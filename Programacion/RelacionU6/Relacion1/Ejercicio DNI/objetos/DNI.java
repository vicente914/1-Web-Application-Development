public class DNI{
    //ATRIBUTOS
    private int numDNI;


    //Metodos

    public int obtenerDNI(){
        return numDNI;
    }

    public String obtenerNIF(){
        return numDNI + calcularLetraNIF(numDNI);
    }

    public void establecer(String nif) throws Exception{

    }

    public void establecer (int dni) throws Exception{

    }

    private static char calcularLetraNIF(int dni){

    }

    private boolean validarNIF(String nif){

    }

    private static char extraerLetraNIF(String nif){
        return nif.charAt(nif.length() - 1);
    }

    private static int extraerNumeroNIF(String nif){
        return Integer.parseInt(nif.substring(0,nif.length()-1))
    }
}