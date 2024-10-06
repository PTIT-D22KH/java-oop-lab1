/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tinh_tong_so_gio_giang_day;

/**
 *
 * @author P51
 */
public class Lecturer {
    private String lecturerId, lecturerName;
    private double totalNumHours;
    
    public Lecturer(String s) {
        String a[] = s.trim().split("\\s+");
        this.lecturerId = a[0];
        StringBuilder name = new StringBuilder();
        for (int i = 1; i < a.length; i++) {
            name.append(a[i]).append(" ");
        }
        
        this.lecturerName = name.toString().trim();
        this.totalNumHours = 0;
    }

    public String getLecturerId() {
        return lecturerId;
    }

    public void addTotalNumHours(double totalNumHours) {
        this.totalNumHours += totalNumHours;
    }
    
    @Override
    public String toString(){
        return lecturerName + String.format(" %.2f", totalNumHours);
    }
    
    
}
