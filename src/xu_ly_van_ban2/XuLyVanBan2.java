/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xu_ly_van_ban2;

/**
 *
 * @author P51
 */
/*
Cho file văn bản VANBAN.in gồm không quá 1000 dòng, mỗi dòng không quá 200 ký tự. Một “từ” trong file văn bản được định nghĩa là một dãy liên tiếp các ký tự không chứ khoảng trống hoặc dấu tab, dấu xuống dòng.

Hãy lọc ra các “từ” có chứa ký tự số và không chứa các dấu câu (gồm dấu chấm (.), dấu phẩy(,), dấu chấm than (!), dấu chấm hỏi (?), dấu hai chấm (:).

(Chú ý chỉ xét các dấu câu liệt kê ở trên).

In danh sách các từ thoả mãn theo thứ tự từ điển.

Input

File văn bản VANBAN.in gồm không quá 1000 dòng, mỗi dòng không quá 200 ký tự

Output

Ghi ra các từ thoả mãn, mỗi từ trên một dòng, theo thứ tự từ điển.

Ví dụ

Input


PTIT duy tri hoc phi nam 2019 va khong tang hoc phi

trong nam 2020, 2021 va 2021 den 2022.

PTIT da trich 6 ty d0ong ho tro moi si1nh vien 500000!
Output

2019

2021

6

d0ong

si1nh
*/
import java.util.*;
import java.io.*;
public class XuLyVanBan2 {
    public static void main(String[] args) throws IOException{
//        Scanner input = new Scanner(new File("src/file_container/xu_ly_van_ban2/VANBAN.in"));
        Scanner input = new Scanner(new File("VANBAN.in"));
        
        ArrayList<String> res = new ArrayList<>();
        while(input.hasNextLine()) {
            String s = input.nextLine();
            String a[] = s.split("[\\s\\t\\n]+");
        
            for (String x : a) {
                if (check(x) && !res.contains(x)) {
                    res.add(x);
                }
            } 
        }
        Collections.sort(res);
        for (String x : res) {
            System.out.println(x);
        }
    }
    private static boolean check(String x) {
        boolean ok = false;
        for (int i = 0; i < x.length(); i++) {
            if (x.charAt(i) == '.' || x.charAt(i) == ',' || x.charAt(i) == '!' || x.charAt(i) == '?' || x.charAt(i) == ':') {
                return false;
            } 
            if (Character.isDigit(x.charAt(i ))) {
                ok = true;
            }
            
        }
        return ok;
    }
}
