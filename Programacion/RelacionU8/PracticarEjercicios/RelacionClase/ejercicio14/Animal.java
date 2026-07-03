public abstract class Animal{
    protected String nombre, edad, habitat;

    public Animal(String nombre, String edad, String habitat){
        this.nombre = nombre;
        this.edad = edad;
        this.habitat = habitat;
    }

    //metodos
    public String getNombre(){
        return nombre;
    }

    public String getEdad(){
        return edad;
    }

    public String getHabitat(){
        return habitat;
    }

    @Override
    public String toString(){
        return String.format("Nombre: %s\nEdad: %s\nHabitat: %s\n",nombre,edad,habitat);
    }
}