import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PhoneBook {
    public static HashMap<String, List<String>> map = new HashMap<>();
    public static void addPhone(String name, String phone) {
        if (!map.containsKey(name)) {
            map.put(name, new ArrayList<>());
        }
        map.get(name).add(phone);
        
    }


}
