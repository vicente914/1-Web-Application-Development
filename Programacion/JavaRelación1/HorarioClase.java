public class HorarioClase
{
	public static void main (String[] args)
	{
		String titulo = "\n\t\t\tHORARIO CLASE DAW BILINGUE:\n";
		titulo += "\n\t\tLunes\tMartes\tMiercoles\tJueves\tViernes\n";
		titulo += "\t\t-----\t------\t---------\t------\t-------\n";
		
		String horario = "\t8:15\tPro\tBD\tBase Datos\tPro\tSI\n";
		horario += "\t9:15\tPro\tBD\tBase Datos\tPro\tSI\n";
		horario += "\t10:15\tSI\tED\tDigitalizacion\tSI\tED\n";
		horario += "\t11:45\tSI\tED\tProgramacion\tBD\tPro\n";
		horario += "\t12:45\tIP1\tLM\tProgramacion\tBD\tPro\n";
		horario += "\t13:45\tIP1\tLM\tLenguaje Marcas\tSOS\tIP1\n";
		
		
		
		System.out.print(titulo+horario);
	}
}
