import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        PhoneBook book = new PhoneBook();
        book.addPhone("Fax", "+79065467534");
        book.addPhone("Fax", "+79843627899");
        book.addPhone("Fax", "+79025673846");
        book.addPhone("Fax", "+79056473892");
        book.addPhone("Max", "+79086443893");
        book.addPhone("Max", "+79748665573");
        book.addPhone("Jax", "+76766777366");
        book.addPhone("Vax", "+79046735664");
        book.deletePhone("Fax", "+79843627899");
        book.printBook();
        }
}
