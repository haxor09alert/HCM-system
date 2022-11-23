package controller;

import database.DbConnection;
import models.User;

public class UserController {
    DbConnection dbConnection;

    public int insertDetails(User user){
        String name = user.getName();
        String email = user.getEmail();
        String pass = user.getPass();


        String inserQuery = "insert into signupdetail(NAME,EMAIL,PASSWORD) "+ "values('"+name+"','"+email+"','"+pass+"')";
        dbConnection = new DbConnection();
        int Result = dbConnection.manipulate(inserQuery);
        return Result;
    }

}