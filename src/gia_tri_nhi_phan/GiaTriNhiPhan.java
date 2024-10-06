/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gia_tri_nhi_phan;

/**
 *
 * @author P51
 */
/*
Cho file nhị phân DATA.in trong đó ghi một ArrayList<String> theo kiểu Object, với không quá 1000 String, mỗi String là một dãy chữ số độ dài không quá 100.

Với mỗi dãy chữ số trong danh sách, hãy tách ra các chữ số nhị phân (ký tự ‘0’ hoặc ‘1’) để tạo nên các biểu diễn dãy nhị phân. Sau đó tính giá trị thập phân ứng với dãy nhị phân đó. Dữ liệu vào đảm bảo dãy nhị phân dài không quá 63 ký tự, tức là giá trị thập phân tương ứng cũng không vượt quá kiểu long trong Java.

 

Input – file nhị phân DATA.in

Gồm một ArrayList<String> với mỗi String là một dãy chữ số.

 

Output

Ghi ra các giá trị nhị phân cho mỗi String trong danh sách và giá trị thập phân tương ứng.

 

Ví dụ

 

Input  - file nhị phân DATA.in
Gồm một ArrayList<String> với mỗi String là một dãy chữ số.  Có thể ví dụ ở dạng ký tự như dưới đây:

5678321010286421

9999999000000000000000000
Output
10101 21

000000000000000000 0
*/
import java.io.*;
import java.util.*;
public class GiaTriNhiPhan {
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        ObjectInputStream input = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<String> a = (ArrayList<String>)input.readObject();
        ArrayList<String> b = new ArrayList<>();
        for (String x : a) {
            StringBuilder temp = new StringBuilder();
            for (int i = 0; i < x.length(); i++) {
                if (x.charAt(i) == '0' || x.charAt(i) == '1') {
                    temp.append(x.charAt(i));
                }
            }
            String extract = temp.toString();
            long res = convertToDecimal(extract);
            System.out.printf("%s %d\n", extract, res);
        }


//        System.out.println(convertToDecimal("10101"));
        
    }
    private static long convertToDecimal(String s) {
        int n = s.length();
        long power = 1;
        long res = 0;
        for (int i =  n - 1; i >= 0; i--) {
            res += (power * (s.charAt(i) - '0'));
            power *= 2;
        }
        return res;
    }
}
