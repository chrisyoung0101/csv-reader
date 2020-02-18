

public class App {

    public static void main(String[] args) {

        System.out.println("Hey");

        Customer bob = new Customer();

        bob.setfName("bob");

        System.out.println(bob.getfName());

        //Customer.readFromFile("dan@email.com");

        System.out.println(Customer.readFromFile("dan@email.com"));

        Customer fred = new Customer();
        fred.setfName("Fred");
        fred.setlName("Dred");
        fred.setAddress("312 Wantanabe Cove, TX 99182");
        fred.setEmail("fred@email.com");
        System.out.println(fred.toString());

        fred.saveToFile();

        Customer jeb = new Customer("Jeb", "Razzle", "145 Unitarian Way, AR 72401", "jed@email.com");

        jeb.saveToFile();

    }

}
