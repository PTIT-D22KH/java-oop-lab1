/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tinh_tong_so_gio_giang_day;

/**
 *
 * @author P51
 */
public class Course {
    private String courseId, courseName;
    
    public Course(String s) {
        String a[] = s.trim().split("\\s+");
        this.courseId = a[0];
        StringBuilder name = new StringBuilder();
        for (int i = 1; i < a.length; i++) {
            name.append(a[i]).append(" ");
        }
        this.courseName = name.toString().trim();
    }
    
    
}
