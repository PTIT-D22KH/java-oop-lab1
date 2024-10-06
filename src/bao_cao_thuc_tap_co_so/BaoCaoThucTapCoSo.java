/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bao_cao_thuc_tap_co_so;

import java.util.*;
import java.io.*;

/**
 *
 * @author P51
 */
/*
Học kỳ 2 năm thứ 3, sinh viên ngành CNTT của Học viện Hoàng gia sẽ có môn thực tập cơ sở. Để tổ chức môn học này, mỗi giảng viên sẽ đăng ký một danh sách các đề tài ứng dụng thực tế, sau đó sinh viên sẽ lựa chọn đề tài trong danh sách này và hoàn thành trong thời gian 2 tháng. Hội đồng báo cáo thực tập sẽ được gán cho từng đề tài, khi báo cáo tất cả giảng viên và sinh viên của cùng một hội đồng sẽ báo cáo chung trong một thời gian xác định trước và có thể cho ý kiến đánh giá lẫn nhau giúp cho báo cáo thực tập của sinh viên hoàn thiện hơn.

Cho danh sách sinh viên, danh sách đề tài và ghép sinh viên, đề tài với thứ tự hội đồng. Hãy lập danh sách từng hội đồng báo cáo thực tập cơ sở sắp xếp theo mã sinh viên.

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
Thông tin về việc giao nhiệm vụ thực tập cơ sở cho sinh viên được cho trong file HOIDONG.in trong đó:

Dòng đầu ghi số sinh viên (đảm bảo bằng số sinh viên trong SINHVIEN.in)
Mỗi dòng ghi ba giá trị: mã sinh viên, mã đề tài và mã hội đồng cách nhau một khoảng trống (giá trị mã hội đồng chỉ đơn giản là HD1 đến HD8 tương ứng với HOI DONG 1 đến HOI DONG 8).
 

Output

Ghi danh sách từng hội đồng từ 1 đến 8 đã được sắp xếp theo tên mã sinh viên (thứ tự từ điển), mỗi dòng có các thông tin:

Mã sinh viên
Họ tên sinh viên
Tên đề tài
Giảng viên hướng dẫn
Ví dụ

Input – 3 file văn bản

SINHVIEN.in

2

B19DCCN999

Ngo Quang Huy

0976544443

B19DCCN999@stu.ptit.edu.vn

B17DCCN997

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

 

HOIDONG.in

2

B19DCCN997 DT001 HD2

B19DCCN999 DT002 HD1

Output

DANH SACH HOI DONG 1:

B19DCCN999 Ngo Quang Huy Xay dung he thong diem danh bang nhan dang van tay Tran Thanh Cong

DANH SACH HOI DONG 2:

B19DCCN997 Nguyen Manh Cuong Xay dung website tim kiem nha thong minh Nguyen Hoai Nam

 

 

Chú ý: output với mỗi sinh viên cần in trên một dòng. Trong ví dụ ghi trên 2 dòng do giới hạn của màn hình hiển thị.
*/
public class BaoCaoThucTapCoSo {
    public static void main(String[] args) throws IOException{
//        Scanner input1 = new Scanner(new File("src/file_container/bao_cao_thuc_tap_co_so/SINHVIEN.in"));
//        Scanner input2 = new Scanner(new File("src/file_container/bao_cao_thuc_tap_co_so/DETAI.in"));
//        Scanner input3 = new Scanner(new File("src/file_container/bao_cao_thuc_tap_co_so/HOIDONG.in"));

        Scanner input1 = new Scanner(new File("SINHVIEN.in"));
        Scanner input2 = new Scanner(new File("DETAI.in"));
        Scanner input3 = new Scanner(new File("HOIDONG.in"));
        
        ArrayList<Student> students = new ArrayList<>();
        ArrayList<Topic> topics = new ArrayList<>();
        ArrayList<Commitee> commitees = new ArrayList<>();
        
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
            commitees.add(new Commitee(input3.nextLine()));
        }
        for (Commitee x : commitees) {
            for (Student y : students ) {
                if (y.getStudentId().equals(x.getStudentId())) {
                    for (Topic z : topics) {
                        if (z.getTopicId().equals(x.getTopicId())) {
                            y.setTopic(z);
                            y.setCommitee(x);
                            break;
                        }
                    }
                    break;
                }
            }
        }
        Collections.sort(students);
        Collections.sort(commitees);
        TreeSet<Commitee> tsCommitees = new TreeSet<>(commitees);
        
        for (Commitee x : tsCommitees) {
            System.out.printf("DANH SACH HOI DONG %s:\n", x.getCommiteeId().charAt(2));
            for (Student y : students) {
                if (y.getCommitee().getCommiteeId().equals(x.getCommiteeId())) {
                    System.out.println(y);
                }
            }
        }
    }
}
