/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package math.util;

import fu.util.MathUtility;

/**
 *
 * @author WIN 10
 */
public class MathUtil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Kỹ thuật test căn bản : nhìn bằng mắt để bik đúng sai 
        long expected = 120;
        long actual = MathUtility.getFactorial(5);
        //kì vọng 120 máy chạy 
        System.out.println("5! ? expected " + expected + ", actual: " + actual);
        System.out.println("0! ? expected : 1 , actual: " +MathUtility.getFactorial(0));
        System.out.println("6! ? expected : 720 , actual: " +MathUtility.getFactorial(6));
        
        //TH ngoại lệ
        MathUtility.getFactorial(-5);
    }
    
    //Nhược điểm:
    //CẦN phải dùng mắt để so sánh từng trường hợp : EXPECTED vs Actual
    //=> sẽ làm đau mắt thì dò => cách nâng cao : gom cả đóng test case này lại 
    //máy sẽ chạy giùm mình 
    //nếu tất cả đều đúng thì đưa ra 1 màu xanh 
    //nếu tất cả đều đúng ngoại trừ có 1 vài hàm sai 
    //Vì vậy nếu chỉ có ít nhất 1 TH sasi thì hàm sai 
    
    
    //Thay vì nhìn từng case ta chii3 cần nhìn màu xanh or đỏ là đủ =
    //vậy ta cần bộ thư viện để giúp ta rõ hơn đều này 
    //nếu khớp nó thảy ra màu xanh , nếu không khớp sẽ thảy ra màu đỏ 
    //BỘ THƯ VIỆN NÀY LÀ NHỮNG FILE .JAR, .DLL, ĐC APP THÊM VÀO PROJECT 
    //BỘ thư viện này mang cái tên chung co mọi ngôn ngữ lập trinh  - Unit Test 
    //Java : JUNIT, TestNG
    //C# :NUnit
    //PHP: PHPUnit
    //đưa code lên server

}
