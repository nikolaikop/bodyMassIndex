import java.util.Scanner;

public class BmiService {
    public double calculate() {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите ваш вес в кг");
        double weight = console.nextDouble();
        System.out.println("Введите ваш рост в см");
        double height = console.nextDouble() / 100;
        double index = weight / Math.pow(height, 2);
        return index;
    }
}