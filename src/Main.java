public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height = 1.70;
        int weight = 77;
        double index = service.calculate(height, weight);
        System.out.println(index);
    }
}
