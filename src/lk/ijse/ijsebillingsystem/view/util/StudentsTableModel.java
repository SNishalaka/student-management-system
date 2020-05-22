/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.ijsebillingsystem.view.util;

import com.jfoenix.controls.JFXCheckBox;
import com.jfoenix.controls.JFXToggleButton;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author suuti
 */
public class StudentsTableModel {

    private SimpleIntegerProperty sid = new SimpleIntegerProperty(0);
    private SimpleStringProperty studentFullName = new SimpleStringProperty("");
    private SimpleStringProperty address = new SimpleStringProperty("");
    private SimpleStringProperty mobile = new SimpleStringProperty("");
    private SimpleObjectProperty<JFXToggleButton> statusBtn = new SimpleObjectProperty<>();
    private SimpleStringProperty email = new SimpleStringProperty("");
    private SimpleStringProperty gender = new SimpleStringProperty("");
    private SimpleStringProperty dob = new SimpleStringProperty("");
    private SimpleObjectProperty<JFXCheckBox> selectBtn = new SimpleObjectProperty<>();

    public int getSid() {
        return sid.get();
    }

    public void setSid(int sid) {
        this.sid.set(sid);
    }

    public String getStudentFullName() {
        return studentFullName.get();
    }

    public void setStudentFullName(String studentFullName) {
        this.studentFullName.set(studentFullName);
    }

    public String getAddress() {
        return address.get();
    }

    public void setAddress(String address) {
        this.address.set(address);
    }

    public String getMobile() {
        return mobile.get();
    }

    public void setMobile(String mobile) {
        this.mobile.set(mobile);
    }

    public JFXToggleButton getStatusBtn() {
        return statusBtn.get();
    }

    public void setStatusBtn(JFXToggleButton button) {
        this.statusBtn.set(button);
    }

    public String getEmail() {
        return email.get();
    }

    public void setEmail(String email) {
        this.email.set(email);
    }

    public String getGender() {
        return gender.get();
    }

    public void setGender(String gender) {
        this.gender.set(gender);
    }

    public String getDob() {
        return dob.get();
    }

    public void setDob(String dob) {
        this.dob.set(dob);
    }

    public JFXCheckBox getSelect() {
        return selectBtn.get();
    }

    public void setSelect(JFXCheckBox selectBtn) {
        this.selectBtn.set(selectBtn);
    }
    
}
