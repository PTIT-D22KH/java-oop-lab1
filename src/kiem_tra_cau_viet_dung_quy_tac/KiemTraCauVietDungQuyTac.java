/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kiem_tra_cau_viet_dung_quy_tac;

/**
 *
 * @author P51
 */
/*
Cho một câu văn bản kết thúc với dấu chấm, trong đó chỉ có các chữ cái Tiếng Anh và các dấu ngoặc kiểu ngoặc đơn (,) hoặc ngoặc vuông [,].

Nếu chỉ xét các cặp dấu ngoặc, bạn hãy kiểm tra xem câu văn bản trên có viết đúng quy tắc hay không. Tức là các cặp dấu ngoặc đều viết  mở và đóng đẩy đủ, đúng thứ tự.

Input

Dòng đầu ghi số bộ test (không quá 4000). Mỗi test viết trên một dòng câu văn bản có độ dài không quá 100, luôn kết thúc bởi dấu chấm.

Output

Ghi ra YES hoặc NO tùy thuộc kết quả kiểm tra.

Ví dụ

Input

Output

3

[ graph ] ( binary tree ).

Dynamic programming )( devide and conquer.

([ (([( [ ] ) ( ) (( ))] )) ]).

YES

NO

YES
*/
import java.util.*;
public class KiemTraCauVietDungQuyTac {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = Integer.parseInt(input.nextLine());
        while (t-- > 0) {
            String s = input.nextLine();
            StringBuilder temp = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '[' || s.charAt(i) == '(' || s.charAt(i) == ']' || s.charAt(i) == ')') {
                    temp.append(s.charAt(i));
                }
            }
            if (check(temp.toString())) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
    private static boolean check(String s) {
//        System.out.println(s);
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (isOpen(s.charAt(i))) {
                st.push(s.charAt(i));
            } else {
                if (st.empty() || !isMatch(s.charAt(i),st.peek())) {
                    return false;
                } else {
                    st.pop();
                }
            }
//            Stack<Character> temp = (Stack<Character>) st.clone();
//            while (!temp.empty()) {
//                System.out.println(temp.peek());
//                temp.pop();
//            }
            
        }
        if (!st.empty()) {
            return false;
        }
        return true;
    }
    private static boolean isMatch(char a, char b) {
//        System.out.println(a);
//        System.out.println(b);
        return ((a == ']' && b == '[') || (a == ')' && b == '('));
    }
    private static boolean isOpen(char c) {
        return (c == '[' || c == '(');
    }
}
