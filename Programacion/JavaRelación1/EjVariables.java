public class EjVariables
{
	//Declaración de variables y objetos
	public static void main(String[] args)
	{
		//Variables tipo entero
		
		byte elByte = 1;
		short elShort = 128;
		int elInteger = 32768;
		long elLong = 2147483648L; //Hay que especificarle que es tipo long, se puede en mayusculas y minusculas
		
		//Variables tipo real
		float elFloat = 10.5f; //Se añade la inicial f, se indica que es float porque por defecto lo hace double.
		double elDouble = 1080.653;
		
		//Variables tipo boolean
		boolean elBoolean = true;
		
		//Caracteres
		char elChar = 'a'; //NO OLVIDARSE de utilizar comillas simples con las variables tipo CHAR
		
		//Resolver el problema
		System.out.println(elByte +"," + elShort + "," + elInteger + "," + elLong); //improvisamos con comas entre las variables para que no se sumen
		
		System.out.println(elFloat +"\n" + elDouble); //La \n es un salto de línea
		
		System.out.println(elBoolean);
		System.out.println(elChar);
		
		//Quiero escribir "Que alegría verte" con comillas
		System.out.println("\"Que alegría verte\"");
		
		/*
		podemos inventarnos public class enum la cual sirve para hacer una especie de lista con datos
		\n sirve para saltos de lineas
		\"\" sirve para hacer comillas en una linea de texto string
		var1 += var2 te concatena var1 con var2 directamentealla
		\t sirve para hacer tabuladores en el texto que sale por pant
		*/
	}
}
