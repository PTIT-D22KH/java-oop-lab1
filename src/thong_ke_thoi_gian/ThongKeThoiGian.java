/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thong_ke_thoi_gian;

/**
 *
 * @author P51
 */
/*
Hết học kỳ nên rảnh rỗi, nhóm admin CODE PTIT thử thống kê xem trong học kỳ vừa qua sinh viên nào online liên tục lâu nhất trên hệ thống.

Thông tin về thời gian online dài nhất của cá nhân mỗi sinh viên được truy vấn từ CSDL sau đó mô tả với ba thông tin:

Họ và tên sinh viên: xâu ký tự Tiếng Việt không dấu, độ dài không quá 50
Thời gian bắt đầu: đúng định dạng: dd/mm/yyyy hh:mm:ss
Thời gian kết thúc: đúng định dạng: dd/mm/yyyy hh:mm:ss
Hãy tính thời gian online của từng sinh viên và sắp xếp theo thứ tự thời gian giảm dần (từ lâu nhất đến ít nhất). Nếu hai sinh viên có thời gian online bằng nhau thì sắp xếp theo họ tên (thứ tự từ điển).

Input

File văn bản ONLINE.in

Dòng đầu ghi số sinh viên
Mỗi sinh viên ghi trên ba dòng lần lượt là họ tên (đã chuẩn hóa), thời gian bắt đầu, thời gian kết thúc.
Output

Ghi ra danh sách sắp xếp theo thời gian online giảm dần.

Mỗi dòng ghi họ tên và thời lượng online (tính theo phút)

Ví dụ

Input – ONLINE.in



3

Do Viet Anh

11/12/2021 16:35:00

11/12/2021 17:35:00

Le Tuan Anh

11/12/2021 16:45:00

11/12/2021 18:15:00

Nguyen Tuan Anh

11/12/2021 17:00:00

11/12/2021 19:15:00
Output
Nguyen Tuan Anh 135

Le Tuan Anh 90

Do Viet Anh 60
*/
import java.util.*;
import java.io.*;
import java.text.ParseException;
public class ThongKeThoiGian {
    public static void main(String[] args) throws IOException, ParseException{
//        Scanner input = new Scanner(new File("src/file_container/thong_ke_thoi_gian/ONLINE.in"));
        Scanner input = new Scanner(new File("ONLINE.in"));
        int n = Integer.parseInt(input.nextLine());
        ArrayList<Student> students = new ArrayList<>();
        for (int i = 0; i < n; i++)  {
            students.add(new Student(input.nextLine(), input.nextLine(), input.nextLine()));
        }
        Collections.sort(students);
        for (Student x : students) {
            System.out.println(x);
        }
        input.close();
    }
}
