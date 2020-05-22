/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.ijsebillingsystem.service;

import java.util.ArrayList;
import lk.ijse.ijsebillingsystem.dto.SuperDTO;

/**
 *
 * @author suuti
 * @param <T>
 */
public interface SuperService<T extends SuperDTO> {

    boolean add(T dto) throws Exception;

    boolean update(T dto) throws Exception;

    boolean delete(T dto) throws Exception;

    T search(T dto) throws Exception;

    ArrayList<T> getSearched(T dto) throws Exception;

    ArrayList<T> getAll() throws Exception;

}
