package controller;



import java.sql.ResultSet;

import database.DbConnection;

import models.User;



public class UserController {

    DbConnection dbConnection;



    /**
     * @param user
     * @return
     */
    public int insertDetails(User user){

        String name = user.getName();

        String email = user.getEmail();

        String pass = user.getPass();




        String inserQuery = "insert into signupdetail(NAME,EMAIL,PASSWORD) "+ "values('"+name+"','"+email+"','"+pass+"')";

        dbConnection = new DbConnection();

        int Result = dbConnection.manipulate(inserQuery);

        return Result;
    }

    public ResultSet selectDetails(User user){
        // String name = user.getName();
        String email = user.getEmail();
        String pass = user.getPass();

        String selectQuery = "select * from signupdetail where EMAIL='"+email+"' and PASSWORD='"+pass+"' ";
        dbConnection = new DbConnection();
        ResultSet result = dbConnection.retrieve(selectQuery);
        return result;
    }

    public int Updatestatus(User user){
        String email = user.getEmail();
        String updateQuery = "update signupdetail set status='"+"active"+"' where EMAIL='"+email+"'";
        dbConnection = new DbConnection();
        int result = dbConnection.manipulate(updateQuery);
        return result;
    }


    public int changestatus(User user){
        String updateQuery = "update signupdetail set status='"+"inactive"+"' where status='"+"active"+"'";
        dbConnection = new DbConnection();
        int result = dbConnection.manipulate(updateQuery);
        return result;
    }
}