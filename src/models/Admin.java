package models;

import features.UserManagement;
import features.ProductManagement;
import features.OrderManagement;

public class Admin extends User {
    private UserManagement userManagement = new UserManagement();
    private ProductManagement productManagement = new ProductManagement();
    private OrderManagement orderManagement = new OrderManagement();

    public Admin(String name, String email) {
        super(name, email, "Admin");
    }

    @Override
    public void showDashboard() {
        System.out.println("Admin Dashboard: User Management, Product Management, Order Management, System Activity Monitoring");
    }

    public void manageUsers(String userDetails) {
        userManagement.manageUsers(userDetails);
    }

    public void manageProducts(String productDetails) {
        productManagement.manageProducts(productDetails);
    }

    public void manageOrders(String orderDetails) {
        orderManagement.manageOrders(orderDetails);
    }
}