/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuc_tap_co_so;

/**
 *
 * @author P51
 */
/*
Học kỳ 2 năm thứ 3, sinh viên ngành CNTT của Học viện Hoàng gia sẽ có môn thực tập cơ sở. Để tổ chức môn học này, mỗi giảng viên sẽ đăng ký một danh sách các đề tài ứng dụng thực tế, sau đó sinh viên sẽ lựa chọn đề tài trong danh sách này và hoàn thành trong thời gian 2 tháng.

Cho danh sách sinh viên, danh sách đề tài và ghép cặp sinh viên với đề tài. Hãy lập danh sách giao nhiệm vụ thực tập cơ sở.

Input – 3 file văn bản

Thông tin sinh viên cho trong file SINHVIEN.in trong đó:

Dòng đầu ghi số sinh viên.
Mỗi sinh viên ghi trên 4 dòng lần lượt là mã SV, họ tên, số ĐT, email.
(tương tự bài tập trước)

Thông tin đề tài cho trong file DETAI.in trong đó:

Dòng đầu ghi số đề tài (đảm bảo lớn hơn hoặc bằng số sinh viên)
Mỗi đề tài ghi trên 2 dòng:
Tên giảng viên: đã chuẩn hóa, độ dài không quá 50
Tên đề tài: dãy ký tự độ dài không quá 200.
Các đề tài sẽ được gán mã tự động tăng theo thứ tự nhập, tính từ DT001
Thông tin về việc giao nhiệm vụ thực tập cơ sở cho sinh viên được cho trong file NHIEMVU.in trong đó:

Dòng đầu ghi số sinh viên (đảm bảo bằng số sinh viên trong SINHVIEN.in)
Mỗi dòng ghi mã sinh viên và mã đề tài cách nhau một khoảng trống
 

Output

Ghi danh sách giao nhiệm vụ thực tập cơ sở đã được sắp xếp theo tên đề tài (thứ tự từ điển), mỗi dòng có các thông tin:

Mã sinh viên
Họ tên sinh viên
SĐT
Email
Họ tên giảng viên hướng dẫn
Tên đề tài
Ví dụ

Input – 3 file văn bản

SINHVIEN.in

2

B19DCCN999

Ngo Quang Huy

0976544443

B19DCCN999@stu.ptit.edu.vn

B19DCCN997

Nguyen Manh Cuong

0987654321

B19DCCN997@stu.ptit.edu.vn

 

DETAI.in

3

Nguyen Hoai Nam

Xay dung website tim kiem nha thong minh

Tran Thanh Cong

Xay dung he thong diem danh bang nhan dang van tay

Le Thi My Uyen

Xay dung website cap nhat tin tuc

 

NHIEMVU.in

2

B19DCCN997 DT001

B19DCCN999 DT002

Output

B19DCCN999 Ngo Quang Huy 0976544443 B19DCCN999@stu.ptit.edu.vn

Tran Thanh Cong Xay dung he thong diem danh bang nhan dang van tay

B19DCCN997 Nguyen Manh Cuong 0987654321 B19DCCN997@stu.ptit.edu.vn

Nguyen Hoai Nam Xay dung website tim kiem nha thong minh

 

 

Chú ý: output với mỗi sinh viên cần in trên một dòng. Trong ví dụ ghi trên 2 dòng do giới hạn của màn hình hiển thị.
*/
import java.util.*;
import java.io.*;
public class ThucTapCoSo {
    public static void main(String[] args) throws IOException{
//        Scanner input1 = new Scanner(new File("src/file_container/thuc_tap_co_so/SINHVIEN.in"));
//        Scanner input2 = new Scanner(new File("src/file_container/thuc_tap_co_so/DETAI.in"));
//        Scanner input3 = new Scanner(new File("src/file_container/thuc_tap_co_so/NHIEMVU.in"));

        Scanner input1 = new Scanner(new File("SINHVIEN.in"));
        Scanner input2 = new Scanner(new File("DETAI.in"));
        Scanner input3 = new Scanner(new File("NHIEMVU.in"));
        
        ArrayList<Student> students = new ArrayList<>();
        ArrayList<Topic> topics = new ArrayList<>();
        ArrayList<Assignment> assignments = new ArrayList<>();
        
        int n = Integer.parseInt(input1.nextLine());
        for (int i = 0; i < n; i++) {
            students.add(new Student(input1.nextLine(), input1.nextLine(), input1.nextLine(), input1.nextLine()));
        }
        int m = Integer.parseInt(input2.nextLine());
        for (int i = 0; i < m; i++) {
            topics.add(new Topic(input2.nextLine(), input2.nextLine()));
        }
        int p = Integer.parseInt(input3.nextLine());
        for (int i = 0; i < p; i++) {
            assignments.add(new Assignment(input3.nextLine()));
        }
        for (Assignment x : assignments) {
            for (Student y : students ) {
                if (y.getStudentId().equals(x.getStudentId())) {
                    for (Topic z : topics) {
                        if (z.getTopicId().equals(x.getTopicId())) {
                            y.setTopic(z);
                            break;
                        }
                    }
                    break;
                }
            }
        }
        Collections.sort(students);
        for (Student x : students) {
            System.out.println(x);
        }
        
    }
}
