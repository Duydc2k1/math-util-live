/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fu.mathutil;

import java.util.Scanner;

/**
 *
 * @author ACER
 */

// ta viet class để cung cấp tiện ích cho nơi khác xài
// khi ta cung cấp tiện ích cho nơi khác xài
// đó là lúc ta không cần nhớ cái gì cho riêng ta
// hàm static sẽ làm điều này 

public class MathUtil {
    private static Scanner sc = new Scanner(System.in);
    
    // n! = 1.2.3.4.5.6...n
    // 20! vừa khớp 18 số 0 => 21! > long
    // nếu đưa vào âm hay 21! => error (Exception) 
    public static long getFactorial(int n){
        
        if(n < 0 || n > 20)
             throw new IllegalArgumentException("Invalid agrument. n must be between 0 and 20");
        // stop 
        
        if(n == 0 || n == 1)
            return 1;
        
        // for hoặc recursion 
        
        long temp = 1;
        
        for (int i = 2; i <= n ; i++) 
             temp *= i;
             
        return temp;
          
        // if expected = actually => good
        
        
        
    }
    
}
