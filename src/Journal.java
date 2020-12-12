public class Journal implements Printable,Searchable
{
    private String name;

    public Journal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void print() {
        System.out.println("Name:"+name);
    }

    @Override
    public void search() {
        System.out.println("NO");
    }
}
