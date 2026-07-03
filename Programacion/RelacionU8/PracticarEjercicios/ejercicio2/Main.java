public class Main{
    public static void main(String[] args){
        Historial historial = new Historial();

        historial.visitar("google.com");
        historial.visitar("stackoverflow");
        historial.visitar("github.com");

        //mostramos el historial
        historial.mostrarHistorial();

        historial.visitar("youtube.com");
        historial.visitar("google.com");

        historial.mostrarHistorial();

    }
}