public class BmiService {
    public double calculate() {
        double index = Main.weight / Math.pow(Main.height, 2);
        return index;
    }
}