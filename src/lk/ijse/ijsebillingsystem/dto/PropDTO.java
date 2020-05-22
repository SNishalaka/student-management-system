
package lk.ijse.ijsebillingsystem.dto;

/**
 *
 * @author suuti
 */
public class PropDTO {
    private String server;
    private String user;
    private String database;
    private String DBPassword;
    
    private String masterPassword;
    private String repeatPassword;
    private String newPassword;
    
    private String notifyDate;
    private String notifyDateDuration;
    
    public PropDTO() {
    }

    public PropDTO(String server, String user, String database, String DBPassword, String masterPassword, String repeatPassword, String newPassword, String notifyDate, String notifyDateDuration) {
        this.server = server;
        this.user = user;
        this.database = database;
        this.DBPassword = DBPassword;
        this.masterPassword = masterPassword;
        this.repeatPassword = repeatPassword;
        this.newPassword = newPassword;
        this.notifyDate = notifyDate;
        this.notifyDateDuration = notifyDateDuration;
    }

    public String getServer() {
        return server;
    }

    public void setServer(String server) {
        this.server = server;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getDatabase() {
        return database;
    }

    public void setDatabase(String database) {
        this.database = database;
    }

    public String getDBPassword() {
        return DBPassword;
    }

    public void setDBPassword(String DBPassword) {
        this.DBPassword = DBPassword;
    }

    public String getMasterPassword() {
        return masterPassword;
    }

    public void setMasterPassword(String masterPassword) {
        this.masterPassword = masterPassword;
    }

    public String getRepeatPassword() {
        return repeatPassword;
    }

    public void setRepeatPassword(String repeatPassword) {
        this.repeatPassword = repeatPassword;
    }

    public String getNewPassword() {
        return newPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }

    public String getNotifyDate() {
        return notifyDate;
    }

    public void setNotifyDate(String notifyDate) {
        this.notifyDate = notifyDate;
    }

    public String getNotifyDateDuration() {
        return notifyDateDuration;
    }

    public void setNotifyDateDuration(String notifyDateDuration) {
        this.notifyDateDuration = notifyDateDuration;
    }

    @Override
    public String toString() {
        return "PropDTO{" + "server=" + server + ", user=" + user + ", database=" + database + ", DBPassword=" + DBPassword + ", masterPassword=" + masterPassword + ", repeatPassword=" + repeatPassword + ", newPassword=" + newPassword + ", notifyDate=" + notifyDate + ", notifyDateDuration=" + notifyDateDuration + '}';
    }    
}
