package controller;

import database.DbConnection;
import models.helpnsupportm;

public class HnSController {
    DbConnection dbConnection;

    public int insertDetails(helpnsupportm hns) {
        String name = hns.getname();
        String contact = hns.getContact();
        String address = hns.getAddress();
        String email = hns.getEmail();

        String insert = "insert into helpnsupport(name,contact,address,email)" + "values('" + name + "','" + contact
                + "','" + address + "','" + email + "')";
        dbConnection = new DbConnection();
        int Result = dbConnection.manipulate(insert);
        return Result;
    }
}
