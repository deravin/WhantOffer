package Practice_7.Example.cost_counter;

public class Main {
    public static void main(String[] args) {
        CostCounter costCounter = new CostCounter();
        costCounter.addCosts(1, 123.5);
        costCounter.addCosts(2, 1243.5);
        costCounter.addCosts(3, 1255.5);
        costCounter.addCosts(4, 76.8);
        costCounter.addCosts(5, 9898.0);

        System.out.println(costCounter.getCosts(3));
        System.out.println(costCounter.getMinCostMonth());

    }
}
