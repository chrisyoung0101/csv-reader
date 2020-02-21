import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;

public class App {

    public static void main(String[] args) throws IOException {

//        System.out.println("Hey");
//
//        Customer bob = new Customer();
//
//        bob.setfName("bob");
//
//        System.out.println(bob.getfName());
//
//        //Customer.readFromFile("dan@email.com");
//
//        System.out.println(Customer.readFromFile("dan@email.com"));
//
//        Customer fred = new Customer();
//        fred.setfName("Fred");
//        fred.setlName("Dred");
//        fred.setAddress("312 Wantanabe Cove, TX 99182");
//        fred.setEmail("fred@email.com");
//        System.out.println(fred.toString());
//
//        fred.saveToFile();
//
//        Customer jeb = new Customer("Jeb", "Razzle", "145 Unitarian Way, AR 72401", "jed@email.com");
//
//        jeb.saveToFile();
        // email = "dan@email.com";
        Customer customer = new Customer();

        //customer.readFromFile(email);

        //System.out.println(customer.readFromFile(email));
        //customer.saveToFile();

        //"." current directory
        new ArrayList<String>().toArray();
        Object[] filesList;

        filesList = Files.list(Paths.get("./Customer-IN")).toArray();

       // System.out.println(Arrays.toString(filesList));

        for(int i = 0; i < filesList.length; i++) {
//            System.out.println(filesList[i] + " hi");
            String str = filesList[i].toString().replace("./Customer-IN/", "");
            str = str.replace(".txt", "");
            //.out.println(str);
            System.out.println(customer.readFromFile(str));

        }
    }
}
