import javax.security.sasl.SaslServer;
import java.util.Scanner;

public class MainClass
{
    public static void main(String[] args) {
//        Person tom=new Person("Tom","");
//        tom.Display();
        Employer jorn=new Employer("John","Samsung");
        jorn.Display();
        Client bob=new Client("Bob","MTS");
        bob.Display();
        //Human human=new Human();
        Rectangle rectangle=new Rectangle(0,0,200,300);
        System.out.println(rectangle.getArea()+" "+rectangle.getPerimetr());
        Circle circle=new Circle(0,0,10);
        System.out.printf("S=%.2f P=%.2f",circle.getArea(),circle.getPerimetr());

        Object sam=new Employer("Sam","Samsung");
        Employer emp=(Employer) sam;
        emp.Display();
        System.out.println(emp.getCompany());
        Object kate=new Employer("Kate","MTS");
        if(kate instanceof Employer)
        {
            ((Employer)kate).Display();
        }
        else
        {
            System.out.println("Conversion is invalid");
        }
        Book printable=new Book("Война и мир","Л.Н. Толстой");
        printable.print();
        printable.search();
        Searchable print=new Journal("За рулем");
        print.search();
    }
}
