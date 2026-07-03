import java.util.Scanner;
import java.util.regex.*;
public class Regular1
{
	public static void main(String [] args)
	{
		//Variables y objetos
		Scanner sc = new Scanner(System.in);
		String regex = "[a-zA-Z]+";
		String comprobar = "Pene";

		Pattern patron = Pattern.compile(regex);
		Matcher m = patron.matcher(comprobar);

		if (m.matches())
		{
			System.out.println("Valido");
		}
		else
		{
			System.out.println("NO VALIDO");
		}
	}
}