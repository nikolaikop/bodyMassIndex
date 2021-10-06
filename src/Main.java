import java.util.Scanner;

public class Main {
    public static double weight, height;
    public static void main(String[] args) {
        BmiService service = new BmiService();
        Scanner console = new Scanner(System.in);
        System.out.println("Введите ваш вес в кг");
        weight = console.nextDouble();
        System.out.println("Введите ваш рост в см");
        height = console.nextDouble() / 100;
        String result = String.format("%.2f", service.calculate());
        System.out.println("Индекс вашей массы тела составит: " + result);
    }
}