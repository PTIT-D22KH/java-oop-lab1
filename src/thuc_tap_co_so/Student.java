/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuc_tap_co_so;

/**
 *
 * @author P51
 */
public class Student implements Comparable<Student>{
    private String studentId, name, phoneNumber, email;
    private Topic topic;

    public Student(String studentId, String name, String phoneNumber, String email) {
        this.studentId = studentId;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public void setTopic(Topic topic) {
        this.topic = topic;
    }
    
    @Override
    public int compareTo(Student other) {
        return this.topic.compareTo(other.topic);
    }

    public String getStudentId() {
        return studentId;
    }
    
    
    
    @Override
    public String toString() {
        return studentId + " " + name + " " + phoneNumber + " " + email + " " + topic;
    }
    
}
