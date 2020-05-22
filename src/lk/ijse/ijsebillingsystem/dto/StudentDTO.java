/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.ijsebillingsystem.dto;

/**
 *
 * @author suuti
 */
public class StudentDTO extends SuperDTO {

    private int SID;
    private String initialStudentName;
    private String studentFullName;
    private String addressLine;
    private String telHome;
    private String mobile;
    private String email;
    private String dob;
    private String nic;
    private String gender;
    private String school;
    private String university;
    private String faculty;
    private String Status;
    private double regFee;

    public StudentDTO() {
    }

    public StudentDTO(int SID, String initialStudentName, String studentFullName, String addressLine, String telHome, String mobile, String email, String dob, String nic, String gender, String school, String university, String faculty, String btnStatus, double regFee) {
        this.SID = SID;
        this.initialStudentName = initialStudentName;
        this.studentFullName = studentFullName;
        this.addressLine = addressLine;
        this.telHome = telHome;
        this.mobile = mobile;
        this.email = email;
        this.dob = dob;
        this.nic = nic;
        this.gender = gender;
        this.school = school;
        this.university = university;
        this.faculty = faculty;
        this.Status = btnStatus;
        this.regFee = regFee;
    }

    public int getSID() {
        return SID;
    }

    public void setSID(int SID) {
        this.SID = SID;
    }

    public String getInitialStudentName() {
        return initialStudentName;
    }

    public void setInitialStudentName(String initialStudentName) {
        this.initialStudentName = initialStudentName;
    }

    public String getStudentFullName() {
        return studentFullName;
    }

    public void setStudentFullName(String studentFullName) {
        this.studentFullName = studentFullName;
    }

    public String getAddressLine() {
        return addressLine;
    }

    public void setAddressLine(String addressLine) {
        this.addressLine = addressLine;
    }

    public String getTelHome() {
        return telHome;
    }

    public void setTelHome(String telHome) {
        this.telHome = telHome;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String btnStatus) {
        this.Status = btnStatus;
    }

    public double getRegFee() {
        return regFee;
    }

    public void setRegFee(double regFee) {
        this.regFee = regFee;
    }

    @Override
    public String toString() {
        return "StudentDTO{" + "SID=" + SID + ", initialStudentName=" + initialStudentName + ", studentFullName=" + studentFullName + ", addressLine=" + addressLine + ", telHome=" + telHome + ", mobile=" + mobile + ", email=" + email + ", dob=" + dob + ", nic=" + nic + ", gender=" + gender + ", school=" + school + ", university=" + university + ", faculty=" + faculty + ", btnStatus=" + Status + ", regFee=" + regFee + '}';
    }
    
    
    
}
