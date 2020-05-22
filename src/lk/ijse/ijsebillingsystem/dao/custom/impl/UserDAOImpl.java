/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.ijsebillingsystem.dao.custom.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import lk.ijse.ijsebillingsystem.model.User;
import lk.ijse.ijsebillingsystem.dao.custom.UserDAO;
import lk.ijse.ijsebillingsystem.db.DBConnection;
import lk.ijse.ijsebillingsystem.dto.UserDTO;

/**
 *
 * @author suuti
 */
public class UserDAOImpl implements UserDAO{
    
    private Connection connection;

    @Override
    public boolean save(User model) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean modify(User model) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean remove(User model) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public User search(User model) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<User> getSearched(User model) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<User> serachAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public UserDTO searchById(int id) throws Exception {
        connection = DBConnection.getDBConnection().getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT * FROM user WHERE uid = ?" );
        statement.setInt(1, id);
        ResultSet rs = statement.executeQuery();
        
        if (rs.next()) {
            UserDTO userDTO = new UserDTO(rs.getString("userName"), rs.getString("password"));
            return userDTO;
        }
            return null;
        }
    
}
