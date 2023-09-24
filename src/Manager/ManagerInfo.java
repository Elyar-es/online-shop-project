package Manager;

import General.User;
import employee.SalesMan;
import employee.StockClerk;

public class ManagerInfo extends User {

    public ManagerInfo(String username, String password) {
        super(username, password);
    }

    public void seeEmployee(){
        /*will access the database and return the list of employees */
    }

    public void addEmployee(String name, String lastname, String phonenumber, String type){
        String username = name + lastname;
        String password = phonenumber;
        switch (type){
            case "SalesMan":
                SalesMan sm = new SalesMan(name, lastname, phonenumber, username, password);
                break;
            //insert into database
            case "StockClerk":
                StockClerk sc = new StockClerk(name, lastname, phonenumber, username, password);
                break;
            //insert into database

        }
    }

    @Override
    public boolean logIn(String username, String password) {
        return false;
    }
}
