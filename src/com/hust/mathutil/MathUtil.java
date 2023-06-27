/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hust.mathutil;

/**
 *
 * @author thai phan
 */
// Ta viết cái class để cung cấp tiện ích cho nơi khác xài
// hàm static giúp làm điều này
public class MathUtil {
    // n! = 1.2.3.4....n
    // 0! = 1! = 1
    //20! là vừa khớp kiểu Long 
    // 21! lố kiểu long 
    // n >= 21 or n < 0 bắn ra ngoại lệ
    public static long getFactorial(int n) {
        long result = 1;
        if(n == 0 || n == 1)
            return 1;
        else if( n >= 21 || n < 0)
            throw new IllegalArgumentException("Invalid agrument. n must be");
        else
            //long result = 1;
            //return getFactorial(n)*n; dùng đệ quy
            for(int i = 2; i <= n; i++)
                result = result*i;
            
        return result;
    }
    
}
