package ComplexTasks.Task5;

public class Fruits implements Product{
    private final String productName;
    private final double price;
    private int count = 0;

    public Fruits(String productName, double price){
        this.productName = productName;
        this.price = price;
    }

    @Override
    public String getCategory() {
        String category = "fruits";
        return category;
    }

    @Override
    public String getProductName() {
        return productName;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Fruits{" +
                "productName='" + productName + '\'' +
                ", price=" + price +
                '}';
    }
}
