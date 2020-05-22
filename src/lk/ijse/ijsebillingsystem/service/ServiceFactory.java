package lk.ijse.ijsebillingsystem.service;

import lk.ijse.ijsebillingsystem.service.custom.impl.BatchServiceImpl;
import lk.ijse.ijsebillingsystem.service.custom.impl.CourseServiceImpl;
import lk.ijse.ijsebillingsystem.service.custom.impl.UserServiceImpl;
import lk.ijse.ijsebillingsystem.service.custom.impl.StudentServiceImpl;

/**
 *
 * @author suuti
 */
public class ServiceFactory {
    
    public enum ServiceTypes {
        STUDENT, COURSE ,BATCH, USER
    }

    private static ServiceFactory serviceFactory;

    public static ServiceFactory getInstance() {
        if (serviceFactory == null) {
            serviceFactory = new ServiceFactory();
        }
        return serviceFactory;
    }

    public SuperService getService(ServiceTypes serviceTypes) {
        switch (serviceTypes) {
            case STUDENT:
                return new StudentServiceImpl();
            case COURSE:
                return new CourseServiceImpl();
            case BATCH:
                return new BatchServiceImpl();
            case USER:
                return new UserServiceImpl();
            default:
                return null;
        }

    }
}
