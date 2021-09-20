package grades;
import java.util.HashMap;
public class GradesApplication {






    public static void main(String[] args) {
       HashMap<String, Integer> username = new HashMap<>();
        username.put("Serguio", 90);
        username.put("Kristen", 85);
        username.put("Noah", 75);
        username.put("Salvador", 80);
        System.out.println(username);
    }
}
