package employee;

import Customer.Order;
import General.User;

import java.util.ArrayList;

public class SalesMan extends User {

    public SalesMan(String username, String password) {
        super(username, password);
    }



    public SalesMan(String name, String lastname, String phoneNumber, String username, String password) {
        super(name, lastname, phoneNumber, username, password);
    }

    public void seePurchased(String time){
        /*will access the database and return the list of purchased as an arraylist of Orders based
        on the time of the purchase*/
    }

    public ArrayList<Order> seeRequests(){
        ArrayList<Order> requests = new ArrayList<>();
        /*will access the database and return the list of requests */
        return requests;
    }

    public void sendRequests(Order order){
       // insertRequest(order);
        /* add the request in database for StockClerk to see*/
    }

    @Override
    public boolean logIn(String username, String password) {
        //the information will be retrieved from the database and compared
        return true;
    }
}
