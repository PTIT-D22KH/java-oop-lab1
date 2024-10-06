/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package danh_dau_san_pham_loi;

/**
 *
 * @author P51
 */
/*

Sau khi qua công đoạn đóng gói, các sản phẩm của công ty X sẽ được đưa qua máy phát hiện lỗi. Các sản phẩm lỗi sẽ được trả lại và thứ tự của sản phẩm đó sẽ được ghi vào file log.

Dựa trên file log của hệ thống, hãy liệt kê danh sách chi tiết các sản phẩm bị lỗi và các sản phẩm tốt.

Input - nhập từ bàn phím

Dòng đầu ghi 2 số N, M lần lượt là tổng số sản phẩm và số sản phẩm bị lỗi,

2 ≤ N ≤ 100000; 1 ≤ M ≤ min(N,1000).

Tiếp theo là M giá trị số, ghi rõ thứ tự các sản phẩm lỗi theo thứ tự tăng dần. Các giá trị này đảm bảo trong phạm vi từ 1 đến N.

Output - in ra màn hình

Ghi 2 dòng:

Dòng 1 là các dòng hoặc đoạn liên tiếp các sản phẩm bị lỗi theo thứ tự tăng dần
Dòng 2 là các sản phẩm đơn hoặc đoạn liên tiếp các sản phẩm đã viết chính xác theo thứ tự tăng dần
Chú ý: sử dụng dấu gạch ngang để biểu thị đoạn liên tiếp. Xem ví dụ để hiểu rõ hơn cách ghi kết quả.

Ví dụ

Input 1

100 10
2 3 5 10 11 12 25 26 88 89

Output 1

Errors: 2-3, 5, 10-12, 25-26 and 88-89
Correct: 1, 4, 6-9, 13-24, 27-87 and 90-100

Input 2

40 18
1 3 4 6 7 8 9 12 13 14 20 25 26 27 28 30 38 40

Output 2

Errors: 1, 3-4, 6-9, 12-14, 20, 25-28, 30, 38 and 40
Correct: 2, 5, 10-11, 15-19, 21-24, 29, 31-37 and 39
*/
import java.util.*;
import java.io.*;
public class DanhDauSanPhamLoi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();
        int m = input.nextInt();
        int a[] = new int[m];
        for (int i = 0; i < m; i++) {
            a[i] = input.nextInt();
            
        }
        ArrayList<String> errors = new ArrayList<>();
        ArrayList<String> corrects = new ArrayList<>();
        
        int start = a[0];
        int end = a[0];
        for (int i = 1; i < m; i++) {
            if (a[i] == end + 1) {
                end = a[i];
                
            } else {
                if (start == end) {
                    errors.add(String.valueOf(start));
                } else {
                    errors.add(start + "-" + end);
                }
                start = a[i];
                end = a[i];
                       
            }
        }
        if (start == end) {
            errors.add(String.valueOf(start));
        } else {
            errors.add(start + "-" + end);
        }
        start = -1;
        end = -1;
        Set<Integer> se = new HashSet<>();
        for (int i = 0; i < m; i++) {
            se.add(a[i]);
        }
        for (int i = 1; i <= n; i++) {
            if (!se.contains(i)) {
                if (start == -1) {
                    start = i;
                }
            } else {
                if (start != -1) {
                    if (start == i - 1) {
                        corrects.add(String.valueOf(start));
                    } else {
                        corrects.add(start + "-" + String.valueOf(i - 1));
                    }
                    start = -1;
                }
            }
        }
        if (start != -1) {
            if (start == n) {
                corrects.add(String.valueOf(start));
            } else {
                corrects.add(start + "-" + String.valueOf(n));
            }
        }
               
        System.out.print("Errors: ");
        for (int i = 0; i < errors.size() - 1; i++) {
            System.out.printf(errors.get(i));
            if (i != errors.size() - 2) {
                System.out.print(", ");
            }
            
        }
        System.out.println(" and " + errors.get(errors.size() - 1));
        System.out.print("Correct: ");
        for (int i = 0; i < corrects.size() - 1; i++) {
            System.out.printf(corrects.get(i));
            if (i != corrects.size() - 2) {
                System.out.print(", ");
            }
            
        }
        System.out.println(" and " + corrects.get(corrects.size() - 1));
        
    }
}
