package lk.ijse.ijsebillingsystem.dto;

/**
 *
 * @author suuti
 */
public class BatchDTO extends SuperDTO{
    
    private int batchID;
    private int courseID;
    private int batchNo;
    private String courseName;
    private String batchName;
    private String startDate;
    private String branch;

    public BatchDTO() {
    }

    public BatchDTO(int batchID, int courseID, int batchNo, String courseName, String batchName, String startDate, String branch) {
        this.batchID = batchID;
        this.courseID = courseID;
        this.batchNo = batchNo;
        this.courseName = courseName;
        this.batchName = batchName;
        this.startDate = startDate;
        this.branch = branch;
    }

    public int getBatchID() {
        return batchID;
    }

    public void setBatchID(int batchID) {
        this.batchID = batchID;
    }

    public int getCourseID() {
        return courseID;
    }

    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }

    public int getBatchNo() {
        return batchNo;
    }

    public void setBatchNo(int batchNo) {
        this.batchNo = batchNo;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getBatchName() {
        return batchName;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    @Override
    public String toString() {
        return "BatchDTO{" + "batchID=" + batchID + ", courseID=" + courseID + ", batchNo=" + batchNo + ", courseName=" + courseName + ", batchName=" + batchName + ", startDate=" + startDate + ", branch=" + branch + '}';
    }

    
}
