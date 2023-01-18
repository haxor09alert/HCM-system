package models;

public class donermodel {
    private int Sn;
    private String Name;
    private Double contact;
    private String organ;

    public donermodel(
            int Sn, String Name, Double contact, String organ){
        this.Sn = Sn;
        this.Name = Name;
        this.contact = contact;
        this.organ = organ;
        }

    public int getSn() {
        return this.Sn;
    }

    public void setSn(int Sn) {
        this.Sn = Sn;
    }

    public String getName() {
        return this.Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public Double getContact() {
        return this.contact;
    }

    public void setContact(Double contact) {
        this.contact = contact;
    }

    public String getOrgan() {
        return this.organ;
    }

    public void setOrgan(String organ) {
        this.organ = organ;
    }


}