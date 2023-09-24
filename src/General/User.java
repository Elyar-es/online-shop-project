package General;

import General.Person;

public abstract class User extends Person {
    private String username;
    private String password;

    public User(String username, String password) {
        super(username);
        this.username = username;
        this.password = password;

    }

    public User(String name, String lastname, String phoneNumber, String username, String password) {
        super(name, lastname, phoneNumber);
        this.username = username;
        this.password = password;
    }

    public User(String phoneNumber, String username, String password) {
        super(phoneNumber);
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public abstract boolean logIn(String username, String password);
}
