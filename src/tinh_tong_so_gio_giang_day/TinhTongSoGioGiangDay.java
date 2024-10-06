/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tinh_tong_so_gio_giang_day;

/**
 *
 * @author P51
 */
import java.util.*;
import java.io.*;
public class TinhTongSoGioGiangDay {
    public static void main(String[] args) throws IOException{
//        Scanner input1 = new Scanner(new File("src/file_container/tinh_tong_so_gio_giang_day/MONHOC.in"));
//        Scanner input2 = new Scanner(new File("src/file_container/tinh_tong_so_gio_giang_day/GIANGVIEN.in"));
//        Scanner input3 = new Scanner(new File("src/file_container/tinh_tong_so_gio_giang_day/GIOCHUAN.in"));

        Scanner input1 = new Scanner(new File("MONHOC.in"));
        Scanner input2 = new Scanner(new File("GIANGVIEN.in"));
        Scanner input3 = new Scanner(new File("GIOCHUAN.in"));
        ArrayList<Course> courses = new ArrayList<>();
        ArrayList<Lecturer> lecturers = new ArrayList<>();
        ArrayList<StandardTime> standardTimes = new ArrayList<>();
        
        int n = Integer.parseInt(input1.nextLine());
        for (int i = 0; i < n; i++) {
            courses.add(new Course(input1.nextLine()));
        }
        int m = Integer.parseInt(input2.nextLine());
        for (int i = 0; i < m; i++) {
            lecturers.add(new Lecturer(input2.nextLine()));
        }
        int p = Integer.parseInt(input3.nextLine());
        for (int i = 0; i < p; i++) {
            standardTimes.add(new StandardTime(input3.nextLine()));
            
        }
        
        for (StandardTime x : standardTimes) {
            for (Lecturer y : lecturers) {
                if (y.getLecturerId().equals(x.getLecturerId())) {
                    y.addTotalNumHours(x.getNumHours());
                    break;
                }
            }
        }
        for (Lecturer x : lecturers) {
            System.out.println(x);
        }
    }   
    
}
