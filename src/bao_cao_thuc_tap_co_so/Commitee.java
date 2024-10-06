/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bao_cao_thuc_tap_co_so;

/**
 *
 * @author P51
 */
public class Commitee implements Comparable<Commitee>{
    private String studentId, topicId, commiteeId;
    
    public Commitee(String s) {
        String a[] = s.trim().split("\\s+");
        this.studentId = a[0];
        this.topicId = a[1];
        this.commiteeId = a[2];
    }

    public String getStudentId() {
        return studentId;
    }

    public String getTopicId() {
        return topicId;
    }

    public String getCommiteeId() {
        return commiteeId;
    }
    
    @Override
    public int compareTo(Commitee other) {
        return this.commiteeId.compareTo(other.commiteeId);
    }
    
    
    
    
}
