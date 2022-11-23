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

    private String name;

    private String email;

    private String password;

    private String status;

    public User(

        String name,

        String email,

        String password,

        String status

    ){     

  this . name  = name ;         
  this.name  = name;

        this.email = email;

        this.password = password;

        this.status = status;

    }

    public void setName(String newName){

        this.name = newName;

    }

    public String getName(){

        return this.name;

    }

    public void setEmail(String newEmail){

        this.email = newEmail;

    }

    public String getEmail(){

        return this.email;

    }

    public void setPass(String newPass){

        this.password = newPass;

    }

    public String getPass(){

        return this.password;

    }

    public void setStatus(String status){

        this.status = status;

    }

    public String getStatus(){

        return this.status;

    }

}


