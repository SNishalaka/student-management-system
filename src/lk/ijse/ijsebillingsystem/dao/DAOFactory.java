/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.ijsebillingsystem.dao;

import lk.ijse.ijsebillingsystem.dao.custom.impl.BatchDAOImpl;
import lk.ijse.ijsebillingsystem.dao.custom.impl.CourseDAOImpl;
import lk.ijse.ijsebillingsystem.dao.custom.impl.UserDAOImpl;
import lk.ijse.ijsebillingsystem.dao.custom.impl.StudentDAOImpl;

/**
 *
 * @author suuti
 */
public class DAOFactory {

    private DAOFactory() {

    }

    public enum DAOTypes {
        STUDENT , COURSE , BATCH ,USER
    }

    private static DAOFactory dAOFactory;

    public static DAOFactory getInstance() {
        if (dAOFactory == null) {
            dAOFactory = new DAOFactory();
        }
        return dAOFactory;
    }

    public SuperDAO getDAO(DAOTypes dao) {
        switch (dao) {
            case STUDENT:
                return new StudentDAOImpl();
            case COURSE:
                return new CourseDAOImpl();
            case BATCH:
                return new BatchDAOImpl();
            case USER:
                return new UserDAOImpl();
            default:
                return null;
        }

    }

}
