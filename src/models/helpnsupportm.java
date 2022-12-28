package models;

public class helpnsupportm {
    private String name;
    private String contact;
    private String address;
    private String email;

    public helpnsupportm() {
        String name;
        String contact;
        String address;
        String email;
    }

    {
        this.name = name;
        this.contact = contact;
        this.address = address;
        this.email = email;

    }

    public void setName(String newName) {
        this.name = newName;
    }

    public String getname() {
        return this.name;
    }

    public void setContact(String newContact) {
        this.address = newContact;
    }

    public String getContact() {
        return this.contact;
    }

    public void setAddress(String newAddress) {
        this.contact = newAddress;
    }

    public String getAddress() {
        return this.contact;
    }

    public void setEmail(String newEmail) {
        this.email = newEmail;
    }

    public String getEmail() {
        return this.email;
    }

}
