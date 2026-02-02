import java.util.HashMap;
import java.util.Map;

public class Q5 {
    public static void main(String[] args) {
        String[] contries = {"soccer", "baseball", "jogging", "jogging", "soccer", "surfing", "surfing", "soccer", "surfing", "baseball", "boxing", "surfing", "soccer", "surfing", "jogging", "boxing", "jogging", "baseball", "soccer", "soccer"};

        Map<String,Integer> map = new HashMap<>();
        int cnt = 0;
        for (String country : contries) {
            if (country == null){
                cnt++;
                map.put(country, cnt);
            } else {
                map.put(country, map.get(country) + 1);
            }
            

        }
        
    }
}
