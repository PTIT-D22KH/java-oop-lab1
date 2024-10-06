/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuc_tap_co_so;

/**
 *
 * @author P51
 */
public class Topic implements Comparable<Topic>{
    private String professor, name, topicId;
    private static int count = 0;

    public Topic(String professor, String name) {
        this.professor = professor;
        this.name = name;
        this.topicId = String.format("DT%03d", ++count);
    }

    public String getTopicId() {
        return topicId;
    }
    @Override
    public int compareTo(Topic other) {
        return this.name.compareTo(other.name);
    }
    @Override
    public String toString () {
        return professor + " " + name;
    }
    
    
    
}
