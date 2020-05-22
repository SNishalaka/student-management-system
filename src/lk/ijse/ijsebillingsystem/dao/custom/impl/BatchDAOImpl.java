
package lk.ijse.ijsebillingsystem.dao.custom.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import lk.ijse.ijsebillingsystem.dao.custom.BatchDAO;
import lk.ijse.ijsebillingsystem.db.DBConnection;
import lk.ijse.ijsebillingsystem.model.Batch;

/**
 *
 * @author suuti
 */
public class BatchDAOImpl implements BatchDAO {

    private Connection connection;

    @Override
    public boolean save(Batch batch) throws Exception {
        connection = DBConnection.getDBConnection().getConnection();

        PreparedStatement statement = connection.prepareStatement("INSERT INTO batch VALUES(?,?,?,?,?,?,?)");
        statement.setObject(1, batch.getCourseID());
        statement.setObject(2, batch.getBatchID());
        statement.setObject(3, batch.getBatchNo());
        statement.setObject(4, batch.getCourseName());
        statement.setObject(5, batch.getBatchName());
        statement.setObject(6, batch.getStartDate());
        statement.setObject(7, batch.getBranch());

        return statement.executeUpdate() > 0;
    }

    @Override
    public boolean modify(Batch model) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean remove(Batch model) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Batch search(Batch model) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Batch> getSearched(Batch model) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Batch> serachAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
