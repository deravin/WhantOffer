package ComplexTasks.Task5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class InventoryService {
    // Хранение товаров осуществляется в структуре Map<String, List<Product>>, где ключ - это категория товара.
    private static final HashMap<String, List<Product>> productList = new HashMap<>();

    // Если флаг isInventoryOpen равен false, операция добавления не должна выполняться.
    public static boolean isInventoryOpen;

    // Метод для добавления товара на склад.
    public static void addProduct(Product product){
        if (isInventoryOpen){
            productList.computeIfAbsent(product.getCategory(), category -> new ArrayList<Product>()).add(product);
        } else {
            System.out.println("Сейчас склад закрыт");
        }
    }

    // Метод для получения товара по категории. Если в указанной категории нет товаров,
    // должно выбрасываться исключение OutOfStockException.
    public synchronized static List<Product> getProductByCategory(String category) throws OutOfStockException{
            if (!productList.containsKey(category)) {
                throw new IllegalArgumentException("Неверная категория товаров");
            }
                if (productList.get(category).isEmpty()) {
                    throw new OutOfStockException("В данной категории отсутствуют товары.");
            }
        return productList.get(category);
    }

    // Фильтрация товаров по цене с использованием лямбда-выражений.
    public static List<Product> filterByPrice(double minPrice, double maxPrice){
        return productList.values().stream()
                .flatMap(List::stream)
                .filter(p -> p.getPrice() >= minPrice && p.getPrice() <= maxPrice)
                .toList();
    }
}
