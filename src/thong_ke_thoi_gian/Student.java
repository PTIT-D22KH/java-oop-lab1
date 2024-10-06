/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thong_ke_thoi_gian;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author P51
 */
public class Student implements  Comparable<Student>{
    private String name;
    private Date startDate, endDate;
    private long minsOnline;
    private SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    public Student(String name, String startTimeString, String endTimeString) throws ParseException{
        this.name = name;
        this.startDate = sd.parse(startTimeString);
        this.endDate = sd.parse(endTimeString);
        this.minsOnline = (endDate.getTime() - startDate.getTime()) / (60 * 1000);
    }
    @Override
    public int compareTo(Student other) {
        if (this.minsOnline == other.minsOnline) {
            return this.name.compareTo(other.name);
        } 
        return (int)(other.minsOnline - this.minsOnline);
    }
    @Override
    public String toString(){ 
        return name + " " + minsOnline;
    }
}
