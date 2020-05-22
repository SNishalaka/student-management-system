/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.ijsebillingsystem.service.custom.impl;

import java.util.ArrayList;
import lk.ijse.ijsebillingsystem.dao.DAOFactory;
import lk.ijse.ijsebillingsystem.dao.custom.StudentDAO;
import lk.ijse.ijsebillingsystem.dto.StudentDTO;
import lk.ijse.ijsebillingsystem.dto.SuperDTO;
import lk.ijse.ijsebillingsystem.model.Student;
import lk.ijse.ijsebillingsystem.service.custom.StudentService;

/**
 *
 * @author suuti
 */
public class StudentServiceImpl implements StudentService {

    private StudentDAO studentDAO;

    public StudentServiceImpl() {
        studentDAO = (StudentDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.STUDENT);
    }

    @Override
    public boolean add(StudentDTO dto) throws Exception {
        Student student;
        student = new Student(0, dto.getInitialStudentName(), dto.getStudentFullName(), dto.getAddressLine(), dto.getTelHome(), dto.getMobile(), dto.getEmail(), dto.getDob(), dto.getNic(), dto.getGender(), dto.getSchool(), dto.getUniversity(), dto.getFaculty(), dto.getStatus() ,dto.getRegFee());
        return studentDAO.save(student);

    }

    @Override
    public boolean update(StudentDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(StudentDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public StudentDTO search(StudentDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<StudentDTO> getSearched(StudentDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<StudentDTO> getAll() throws Exception {
        ArrayList<Student> studentList = studentDAO.serachAll();
        ArrayList<StudentDTO> students = new ArrayList<>();

        for (Student student : studentList) {
            StudentDTO studentDTO = new StudentDTO(student.getSID(), student.getInitialStudentName(), student.getStudentFullName(), student.getAddressLine(), student.getTelHome(), student.getMobile(), student.getEmail(), student.getDob(), student.getNic(), student.getGender(), student.getSchool(), student.getUniversity(), student.getFaculty(),student.getStatus(),student.getRegFee());
            students.add(studentDTO);
        }
        return students;
    }

}
