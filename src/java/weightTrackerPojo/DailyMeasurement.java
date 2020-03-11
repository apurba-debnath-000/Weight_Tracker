package weightTrackerPojo;
// Generated Jan 18, 2018 2:53:48 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * DailyMeasurement generated by hbm2java
 */
public class DailyMeasurement  implements java.io.Serializable {


     private Integer measurementId;
     private Dailylog dailylog = new Dailylog();
     private Date measurementDate;
     private String measurementShift;
     private Double weightValue;
     private Double waistSize;

    public DailyMeasurement() {
    }

    public DailyMeasurement(Dailylog dailylog, Date measurementDate, String measurementShift, Double weightValue, Double waistSize) {
       this.dailylog = dailylog;
       this.measurementDate = measurementDate;
       this.measurementShift = measurementShift;
       this.weightValue = weightValue;
       this.waistSize = waistSize;
    }
   
    public Integer getMeasurementId() {
        return this.measurementId;
    }
    
    public void setMeasurementId(Integer measurementId) {
        this.measurementId = measurementId;
    }
    public Dailylog getDailylog() {
        return this.dailylog;
    }
    
    public void setDailylog(Dailylog dailylog) {
        this.dailylog = dailylog;
    }
    public Date getMeasurementDate() {
        return this.measurementDate;
    }
    
    public void setMeasurementDate(Date measurementDate) {
        this.measurementDate = measurementDate;
    }
    public String getMeasurementShift() {
        return this.measurementShift;
    }
    
    public void setMeasurementShift(String measurementShift) {
        this.measurementShift = measurementShift;
    }
    public Double getWeightValue() {
        return this.weightValue;
    }
    
    public void setWeightValue(Double weightValue) {
        this.weightValue = weightValue;
    }
    public Double getWaistSize() {
        return this.waistSize;
    }
    
    public void setWaistSize(Double waistSize) {
        this.waistSize = waistSize;
    }




}

