package lk.ijse.ijsebillingsystem.dto;

/**
 *
 * @author suuti
 */
public class CourseDTO extends SuperDTO{
    
    private int courseID;
    private String courseName;
    private String courseType;
    private String duration;
    private String no_of_payment;
    private String student_limit;
    private String tax;
    private double course_fee;
    private String discount;
    private String late_payment_added_value;

    public CourseDTO() {
    }

    public CourseDTO(int courseID, String courseName, String courseType, String duration, String no_of_payment, String student_limit, String tax, double course_fee, String discount, String late_payment_added_value) {
        this.courseID = courseID;
        this.courseName = courseName;
        this.courseType = courseType;
        this.duration = duration;
        this.no_of_payment = no_of_payment;
        this.student_limit = student_limit;
        this.tax = tax;
        this.course_fee = course_fee;
        this.discount = discount;
        this.late_payment_added_value = late_payment_added_value;
    }

    public int getCourseID() {
        return courseID;
    }

    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseType() {
        return courseType;
    }

    public void setCourseType(String courseType) {
        this.courseType = courseType;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getNo_of_payment() {
        return no_of_payment;
    }

    public void setNo_of_payment(String no_of_payment) {
        this.no_of_payment = no_of_payment;
    }

    public String getStudent_limit() {
        return student_limit;
    }

    public void setStudent_limit(String student_limit) {
        this.student_limit = student_limit;
    }

    public String getTax() {
        return tax;
    }

    public void setTax(String tax) {
        this.tax = tax;
    }

    public double getCourse_fee() {
        return course_fee;
    }

    public void setCourse_fee(double course_fee) {
        this.course_fee = course_fee;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public String getLate_payment_added_value() {
        return late_payment_added_value;
    }

    public void setLate_payment_added_value(String late_payment_added_value) {
        this.late_payment_added_value = late_payment_added_value;
    }

    @Override
    public String toString() {
        return "CourseDTO{" + "courseID=" + courseID + ", courseName=" + courseName + ", courseType=" + courseType + ", duration=" + duration + ", no_of_payment=" + no_of_payment + ", student_limit=" + student_limit + ", tax=" + tax + ", course_fee=" + course_fee + ", discount=" + discount + ", late_payment_added_value=" + late_payment_added_value + '}';
    }  
}
