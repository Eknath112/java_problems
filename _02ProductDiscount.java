import java.util.*;

class ProductNotFoundException extends Exception {
    public ProductNotFoundException(String message) {
        super(message);
    }
}

public class _02ProductDiscount {
    private HashMap<String, Double> productMap = new HashMap<>();

    public void addProduct(String id, double price) {
        productMap.put(id, price);
    }

    public void applyDiscount(String id, double discountPercentage) throws ProductNotFoundException {
        if (!productMap.containsKey(id)) {
            throw new ProductNotFoundException("Error: Product ID not found!");
        }
        if (discountPercentage < 0 || discountPercentage > 100) {
            throw new IllegalArgumentException("Error: Discount percentage must be between 0 and 100!");
        }
        double oldPrice = productMap.get(id);
        double newPrice = oldPrice - (oldPrice * discountPercentage / 100);
        productMap.put(id, newPrice);
        System.out.println("New price for " + id + ": $" + newPrice);
    }

    public void displayProducts() {
        System.out.println("Products: " + productMap);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProductDiscountDemo demo = new ProductDiscountDemo();

        while (true) {
            System.out.println("\n--- Product Menu ---");
            System.out.println("1. Add Product");
            System.out.println("2. Apply Discount");
            System.out.println("3. Display Products");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Product ID: ");
                    String id = sc.next();
                    System.out.print("Enter Product Price: ");
                    double price = sc.nextDouble();
                    demo.addProduct(id, price);
                    break;
                case 2:
                    System.out.print("Enter Product ID: ");
                    String pid = sc.next();
                    System.out.print("Enter Discount Percentage: ");
                    double discount = sc.nextDouble();
                    try {
                        demo.applyDiscount(pid, discount);
                    } catch (IllegalArgumentException | ProductNotFoundException e) {
                        System.out.println(e);
                    }
                    break;
                case 3:
                    demo.displayProducts();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
