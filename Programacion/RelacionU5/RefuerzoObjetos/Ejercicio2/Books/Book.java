public class Book
{
    private String writer;
    private int pages;
    private String title;
    private double price;


    public Book(String writer, String title, int pages, double price)
    {
        this.writer = writer;
        this.title = title;
        this.pages = pages;
        this.price = price;
    }

    public void bookData()
    {
        System.out.printf("Writer: %s\nTitle: %s\nNumber of pages: %d\nPrice: %.2f\n",writer,title,pages,price);
    }
}