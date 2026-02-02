import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Q2 {
    public static void main(String[] args) {
        LocalTime localTime = LocalTime.of(11, 59, 59);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh時mm分ss秒");

        System.out.print(localTime.format(formatter) + "の1秒後は");

        localTime = localTime.plusSeconds(1);

        System.out.println(localTime.format(formatter) + "です");
        
    }
}
