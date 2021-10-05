public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        String result = String.format("%.2f", service.calculate());
        System.out.println("Индекс вашей массы тела составит: " + result);
    }
}