public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight;
        double high;
        weight = 86;
        high = 1.68;
        int index = service.calculate(weight, high);
        System.out.println("Ваш индекс массы тела равен - " + index);

    }
}