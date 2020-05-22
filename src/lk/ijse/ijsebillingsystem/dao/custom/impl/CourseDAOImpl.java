package lk.ijse.ijsebillingsystem.dao.custom.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import lk.ijse.ijsebillingsystem.dao.custom.CourseDAO;
import lk.ijse.ijsebillingsystem.db.DBConnection;
import lk.ijse.ijsebillingsystem.model.Course;

/**
 *
 * @author suuti
 */
public class CourseDAOImpl implements CourseDAO{
    
    private Connection connection;

    @Override
    public boolean save(Course course) throws Exception {
        
        connection = DBConnection.getDBConnection().getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO course_details VALUES(?,?,?,?,?,?,?,?,?,?)");
        preparedStatement.setObject(1, course.getCourseID());
        preparedStatement.setObject(2, course.getCourseName());
        preparedStatement.setObject(3, course.getCourseType());
        preparedStatement.setObject(4, course.getDuration());
        preparedStatement.setObject(5, course.getNo_of_payment());
        preparedStatement.setObject(6, course.getStudent_limit());
        preparedStatement.setObject(7, course.getTax());
        preparedStatement.setObject(8, course.getCourse_fee());
        preparedStatement.setObject(9, course.getDiscount());
        preparedStatement.setObject(10, course.getLate_payment_added_value());
        
        return preparedStatement.executeUpdate()>0;
    }

    @Override
    public boolean modify(Course model) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean remove(Course model) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Course search(Course model) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Course> getSearched(Course model) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Course> serachAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
