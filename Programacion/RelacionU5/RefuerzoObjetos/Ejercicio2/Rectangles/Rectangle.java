public class Rectangle
{
    private double width;
    private double height;

    public Rectangle(double width, double height)
    {
        this.width = width;
        this.height = height;
    }

    public void calculateArea()
    {
        double result = width * height;
        System.out.println("Result: "+result);
    }
}