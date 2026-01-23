import java.time.LocalDate;

public class Exam5 {
    public static void main(String[] args) {
        LocalDate localdate = LocalDate.of(1979,7,27);
        
        int year = localdate.getYear();
        int month = localdate.getMonthValue();
        int day = localdate.getDayOfMonth();

        System.out.println("私の誕生日は" + year + "年" + month + "月" + day + "日です");
    }
}
