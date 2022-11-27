package controller;

import database.DbConnection;
import models.drlistmodel;

public class drlistcontroller {
    DbConnection dbConnection;

    public int insertDetails(drlistmodel user){
        String Dname = user.getDname();
        String Specalization = user.getSpecalization();
        String Department = user.getDepartment();

        String inserQuery = "insert into doctorlist(Dname,Department,Specalization) "+ "values('"+Dname+"','"+Department+"','"+Specalization +"')";
        dbConnection = new DbConnection();
        int Result = dbConnection.manipulate(inserQuery);
        return Result;
    }

}