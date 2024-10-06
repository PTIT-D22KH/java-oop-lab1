/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tinh_diem_trung_binh;

import java.util.*;

/**
 *
 * @author P51
 */
/*

Sau khi xem Olympic Tokyo 2020, Nam nhận thấy ở một số nội dung thi có chấm điểm thì điểm được tính cho vận động viên sẽ bỏ qua các giá trị điểm thấp nhất và cao nhất sau đó mới tính trung bình.

Nam mở rộng bài toán như sau: Có N giám khảo, mỗi giám khảo cho một giá trị điểm là một số thực trong đoạn từ 0 đến 10. Hãy loại bỏ các giá trị điểm bằng với điểm thấp nhất hoặc cao nhất, sau đó in ra điểm trung bình của các giá trị còn lại.

Dữ liệu vào của bài toán đảm bảo luôn có ít nhất 3 giá trị khác nhau trong các giá trị điểm ban đầu.

Input - nhập từ bàn phím

Dòng đầu ghi số N là số giám khảo (không quá 100).

Dòng thứ 2 ghi N giá trị điểm, là các số thực trong đoạn [0,10] - đảm bảo luôn có ít nhất 3 giá trị khác nhau.

Output

Ghi ra giá trị điểm trung bình sau khi đã loại bỏ các giá trị nhỏ nhất và lớn nhất. Kết quả được ghi với đúng 2 số phần thập phân.

Ví dụ

Input



6

6.75 8 9.2 7.25 7.75 6.75
Output
7.67
*/
public class TinhDiemTrungBinh {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        ArrayList<Double> a = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            a.add(input.nextDouble());
        }
        double minValue = Collections.min(a);
        double maxValue = Collections.max(a);
        ArrayList<Double> res = new ArrayList<>();
        for (double x : a) {
            if (x != minValue && x != maxValue) {
                res.add(x);
            }
        }
        double ans = 0.0;
        for (double x : res) {
            ans += x;
        }
        ans /= res.size();
        System.out.printf("%.2f", ans);
        
    }
}
