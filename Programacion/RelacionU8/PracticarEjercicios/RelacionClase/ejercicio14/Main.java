public class Main{
    public static void main(String[] args){
        Zoologico zoo = new Zoologico();

        Animal gato = new Mamifero("michi","5","casa",true);
        Animal perro = new Mamifero("flaca","14", "casa", true);
        Animal cuervo = new Ave("Vela","2", "bosquetes",5);

        zoo.agregarAnimal(gato);
        zoo.agregarAnimal(perro);
        zoo.agregarAnimal(cuervo);

        //mostramos la lista
        zoo.listarAnimales();
    }
}