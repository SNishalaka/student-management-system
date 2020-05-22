/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.ijsebillingsystem.dao;

import java.util.ArrayList;

/**
 *
 * @author suuti
 * @param <T>
 */
public interface SuperDAO<T> {

    boolean save(T model) throws Exception;

    boolean modify(T model) throws Exception;

    boolean remove(T model) throws Exception;

    T search(T model) throws Exception;

    ArrayList<T> getSearched(T model) throws Exception;

    ArrayList<T> serachAll() throws Exception;

}
