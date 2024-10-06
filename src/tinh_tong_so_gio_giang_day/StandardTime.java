/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tinh_tong_so_gio_giang_day;

/**
 *
 * @author P51
 */
public class StandardTime {
    private String lecturerId, courseId;
    private double numHours;
    
    public StandardTime(String s) {
        String a[] = s.trim().split("\\s+");
        this.lecturerId = a[0];
        this.courseId = a[1];
        this.numHours = Double.parseDouble(a[2]);
    }

    public String getLecturerId() {
        return lecturerId;
    }

    public double getNumHours() {
        return numHours;
    }
    
    
}
