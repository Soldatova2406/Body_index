public class BmiService {
    public int calculate(int weight, double high) {
        int index = (int) (weight / Math.pow(high, 2));

        return index;
    }
}
