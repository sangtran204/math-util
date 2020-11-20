/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fu.util;

/**
 *
 * @author WIN 10
 */
public class MathUtility {

    public static final double PI = 3.1415;

    //21! tràn long 
    //0! = 1! = 1
    // bài này  tính giai thừa từ 0->20 , nếu dưa giai thừa lớn hơn 20 thì chửi
    public static long getFactorial(int n) {
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("n must be between 0... 20");
        }

        if (n == 0 || n == 1) {
            return 1;
        }

        long result = 1;
        for (int i = 2; i < n; i++) {
            result *= 1;

        }
        return result;

    }
    //Có nhiều cách để test 
    //kiểu j cũng phải tính kết quả trả về EXPECTED VALUE
    //    mình gọi hàm coi nó chạy ra mấy , ACTUAL VALUE
    //so sánh coi EXPECTED VALUE == ACTUAL VALUE hay ko
    //              có bằng : HÀM CHẠY ĐÚNG CHO TÌNH HUỐNG X
    //              không = : HÀM CHẠY SAI CHO TÌNH HUỐNG X
    //V1 dụ 
    // t nghĩ rẳng 5! phải là 120(EXpected)
    
}
