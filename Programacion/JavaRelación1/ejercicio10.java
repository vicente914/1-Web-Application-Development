import java.util.Scanner;
public class ejercicio10
{
	public static void main(String[] args)
	{
		//Variables y objetos
		Scanner sc = new Scanner(System.in);
		double parcial1, parcial2, parcial3, parcialFinal, examenFinal, trabajoFinal, calificacion;
		
		//Resolución del problema
		System.out.print("Dime la nota de la primera parcial: ");
		parcial1 = sc.nextDouble();
		System.out.print("Dime la nota de la segunda parcial: ");
		parcial2 = sc.nextDouble();
		System.out.print("Dime la nota de la tercera parcial: ");
		parcial3 = sc.nextDouble();
		
		parcialFinal = (parcial1+parcial2+parcial3)/3;
		System.out.print("Dime la nota del examen final: ");
		examenFinal = sc.nextDouble();
		System.out.print("Dime la nota del trabajo final: ");
		trabajoFinal = sc.nextDouble();
		
		calificacion = (parcialFinal*0.55)+(examenFinal*0.30)+(trabajoFinal*0.15);
		
		System.out.printf("La calificación final de el alumno es %.2f\n",calificacion);
	}
}
