public class Book implements Printable,Searchable
{
    private String name;
    private String author;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    @Override
    public void print() {
        System.out.println("Name:"+name+" Author:"+author);
    }

    @Override
    public void search() {
        System.out.println(" Author:"+author);
    }
}
