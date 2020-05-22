package lk.ijse.ijsebillingsystem.dao.custom.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import lk.ijse.ijsebillingsystem.dao.custom.StudentDAO;
import lk.ijse.ijsebillingsystem.db.DBConnection;
import lk.ijse.ijsebillingsystem.model.Student;

/**
 *
 * @author suuti
 */
public class StudentDAOImpl implements StudentDAO {

    @Override
    public boolean save(Student student) throws Exception {
        Connection connection = DBConnection.getDBConnection().getConnection();
        PreparedStatement statement = connection.prepareStatement("INSERT INTO student VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
        statement.setObject(1, student.getSID());
        statement.setObject(2, student.getInitialStudentName());
        statement.setObject(3, student.getStudentFullName());
        statement.setObject(4, student.getAddressLine());
        statement.setObject(5, student.getTelHome());
        statement.setObject(6, student.getMobile());
        statement.setObject(7, student.getEmail());
        statement.setObject(8, student.getDob());
        statement.setObject(9, student.getNic());
        statement.setObject(10, student.getGender());
        statement.setObject(11, student.getSchool());
        statement.setObject(12, student.getUniversity());
        statement.setObject(13, student.getFaculty());
        statement.setObject(14, student.getStatus());
        statement.setObject(15, student.getRegFee());
        return statement.executeUpdate() > 0;

    }

    @Override
    public boolean modify(Student model) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean remove(Student model) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Student search(Student model) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Student> getSearched(Student model) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Student> serachAll() throws Exception {
        Connection connection = DBConnection.getDBConnection().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery("Select * from student");
        ArrayList<Student> studentDetailsList = new ArrayList<>();
        while (rst.next()) {
            Student student = new Student(rst.getInt(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getString(5), rst.getString(6), rst.getString(7), rst.getString(8), rst.getString(9), rst.getString(10), rst.getString(11), rst.getString(12), rst.getString(13), rst.getString(14), rst.getShort(15));
            studentDetailsList.add(student);
        }
        return studentDetailsList;
    }

}
