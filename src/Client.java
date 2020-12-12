public class Client extends Person{
    private String bank;

    public Client(String name, String bank) {
        super(name);
        this.bank = bank;
    }

    @Override
    public void Display() {
        System.out.println("Client name:"+getName()+" Bank:"+bank);
    }
}
