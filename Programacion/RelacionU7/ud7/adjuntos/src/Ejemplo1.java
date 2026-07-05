public class Ejemplo1{
	//Atributos
	private int a;
	private int b;
	private int c;
	//Constructor con dos parametros
	public Ejemplo1(int a, int b){
		this.a=a;
		this.b=b;
	}
	//Constructor con tres parametros
	public Ejemplo1(int a, int b, int c){
		this(a,b); //llamada al constructor con dos parámetros
		this.c=c;
	}
	@Override
	public String toString(){
		return "a: "+a+"\nb: "+b+"\nc: "+c+"\n";
	}
	public static void main(String [] args){
		Ejemplo1 ej1 = new Ejemplo1(1,2);
		System.out.println(ej1);
		Ejemplo1 ej2 = new Ejemplo1(3,4,5);
		System.out.println(ej2);
	}
}