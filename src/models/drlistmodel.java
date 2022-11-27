/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import javax.swing.JTextField;

/**
 *
 * @author user
 */
public class drlistmodel {
    private String Dname;
    private String Specalization;
    private String Department;
    private int DrId;

    public String getDname() {
        return this.Dname;
    }

    public void setDname(String Dname) {
        this.Dname = Dname;
    }

    public String getSpecalization() {
        return this.Specalization;
    }

    public void setSpecalization(String Specalization) {
        this.Specalization = Specalization;
    }

    public String getDepartment() {
        return this.Department;
    }

    public void setDepartment(String Department) {
        this.Department = Department;
    }

    public int getDrId() {
        return this.DrId;
    }

    public void setDrId(int DrId) {
        this.DrId = DrId;
    }

    public drlistmodel(String Dname, String Specalization, String Department, int DrId) {
        this.Dname = Dname;
        this.Specalization = Specalization;
        this.Department = Department;
        this.DrId = DrId;
    }

    public drlistmodel(JTextField dname2, String specialization, String department2) {
    }
    
    
    


}
