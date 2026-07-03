public class Main{
    public static void main(String[] args){
        ListaAlumnos lista = new ListaAlumnos();

        Alumno a1 = new Alumno("Vicente","18");
        Alumno a2 = new Alumno("Mateo", "20");
        
        lista.agregarAlumno(a1);
        lista.agregarAlumno(a2);

        lista.mostrarAlumnos();

        System.out.println(lista.buscarAlumno("Vicente"));

        a1.setEdad("55");

        System.out.println("***** LISTA MODIFICADA *****");
        lista.mostrarAlumnos();

        //mostramos la lista ordenada
        System.out.println("**********************************");
        System.out.println("ORDENADO POR NOMBRE");
        lista.ordenar();
        lista.mostrarAlumnos();


        System.out.println("******************");
        System.out.println("ORDENADO POR EDAD");
        lista.ordenarPorEdad();
        lista.mostrarAlumnos();
    }
}