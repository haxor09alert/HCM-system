package controller;

import java.sql.ResultSet;

// import javax.print.Doc;

import database.DbConnection;
import models.donermodel;

public class donercontroller {
    DbConnection dbConnection;

    public int insertdetails(donermodel doner){ 
        int Sn = doner.getSn();
        String Name = doner.getName();
        Double Contact = doner.getContact();
        String Organ = doner.getOrgan();

        String insertQuery = "insert into donerlist(name,contact,organ)"+ "values('"+Name+"','"+Contact+"','"+Organ+"')";
        dbConnection = new DbConnection();
        int result = dbConnection.manipulate(insertQuery);
        return result;
    }

    public ResultSet selectdetails(){
        String selectQuery = "select * from donerlist";
        dbConnection = new DbConnection();
        ResultSet result = dbConnection.retrieve(selectQuery);
        return result;
    }

    public int changestatus(donermodel doner){
        int Sn = doner.getSn();

        String UpdateQuery = "update donerlist set status=1 where doner_id='"+Sn+"'";
        dbConnection = new DbConnection();
        int result = dbConnection.manipulate(UpdateQuery);
        return result;
    }

    public int updatestatus(donermodel doctor){
        String updateQuery = "update donerlist set status=0 where status=1";
        dbConnection = new DbConnection();
        int result = dbConnection.manipulate(updateQuery);
        return result;
    }

    public ResultSet viewdetails(donermodel doctor){
        String viewQuery = "select * from donerlist where status=1";
        dbConnection = new DbConnection();
        ResultSet result = dbConnection.retrieve(viewQuery);
        return result;
    }

    // public ResultSet viewDoctorid(donermodel doctor){
    //     String specialist = doctor.getdoctorSpecial();
    //     String selectQuery = "select doctor_id from doctor where specialist='"+specialist+"'";
    //     dbConnection = new DbConnection();
    //     ResultSet result = dbConnection.retrieve(selectQuery);
    //     return result;
    // }

    // public ResultSet viewDoctorName(donermodel doctor){
    //     String id  = doctor.getDoctorId();
    //     String selectQuery="select fname,lname from doctor where doctor_id = '"+id+"'";
    //     dbConnection = new DbConnection();
    //     ResultSet result = dbConnection.retrieve(selectQuery);
    //     return result;
    // }
    public int updateDoctor(donermodel doner) {
       int Sn = doner.getSn();
        String Name = doner.getName();
        Double Contact = doner.getContact();
        String Organ = doner.getOrgan();

        String updateQuery = "update donerlist set name='" + Name + "',contact='" + Contact + "',organ='" + Organ + "' where sn='" + Sn + "'";
        dbConnection = new DbConnection();
        int result = dbConnection.manipulate(updateQuery);
        return result;
    }

    public int deletedetails(donermodel doner) {
       int Sn = doner.getSn();
        String deleteQuery = "delete from donerlist where sn='" + Sn + "'";
        dbConnection = new DbConnection();
        int result = dbConnection.manipulate(deleteQuery);
        return result;
    }

    // public int deleteDoctor(donermodel doctor){
    //     String did = doctor.getDoctorId();
    //     String deleteQuery = "delete from doctor where doctor_id='"+did+"'";
    //     dbConnection = new DbConnection();
    //     int result = dbConnection.manipulate(deleteQuery);
    //     return result;
    // }

}
