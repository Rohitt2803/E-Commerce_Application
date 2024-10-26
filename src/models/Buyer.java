package models;

import java.util.ArrayList;
import java.util.List;

public class Buyer extends User {
    private List<String> browsingHistory = new ArrayList<>();
    private List<String> orderHistory = new ArrayList<>();
    private List<String> wishlist = new ArrayList<>();

    public Buyer(String name, String email) {
        super(name, email, "Buyer");
    }

    @Override
    public void showDashboard() {
        System.out.println("Buyer Dashboard: Browsing History, Order History, Wishlist, Account Overview");
    }

    public void browseProducts(String searchCriteria) {
        System.out.println("Browsing products with criteria: " + searchCriteria);
        browsingHistory.add(searchCriteria);
    }

    public void purchaseProduct(String product) {
        orderHistory.add(product);
        System.out.println("Product purchased: " + product);
    }

    public void trackOrder(String orderDetails) {
        System.out.println("Tracking order: " + orderDetails);
    }

    public void addToWishlist(String product) {
        wishlist.add(product);
        System.out.println("Product added to wishlist: " + product);
    }
}

