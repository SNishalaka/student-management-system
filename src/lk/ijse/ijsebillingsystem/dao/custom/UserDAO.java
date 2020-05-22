/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.ijsebillingsystem.dao.custom;

import lk.ijse.ijsebillingsystem.dao.SuperDAO;
import lk.ijse.ijsebillingsystem.dto.UserDTO;
import lk.ijse.ijsebillingsystem.model.User;

/**
 *
 * @author suuti
 */
public interface UserDAO extends SuperDAO<User>{
    UserDTO searchById(int id) throws Exception;
}
