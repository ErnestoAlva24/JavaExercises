public class Tuition {
    public static void main(String[] args) {
        double tuition = 10000;
        double cost = 0;

        for (int i = 0; i < 10; i++)
            tuition += tuition * 0.06;

        for (int i = 0; i < 4; i++)
            cost += tuition + tuition * i * 0.06;

        System.out.println("Tuition: $" + tuition);
        System.out.println("Cost: $" + cost);
    }
}
