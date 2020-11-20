/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sang.util.test;

import static fu.util.MathUtility.*;
//chỉ có từ JDK 3, chỉ dành cho statis
//tức là chỉ chơi trò import static, thì mọi hàm static trong class này
//khi gọi thì ko cần têc class chấm, gọi như C, vì hiểu ngầm đã chấm rồi 

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author WIN 10
 */
public class MathUtilityTest {
    // class này class xài bộ thư viện JUnit để test code
    public MathUtilityTest() {
    }
    //Đảm bảo hàm chạy đúng mọi CASE, Trường hợp
    @Test
    //Muốn chạy thì nhấn SHIFT - F6
    //Quy tắc đặt tên của nghề Tester, QC
    public void getFactorial_RunsWell_IfValidArgument(){
//        assertEquals(120, getFactorial(5));
        
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void getFactorial_ThrowsException_IfInvalidAArgument(){
        // ngoại lệ ko phải là value để assert()
        //chỉ có thể chụp nó lại
        getFactorial(-5);
    }
     
    
}
