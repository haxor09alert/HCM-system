package controller;



import java.sql.ResultSet;

import database.DbConnectionFees;

import models.Fees;



public class FeesController {

    DbConnectionFees dbConnection;



    /**
     * @param user
     * @return
     */
    public int insertDetails(Fees fees){

        String PatientName = fees.getPatientName();

        int BedNo = fees.getBedNo();

        String DocName = fees.getDocName();

        double Total=fees.getFees();




        String inserQuery = "insert into bill(PatientName,BedNo,DoctorName,Total) "+ "values('"+PatientName+"','"+BedNo+"','"+DocName+"','"+Total+"')";

        dbConnection = new DbConnectionFees();

        int Result = dbConnection.manipulate(inserQuery);

        return Result;
    }

   

    
}