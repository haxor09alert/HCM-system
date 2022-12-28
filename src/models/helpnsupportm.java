package models;



public class helpnsupportm {
    private static final String Contact = null;
    private String Name;
    private String SContact;
    private String Address;
    private String Email;
    private String Feedback;

    public helpnsupportm(String name2, String sContact2, String address2, String email2, String feedback2){
        
        this.Name=name2;
        this.SContact=sContact2;
        this.Address=address2;
        this.Email=email2;
        this.Feedback=feedback2;
    }

    public void setName(String newName){
        this.Name=newName;
    }

    public String getName(){
        return this.Name;
    }

    public void setContact(String newContact){
        this.SContact=newContact;
    }

    public String getContact(){
        return this.Contact;
    }
    
    public void setAddress(String newAddress){
        this.Address=newAddress;
    }

    public String getAddress(){
        return this.Address;
    }
    
    public void setEmail(String newEmail){
        this.Email=newEmail;
    }

    public String getEmail(){
        return this.Email;
    }
    
    public void setFeedback(String newFeedback){
        this.Feedback=newFeedback;
    }

    public String getFeedback(){
        return this.Feedback;
    }
}