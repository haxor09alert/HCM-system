package controller;

import database.DbConnection;
import models.helpnsupportm;

public class HnSController {
    DbConnection dbConnection;

    public int insertDetails(helpnsupportm hns) {
        String name = hns.getName();
        String contact = hns.getContact();
        String address = hns.getAddress();
        String email = hns.getEmail();
        String feedback=hns.getFeedback();

        String insert = "insert into helpnsupport(name,contact,address,email,feedback)" + "values('" + name + "','" + contact
                + "','" + address + "','" + email +"','" + feedback + "')";
        dbConnection = new DbConnection();
        int Result = dbConnection.manipulate(insert);
        return Result;
    }
}