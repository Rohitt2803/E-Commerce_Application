package models;

import features.InventoryManagement;
import features.OrderManagement;
import java.util.ArrayList;
import java.util.List;

public class Seller extends User {
    private List<String> products = new ArrayList<>();
    private InventoryManagement inventoryManagement = new InventoryManagement();
    private OrderManagement orderManagement = new OrderManagement();

    public Seller(String name, String email) {
        super(name, email, "Seller");
    }

    @Override
    public void showDashboard() {
        System.out.println("Seller Dashboard: Product Listings, Order Management, Inventory Overview, Sales Performance");
    }

    public void listProduct(String product) {
        products.add(product);
        System.out.println("Product listed: " + product);
    }

    public void manageInventory(String product, int quantity) {
        inventoryManagement.updateInventory(product, quantity);
    }

    public void processOrder(String orderDetails) {
        orderManagement.processOrder(orderDetails);
    }
}
