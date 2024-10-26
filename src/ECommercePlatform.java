import models.Admin;
import models.Seller;
import models.Buyer;

public class ECommercePlatform {
    public static void main(String[] args) {
        Admin admin = new Admin("AdminName", "admin@example.com");
        admin.showDashboard();
        admin.manageUsers("John Doe");
        admin.manageProducts("Laptop, Smartphone");
        admin.manageOrders("Order#12345");

        Seller seller = new Seller("SellerName", "seller@example.com");
        seller.showDashboard();
        seller.listProduct("Smartphone");
        seller.manageInventory("Smartphone", 20);
        seller.processOrder("Order#12346");

        Buyer buyer = new Buyer("BuyerName", "buyer@example.com");
        buyer.showDashboard();
        buyer.browseProducts("Electronics");
        buyer.purchaseProduct("Laptop");
        buyer.trackOrder("Order#12345");
        buyer.addToWishlist("Smartphone");
    }
}
