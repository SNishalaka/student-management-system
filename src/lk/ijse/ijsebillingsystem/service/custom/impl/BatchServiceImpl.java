package lk.ijse.ijsebillingsystem.service.custom.impl;

import java.util.ArrayList;
import lk.ijse.ijsebillingsystem.dao.DAOFactory;
import lk.ijse.ijsebillingsystem.dao.custom.BatchDAO;
import lk.ijse.ijsebillingsystem.dto.BatchDTO;
import lk.ijse.ijsebillingsystem.model.Batch;
import lk.ijse.ijsebillingsystem.service.custom.BatchService;

/**
 *
 * @author suuti
 */
public class BatchServiceImpl implements BatchService{
    
    private BatchDAO batchDAO;

    public BatchServiceImpl() {
        batchDAO = (BatchDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.BATCH);
    }
    
    @Override
    public boolean add(BatchDTO batchDto) throws Exception {
        
        Batch batch =  new Batch(batchDto.getBatchID(), batchDto.getCourseID(), batchDto.getBatchNo(), batchDto.getCourseName(), batchDto.getBatchName(), batchDto.getStartDate(), batchDto.getBranch());
        return batchDAO.save(batch);
    }

    @Override
    public boolean update(BatchDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(BatchDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public BatchDTO search(BatchDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<BatchDTO> getSearched(BatchDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<BatchDTO> getAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
