package models;

public class Fees {
    private String PatientName;

    private int BedNo;

    private String DoctorName;

    private double TotalFees;

    public Fees(

        String PatientName,

        int bedNo2,

        String DoctorName,

        double total
    ){
        this.PatientName=PatientName;
        
        this .BedNo=bedNo2;

        this.DoctorName=DoctorName;

        this.TotalFees=total;
    }

    public void setPatientName(String newPatientName){

        this.PatientName=newPatientName;
    }

    public String getPatientName(){

        return this.PatientName;

    }

    public void setBedNo(int newBedNo){

        this.BedNo = newBedNo;

    }

    public int getBedNo(){

        return this.BedNo;

    }

    public void setDocName(String newDocName){

        this.DoctorName = newDocName;

    }

    public String getDocName(){

        return this.DoctorName;

    }

    public void setTotal(double Fees){

        this.TotalFees = Fees;

    }

    public double getFees(){

        return this.TotalFees;

    }
}
