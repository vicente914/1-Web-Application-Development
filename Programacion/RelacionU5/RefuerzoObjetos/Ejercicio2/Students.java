import java.util.Scanner;
public class Students
{
    private String name;
    private int[] grades = {0,1,2,3,4,5,6,7,8,9,10};
    private int[] studentGrades = new int[9];
    Scanner sc = new Scanner(System.in);
    
    public Students(String name)
    {
        this.name = name;
       
       System.out.printf("Student: %s\nCurrent grades:\n",this.name);
        for(int i = 0; i < studentGrades.length; i++)
        {
            studentGrades[i] = -1;
            System.out.print(studentGrades[i] +" ");
        }
    }
    
    public void addGrade(int grade, int position)
    {
        if(studentGrades[position] == -1)
        {
            studentGrades[position] = grade;
        }
    }

    public void showGrades()
    {
        System.out.println();
        for(int i = 0; i < studentGrades.length; i++)
        {
            System.out.print(studentGrades[i] +" ");
        }
    }

    
}