package controller;

import java.sql.ResultSet;

// import javax.print.Doc;

import database.DbConnection;
import models.drlistmodel;

public class drlistcontroller {
    DbConnection dbConnection;

    public int insertdetails(drlistmodel doctor){ 
        int id =doctor.getDoctor_id();
        String fname = doctor.getDoctor_fname();
        String lname = doctor.getDoctor_lname();
        int age = doctor.getDoctor_age();
        String department = doctor.getDoctor_department();
        String special = doctor.getDoctor_special();

        String insertQuery = "insert into doctor(fname,lname,age,department,specialist)"+ "values('"+fname+"','"+lname+"','"+age+"','"+department+"','"+special+"')";
        dbConnection = new DbConnection();
        int result = dbConnection.manipulate(insertQuery);
        return result;
    }

    public ResultSet selectdetails(){
        String selectQuery = "select * from doctor";
        dbConnection = new DbConnection();
        ResultSet result = dbConnection.retrieve(selectQuery);
        return result;
    }

    public int changestatus(drlistmodel doctor){
        int id = doctor.getDoctor_id();

        String UpdateQuery = "update doctor set status=1 where doctor_id='"+id+"'";
        dbConnection = new DbConnection();
        int result = dbConnection.manipulate(UpdateQuery);
        return result;
    }

    public int updatestatus(drlistmodel doctor){
        String updateQuery = "update doctor set status=0 where status=1";
        dbConnection = new DbConnection();
        int result = dbConnection.manipulate(updateQuery);
        return result;
    }

    public ResultSet viewdetails(drlistmodel doctor){
        String viewQuery = "select * from doctor where status=1";
        dbConnection = new DbConnection();
        ResultSet result = dbConnection.retrieve(viewQuery);
        return result;
    }

    public ResultSet viewDoctorid(drlistmodel doctor){
        String specialist = doctor.getDoctor_special();
        String selectQuery = "select doctor_id from doctor where specialist='"+specialist+"'";
        dbConnection = new DbConnection();
        ResultSet result = dbConnection.retrieve(selectQuery);
        return result;
    }

    public ResultSet viewDoctorName(drlistmodel doctor){
        int id  = doctor.getDoctor_id();
        String selectQuery="select fname,lname from doctor where doctor_id = '"+id+"'";
        dbConnection = new DbConnection();
        ResultSet result = dbConnection.retrieve(selectQuery);
        return result;
    }
    public int updateDoctor(drlistmodel doctor) {
        int id = doctor.getDoctor_id();
        String fname = doctor.getDoctor_fname();
        String lname = doctor.getDoctor_lname();
        int age = doctor.getDoctor_age();
        String specialist = doctor.getDoctor_special();
        String department = doctor.getDoctor_department();
        String updateQuery = "update doctor set fname='" + fname + "',lname='" + lname + "',age = '" + age
                + "',specialist='" + specialist + "',department='" + department + "' where doctor_id='" + id + "'";
        dbConnection = new DbConnection();
        int result = dbConnection.manipulate(updateQuery);
        return result;
    }

    public int deleteDoctor(drlistmodel doctor){
        int did = doctor.getDoctor_id();
        String deleteQuery = "delete from doctor where doctor_id='"+did+"'";
        dbConnection = new DbConnection();
        int result = dbConnection.manipulate(deleteQuery);
        return result;
    }
}
