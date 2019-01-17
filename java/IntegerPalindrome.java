/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integerpalindrome;

import java.util.Scanner;

/**
 *
 * @author Vinoth
 */
public class IntegerPalindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int primary = input;
        int reverse = 0;

        while (input > 0) {
            int temp = input % 10;
            reverse = (reverse * 10) + temp;
            input = input / 10;
        }
        
        if(primary==reverse){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }

}
