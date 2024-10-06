/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luyen_tap_lap_trinh;

/**
 *
 * @author P51
 */
public class Student implements Comparable<Student>{
    private String name;
    private int numTrues, numSubmits;
    
    public Student(String name, String resultPractice) {
        this.name = name;
        String a[] = resultPractice.trim().split("\\s+");
        this.numTrues = Integer.parseInt(a[0]);
        this.numSubmits = Integer.parseInt(a[1]);
    }
    
    @Override
    public String toString() {
        return name + " " + numTrues + " " + numSubmits;
    } 
    @Override
    public int compareTo(Student other) {
        if (this.numTrues == other.numTrues) {
            if (this.numSubmits == other.numSubmits) {
                return this.name.compareTo(other.name);
            }
            return Integer.compare(this.numSubmits, other.numSubmits);
        } 
        return Integer.compare(other.numTrues, this.numTrues);
    }
    
    
}
