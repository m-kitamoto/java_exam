

public class Q6 {
    public static void main(String[] args) {
        double num1 = Math.floor(Math.random() * 10);
        double num2 = Math.floor(Math.random() * 10);
        double num3 = Math.floor(Math.random() * 10);

        double[] all = { num1, num2, num3 };
        System.out.println(all.toString());
        
    }

    @Override
    public String toString() {
        return "@[" + "num1" + "num2" + "num3" +"]";
        
    }

}
