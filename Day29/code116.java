package Day29;

import java.util.*;

class product{
    private String id;
    private String name;
    private int quantity;
    private double price;

    public product(String id, String name, int quantity, double price) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    // Getters and Setters
    public String getId() { return id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    
    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }
    
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    @Override
    public String toString() {
        return String.format("ID: %-8s | Name: %-15s | Stock: %-6d | Price: Rs%.2f", id, name, quantity, price);
    }
}
class InventoryManager{
    private List<product> productList;
        public InventoryManager() {
        this.productList = new ArrayList<>(); // Sequential list storage
    }
        private product findProductById(String id) {
        for (product product : productList) {
            if (product.getId().equalsIgnoreCase(id)) {
                return product; // Found the item
            }
        }
        return null; // Item does not exist
    }

    // Add a new product or restock an existing one
    public void addProduct(String id, String name, int quantity, double price) {
        product existingProduct = findProductById(id);

        if (existingProduct != null) {
            // Update stock quantity if item exists
            existingProduct.setQuantity(existingProduct.getQuantity() + quantity);
            System.out.println("Product ID exists. Updated stock quantity instead.");
        } else {
            // Add brand new product record
            product newProduct = new product(id, name, quantity, price);
            productList.add(newProduct);
            System.out.println("Product added successfully!");
        }
    }

    // Remove a product entirely from the inventory list
    public void removeProduct(String id) {
        product Product = findProductById(id);
        
        if (Product != null) {
            productList.remove(Product);
            System.out.println("Product removed successfully!");
        } else {
            System.out.println("Error: Product ID not found.");
        }
    }

    // Update quantity manually
    public void updateStock(String id, int newQuantity) {
        product Product = findProductById(id);
        
        if (Product != null) {
            Product.setQuantity(newQuantity);
            System.out.println("Stock quantity updated successfully!");
        } else {
            System.out.println("Error: Product ID not found.");
        }
    }

    // Display all active items in the inventory
    public void displayInventory() {
        if (productList.isEmpty()) {
            System.out.println("The inventory is currently empty.");
            return;
        }
        System.out.println("\n==================== CURRENT INVENTORY ====================");
        for (product Product : productList) {
            System.out.println(Product);
        }
        System.out.println("============================================================");
    }
}
public class code116 {
    public static void main(String[] args) {
        InventoryManager manager=new InventoryManager();
        Scanner scanner=new Scanner(System.in);
        boolean running = true;
        manager.addProduct("1", "Java program", 10, 2500);
        System.out.println("Welcome to the Java Inventory Management System!");

        while (running) {
            System.out.println("\n--- Operations Menu ---");
            System.out.println("1. Add/Restock Product");
            System.out.println("2. Update Stock Quantity");
            System.out.println("3. Remove Product");
            System.out.println("4. View Complete Inventory");
            System.out.println("5. Exit System");
            System.out.print("Select an option (1-5): ");

            String choice = scanner.nextLine().trim();

            switch (choice) {
                case "1":
                    System.out.print("Enter Product ID: ");
                    String id = scanner.nextLine().trim();
                    System.out.print("Enter Product Name: ");
                    String name = scanner.nextLine().trim();
                    System.out.print("Enter Quantity: ");
                    int quantity = Integer.parseInt(scanner.nextLine().trim());
                    System.out.print("Enter Price per Unit: ");
                    double price = Double.parseDouble(scanner.nextLine().trim());
                    
                    manager.addProduct(id, name, quantity, price);
                    break;

                case "2":
                    System.out.print("Enter Product ID to update: ");
                    String updateId = scanner.nextLine().trim();
                    System.out.print("Enter New Total Quantity: ");
                    int newQty = Integer.parseInt(scanner.nextLine().trim());
                    
                    manager.updateStock(updateId, newQty);
                    break;

                case "3":
                    System.out.print("Enter Product ID to remove: ");
                    String removeId = scanner.nextLine().trim();
                    
                    manager.removeProduct(removeId);
                    break;

                case "4":
                    manager.displayInventory();
                    break;

                case "5":
                    running = false;
                    System.out.println("Exiting System. Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice. Please use digits 1 to 5.");
            }
        }
        scanner.close();

    }
}
