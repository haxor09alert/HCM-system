/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author user
 */
public class User {
    private String Name;
    private String Email;
    private String Password;
    // private String status;
    // private String string;
    
    
    public User(
        String Name,
        String Email,
        String Password
        // String status 
    ){
        this.Name  = Name;
        this.Email = Email;
        this.Password = Password;
        // this.status = status;
    }

    public void setName(String newName){
        this.Name = newName;
    }

    public String getName(){
        return this.Name;
    }
    public void setEmail(String newEmail){
        this.Email = newEmail;
    }

    public String getEmail(){
        return this.Email;
    }

    public void setPass(String newPass){
        this.Password = newPass;
    }

    public String getPass(){
        return this.Password;
    }

    // public void setStatus(String status){
    //     this.status = status;
    // }

    // public String getStatus(){
    //     return this.status;
    // }


}
