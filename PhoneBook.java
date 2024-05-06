import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
    public HashMap<String, List<String>> map = new HashMap<>();
    public void addPhone(String name, String phone) {
        if (!map.containsKey(name)) {
            map.put(name, new ArrayList<>());
        }
        map.get(name).add(phone);
    }

    public void deletePhone(String name, String phone){
        try {
            if (map.get(name).size() > 1) {
                map.get(name).remove(phone);
            }
            else if (map.get(name).size() == 1 || map.get(name).size() == 0 ) {
                map.remove(name);
            }
        } catch (Exception e) {
            System.out.println("Нет такого имени в книге.");
            // TODO: handle exception
        }

        
        
    }
    public void printBook(){
        List<Map.Entry<String, List<String>>> entries = new ArrayList<>(this.map.entrySet());
        ComparatorForPhoneBook pcomp = new ComparatorForPhoneBook();
        entries.sort(pcomp);
        System.out.println(entries);


}
}