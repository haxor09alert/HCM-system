//package models;
//
//public class Doctor {
//    private int doctor_id;
//    private String doctor_fname;
//    private String doctor_lname;
//    private String doctor_age;
//    private String doctor_department;
//    private String doctor_special;
//
//    public Doctor(int doctor_id,
//    String doctor_fname,
//    String doctor_lname,
//    String doctor_age,
//    String doctor_department,
//    String doctor_special){
//        this.doctor_id = doctor_id;
//        this.doctor_fname = doctor_fname;
//        this.doctor_lname = doctor_lname;
//        this.doctor_age = doctor_age;
//        this.doctor_department = doctor_department;
//        this.doctor_special = doctor_special;
//    }
//
//    public void setDoctorid(int newDoctorId){
//        this.doctor_id = newDoctorId;
//    }
//
//    public int getDoctorId(){
//        return this.doctor_id;
//    }
//    public void setdoctorfName(String newdoctorfName){
//        this.doctor_fname = newdoctorfName;
//    }
//
//    public String getdoctorfName(){
//        return this.doctor_fname;
//    }
//    public void setAppointlName(String newdoctorlName){
//        this.doctor_lname = newdoctorlName;
//    }
//
//    public String getdoctorlName(){
//        return this.doctor_lname;
//
//    }
//
//    public void setdoctorAge(String newdoctorAge){
//        this.doctor_age = newdoctorAge;
//    }
//
//    public String getdoctorAge(){
//        return this.doctor_age;
//    }
//
//    public void setDoctorDepartment(String newDoctorDepartment){
//        this.doctor_department = newDoctorDepartment;
//    }
//
//    public String getDoctorDepartment(){
//        return this.doctor_department;
//    }
//
//    public void setdoctorSpecial(String newdoctorSpecial){
//        this.doctor_special = newdoctorSpecial;
//    }
//
//    public String getdoctorSpecial(){
//        return this.doctor_special;
//    }
//}
/////*
//// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
//// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
//// */
////package models;
////
////import javax.swing.JTextField;
////
/////**
//// *
//// * @author user
//// */
////public class drlistmodel {
////    private String Dname;
////    private String Specalization;
////    private String Department;
////    private int DrId;
////
////    public String getDname() {
////        return this.Dname;
////    }
////
////    public void setDname(String Dname) {
////        this.Dname = Dname;
////    }
////
////    public String getSpecalization() {
////        return this.Specalization;
////    }
////
////    public void setSpecalization(String Specalization) {
////        this.Specalization = Specalization;
////    }
////
////    public String getDepartment() {
////        return this.Department;
////    }
////
////    public void setDepartment(String Department) {
////        this.Department = Department;
////    }
////
////    public int getDrId() {
////        return this.DrId;
////    }
////
////    public void setDrId(int DrId) {
////        this.DrId = DrId;
////    }
////
////    public drlistmodel(String Dname, String Specalization, String Department, int DrId) {
////        this.Dname = Dname;
////        this.Specalization = Specalization;
////        this.Department = Department;
////        this.DrId = DrId;
////    }
////
////    public drlistmodel(JTextField dname2, String specialization, String department2) {
////    }
////    
////    
////    
////
////
////}
package models;

public class drlistmodel {
    private int doctor_id;
    private String doctor_fname;
    private String doctor_lname;
    private int doctor_age;
    private String doctor_department;
    private String doctor_special;

    public drlistmodel(
            Integer doctor_id, String doctor_fname, String doctor_lname, Integer doctor_age, String doctor_department, String doctor_special){
        this.doctor_id = doctor_id;
        this.doctor_fname = doctor_fname;
        this.doctor_lname = doctor_lname;
        this.doctor_age = doctor_age;
        this.doctor_department = doctor_department;
        this.doctor_special = doctor_special;
    }

  

    public int getDoctor_id() {
        return this.doctor_id;
    }

    public void setDoctor_id(int doctor_id) {
        this.doctor_id = doctor_id;
    }

    public String getDoctor_fname() {
        return this.doctor_fname;
    }

    public void setDoctor_fname(String doctor_fname) {
        this.doctor_fname = doctor_fname;
    }

    public String getDoctor_lname() {
        return this.doctor_lname;
    }

    public void setDoctor_lname(String doctor_lname) {
        this.doctor_lname = doctor_lname;
    }

    public int getDoctor_age() {
        return this.doctor_age;
    }

    public void setDoctor_age(int doctor_age) {
        this.doctor_age = doctor_age;
    }

    public String getDoctor_department() {
        return this.doctor_department;
    }

    public void setDoctor_department(String doctor_department) {
        this.doctor_department = doctor_department;
    }

    public String getDoctor_special() {
        return this.doctor_special;
    }

    public void setDoctor_special(String doctor_special) {
        this.doctor_special = doctor_special;
    }

}
