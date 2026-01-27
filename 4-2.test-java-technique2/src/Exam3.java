import java.util.ArrayList;
import java.util.List;

public class Exam3 {
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        Employee emp1 = new Employee();
        emp1.setName("後藤");
        emp1.setAge(31);
        employees.add(emp1);

        Employee emp2 = new Employee();
        emp2.setName("山田");
        emp2.setAge(28);
        employees.add(emp2);

        Employee emp3 = new Employee();
        emp3.setName("佐藤");
        emp3.setAge(25);
        employees.add(emp3);

        Employee emp4 = new Employee();
        emp4.setName("田中");
        emp4.setAge(19);
        employees.add(emp4);

        for (Employee emp : employees) {
            System.out.println(emp.getName() + "(" + emp.getAge() + "歳)");
        }
    }
}
