/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.ijsebillingsystem.service.custom.impl;

import java.util.ArrayList;
import lk.ijse.ijsebillingsystem.dao.DAOFactory;
import lk.ijse.ijsebillingsystem.dao.custom.CourseDAO;
import lk.ijse.ijsebillingsystem.dto.CourseDTO;
import lk.ijse.ijsebillingsystem.model.Course;
import lk.ijse.ijsebillingsystem.service.custom.CourseService;

/**
 *
 * @author suuti
 */
public class CourseServiceImpl implements CourseService{

    private CourseDAO courseDAO;

    public CourseServiceImpl() {
        courseDAO = (CourseDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.COURSE);
    }    
    
    @Override
    public boolean add(CourseDTO dto) throws Exception {
        Course course = new Course(dto.getCourseID(), dto.getCourseName(), dto.getCourseType(), dto.getDuration(), dto.getNo_of_payment(), dto.getStudent_limit(), dto.getTax(), dto.getCourse_fee(), dto.getDiscount(), dto.getLate_payment_added_value());
        return courseDAO.save(course);
    }

    @Override
    public boolean update(CourseDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(CourseDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public CourseDTO search(CourseDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<CourseDTO> getSearched(CourseDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<CourseDTO> getAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
