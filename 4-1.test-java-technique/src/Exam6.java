import java.time.LocalDateTime;

public class Exam6 {
    public static void main(String[] args) {
        LocalDateTime localdateTime = LocalDateTime.of(1543,02,10,05,12);
        
        System.out.println("徳川家康の誕生日は" + localdateTime + "です");

        localdateTime = localdateTime.plusYears(1);
        localdateTime = localdateTime.plusMonths(2);
        localdateTime = localdateTime.plusDays(3);
        localdateTime = localdateTime.plusHours(4);
        localdateTime = localdateTime.plusMinutes(5);
    
        System.out.println("1年2ヵ月3日4時間5分後は" + localdateTime + "です");
    }
}
