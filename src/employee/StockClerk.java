package employee;

import Customer.Order;
import General.User;

import java.util.ArrayList;

public class StockClerk extends User {


    public StockClerk(String username, String password) {
        super(username, password);
    }

    public StockClerk(String name, String lastname, String phoneNumber, String username, String password) {
        super(name, lastname, phoneNumber, username, password);
    }

    public void seeToBeDelivered(String time){
        /* will access the database and return the list of deliveries as an arraylist of Orders based
        on the time of the delivery*/
    }

    public ArrayList<Order> seeToBeAdded(){
        ArrayList<Order> requests = new ArrayList<>();
        /* gets the requests from SalesMan from  database in the form of an arraylist of Orders*/
        return requests;
    }

    public void addProduct(){
    }

    @Override
    public boolean logIn(String username, String password) {
        return false;
    }
}
