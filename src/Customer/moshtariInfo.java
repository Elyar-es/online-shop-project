package Customer;

import General.User;

import java.util.ArrayList;

public class moshtariInfo extends User {
    private ArrayList<Order> cart;
    private ArrayList<Order> purchasedHistory;
    private Order currentOrder;

    public moshtariInfo(String username, String password) {
        super(username, password);
        cart = new ArrayList<>();
        purchasedHistory = new ArrayList<>();
    }

    public moshtariInfo(String name, String lastname, String phoneNumber, String username, String password) {
        super(name, lastname, phoneNumber, username, password);
        cart = new ArrayList<>();
        purchasedHistory = new ArrayList<>();
    }

    public moshtariInfo(String phoneNumber, String username, String password, Order currentOrder) {
        super(phoneNumber, username, password);
        cart = new ArrayList<>();
        purchasedHistory = new ArrayList<>();
        this.currentOrder = currentOrder;
    }

    public void setCurrentOrder(Order currentOrder) {
        this.currentOrder = currentOrder;
    }


    public void deleteItem(Order product) {
        cart.remove(product);
    }

    public ArrayList<Order> getPurchased() {
        return purchasedHistory;
    }

    public ArrayList<Order> getCart() {
        return cart;
    }

    public void purchased() {
        purchasedHistory.add(currentOrder);
        currentOrder = null;
    }

    @Override
    public boolean logIn(String username, String password) {
        // for (moshtariInfo customer : Data.customers) {
        //   if (customer.getPhoneNumber().equals(username) && customer.getPassword().equals(password)) {
        //      return true;
        //   }
        //  }
        return false;
    }
    public String addToCart(int stock){

        if (currentOrder.getProduct().getStock() - stock >= 0) {
            cart.add(currentOrder);
            currentOrder.getProduct().setStock(currentOrder.getProduct().getStock() - stock);
            return "Product added successfully!";
        }

        return "We haven't enough stock; Product stock is: " + currentOrder.getProduct().getStock();
    }
}
