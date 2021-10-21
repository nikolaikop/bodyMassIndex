public class BmiService {
    double weight, height;

    public double calculate() {
        double index = weight / Math.pow(height, 2);
        return index;
    }
}