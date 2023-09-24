module testt2 {
    requires javafx.fxml;
    requires javafx.controls;
    requires java.sql;

    opens Customer;
    opens employee;
    opens General;
    opens Manager;
    opens fxmls;
}