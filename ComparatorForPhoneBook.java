import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class ComparatorForPhoneBook implements Comparator <Map.Entry<String, List<String>>>{
    public int compare (Map.Entry<String, List<String>> a, Map.Entry<String, List<String>> b) {
        int numberA = a.getValue().size();
        int numberB = b.getValue().size();
        Integer integerNumberA = numberA;
        Integer integerNumberB = numberB;
        return integerNumberA.compareTo(integerNumberB);
    }
    
}
