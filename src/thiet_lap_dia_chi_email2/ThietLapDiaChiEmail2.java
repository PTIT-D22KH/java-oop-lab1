/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thiet_lap_dia_chi_email2;

/**
 *
 * @author P51
 */
/*
Địa chỉ email của các cán bộ, giảng viên PTIT được tạo ra bằng cách viết đầy đủ tên và ghép với các chữ cái đầu của họ và tên đệm. Nếu có nhiều người cùng email thì từ người thứ 2 sẽ thêm số thứ tự vào email đó.

Cho trước các xâu họ tên (có thể không chuẩn). Hãy tạo ra các địa email tương ứng. Chú ý, do lỗi soạn thảo nên có một số cái tên có thể xuất hiện nhiều hơn một lần. Danh sách thực tế không có ai trùng tên (sau khi chuẩn hoá) nên các cái tên bị trùng cần được loại ra và không cần tạo email cho cán bộ đó. 

Dữ liệu vào - file văn bản DANHSACH.in:

Mỗi dòng ghi một xâu họ tên (không quá 50 ký tự)
Không có số dòng nên cần đọc đến hết file
Kết quả: Ghi ra các email được tạo ra.

Ví dụ:

Input - DANHSACH.in



    nGUYEn    quaNG   vInH  

   tRan   thi THU    huOnG

   nGO   quoC  VINH

 lE            tuAn    aNH

NGO QUOC VINH

Tran THI THU huong
Output
vinhnq@ptit.edu.vn

huongttt@ptit.edu.vn

vinhnq2@ptit.edu.vn

anhlt@ptit.edu.vn
*/
import java.util.*;
import java.io.*;
public class ThietLapDiaChiEmail2 {
    public static void main(String[] args) throws IOException{
//        Scanner input = new Scanner(new File("src/file_container/thiet_lap_dia_chi_email2/DANHSACH.in"));
        Scanner input = new Scanner(new File("DANHSACH.in"));
        ArrayList<String> a = new ArrayList<>();
        ArrayList<String> c = new ArrayList<>();
        Map<String, Integer> mp = new HashMap<>();
//        HashSet<String> b = new HashSet<>();
        while (input.hasNextLine()) {
            String s = input.nextLine();
            a.add(s);
        }
        for (String x : a) {
            String s = normalizeName(x);
            if (!c.contains(s)) {
                c.add(s);
            }
        }
        for (String x : c) {
            String s = toEmailName(x);
            if (mp.containsKey(s)) {
                mp.put(s, mp.get(s) + 1);
                System.out.println(s + mp.get(s) +"@ptit.edu.vn");
            } else {
                mp.put(s, 1);
                System.out.println(s + "@ptit.edu.vn");
            }
            
        }
        
    }
    private static String normalizeName(String s) {
        StringBuilder res = new StringBuilder();
        String words[] = s.trim().toLowerCase().split("\\s+");
        for (String word : words) {
            res.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1)).append(" ");
        }
        return res.toString().trim();
    }
    private static String toEmailName(String s) {
        StringBuilder res = new StringBuilder();
        String words[] = s.trim().toLowerCase().split("\\s+");
        int n = words.length;
        res.append(words[n - 1]);
        for (int i = 0; i < n - 1; i++){ 
            res.append(words[i].charAt(0));
        }
        return res.toString().trim();
    }
}
