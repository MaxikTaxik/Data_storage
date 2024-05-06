import java.io.File;
import java.io.FileWriter;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        PhoneBook.addPhone("Max", "777");
        PhoneBook.addPhone("Fox", "777");
        PhoneBook.addPhone("Fox", "999");
        System.out.println(PhoneBook.map);
    }
    

}
