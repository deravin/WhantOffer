package ComplexTasks.Task5;

public class Electronict implements Product{
    private final String productName;
    private final double price;

    public Electronict(String productName, double price){
        this.productName = productName;
        this.price = price;
    }

    @Override
    public String getCategory() {
        String category = "electronics";
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
        return "Electronict{" +
                "productName='" + productName + '\'' +
                ", price=" + price +
                '}';
    }
}
