public class Employer extends Person{
    private String company;

    public Employer(String name,String comp) {
        super(name);
        this.company=comp;
    }

    public String getCompany() {
        return company;
    }

    @Override
    public void Display() {
        System.out.println("Employer name:"+getName()+" Company:"+company);
    }
}
