/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.ijsebillingsystem.service.custom;

import lk.ijse.ijsebillingsystem.dto.UserDTO;
import lk.ijse.ijsebillingsystem.service.SuperService;

/**
 *
 * @author suuti
 */
public interface UserService extends SuperService<UserDTO>{
    UserDTO search(int id) throws Exception;
}
