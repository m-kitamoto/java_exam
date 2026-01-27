import java.util.ArrayList;
import java.util.List;

public class Exam1 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("後藤");
        names.add("山田");
        names.add("佐藤");
        names.add("田中");

        for (String name : names) {
            System.out.println(name);
        }
    }
}
