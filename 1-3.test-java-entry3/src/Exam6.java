public class Exam6 {
    public static void main(String[] args) {
        System.out.println(calc(2, 3, '+'));
    }

    static int calc(int num1, int num2, char apply) {
        if (apply == '+') {
            return num1 + num2;
        } else if (apply == '-') {
            return num1 - num2;
        } else if (apply == '*') {
            return num1 * num2;
        } else if (apply == '/') {
            return num1 / num2;        
        } else {
            return -1;
        }
    }
}
