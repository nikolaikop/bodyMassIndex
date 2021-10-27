import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        Scanner console = new Scanner(System.in);
        System.out.println("Введите ваш вес в кг");
        double weight = console.nextDouble();
        System.out.println("Введите ваш рост в см");
        double height = console.nextDouble() / 100;
        String result = String.format("%.2f", service.calculate(weight, height));
        System.out.println("Индекс вашей массы тела составит: " + result);
    }
}
