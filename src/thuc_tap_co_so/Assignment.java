/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuc_tap_co_so;

/**
 *
 * @author P51
 */
public class Assignment {
    private String studentId, topicId;
    
    public Assignment(String s) {
        String a[] = s.trim().split("\\s+");
        this.studentId = a[0];
        this.topicId = a[1];
    }

    public String getStudentId() {
        return studentId;
    }

    public String getTopicId() {
        return topicId;
    }
    
    
}
