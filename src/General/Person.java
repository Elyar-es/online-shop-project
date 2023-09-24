package General;

import java.util.ArrayList;

public class Person {
    private String name;
    private String lastname;
    private String phoneNumber;
    private String nationalCode;
    private ArrayList<String> Address;
    private String email;

    public Person(String name, String lastname, String phoneNumber) {
        this.name = name;
        this.lastname = lastname;
        this.phoneNumber = phoneNumber;
        Address = new ArrayList<>();
    }

    public Person(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setNationalCode(String nationalCode) {
        this.nationalCode = nationalCode;
    }

    public void address(String address) {
        Address.add(address);
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getNationalCode() {
        return nationalCode;
    }

    public void deleteAddress(int index) {
        Address.remove(index);
    }

    public String getEmail() {
        return email;
    }
}
