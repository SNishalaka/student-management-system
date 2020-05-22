/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.ijsebillingsystem.service.custom.impl;

import java.util.ArrayList;
import lk.ijse.ijsebillingsystem.dao.DAOFactory;
import lk.ijse.ijsebillingsystem.dto.UserDTO;
import lk.ijse.ijsebillingsystem.dao.custom.UserDAO;
import lk.ijse.ijsebillingsystem.service.custom.UserService;

/**
 *
 * @author suuti
 */
public class UserServiceImpl implements UserService{
    
    private UserDAO userDAO;

    public UserServiceImpl() {
        userDAO = (UserDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.USER);
    }
    
    @Override
    public boolean add(UserDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(UserDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(UserDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public UserDTO search(UserDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<UserDTO> getSearched(UserDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<UserDTO> getAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public UserDTO search(int id) throws Exception {
        return userDAO.searchById(id);
    }
    
}
