package exam1;

public class Exam1 {
    public static void main(String[] args) {
        Car car = new SuperCar();
        car.setName("フェラーリ");
        car.putOnGas();
        car.run();

        Car ecar = new EcoCar();
        ecar.setName("プリウス");
        ecar.putOnGas();
        ecar.run();
    }
}
