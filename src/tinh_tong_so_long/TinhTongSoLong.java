/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tinh_tong_so_long;
import java.util.*;
import java.io.*;
/**
 *
 * @author P51
 */
/*
Cho file dữ liệu dạng văn bản DATA.in có thể chứa cả số và ký tự.

Không có số nguyên âm nào ở trong file.

Hãy lọc ra các số nguyên vượt quá kiểu dữ liệu int nhưng vẫn trong giới hạn kiểu long trong file và tính tổng các số đó.

Chú ý: file dữ liệu có rất nhiều dòng với rất nhiều số và ký tự xen kẽ nhau. Chỉ tính tổng các số thỏa mãn điều kiện là số kiểu long nhưng không thoả mãn kiểu int.

Input

File văn bản DATA.in có không quá 1000 dòng.

Output

Ghi ra giá trị tổng các số thoả mãn điều kiện.

Ví dụ

DATA.in


12 3 4 5 6 7
123243434354546
Aaa 1 1 Bbb XXX yyy 5 5 dsfrgrt3
45646szdfse545
44444444444444
999999999999999999999999999 
9876543456
9

Output
167697755342446
*/
public class TinhTongSoLong {
    public static void main(String[] args) throws IOException{
//        Scanner input = new Scanner(new File("src/file_container/tinh_tong_so_long/DATA.in"));
        Scanner input = new Scanner(new File("DATA.in"));
        StringBuilder temp = new StringBuilder();
        long res = 0;
        while(input.hasNextLine()) {
            String x = input.nextLine().trim();
            String a[] = x.split("\\s+");
            for (String s : a) {
                int t = 0;
                long b = 0;
                try {
                    t = Integer.parseInt(s);
                } catch (Exception e) {
                    try {
                        b = Long.parseLong(s);
                        res += b;
                    } catch (Exception tempException) {
                        
                    }
                }
            }
            
        }
        System.out.println(res);
//        String 
   
    }
}
