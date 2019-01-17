/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindrome;

import java.util.Scanner;

/**
 *
 * @author Vinoth
 */
public class Palindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        int len = input.length();
        char[] ch = input.toCharArray();
        String result = "";
        for (int i = len - 1; i >= 0; i--) {
            result += ch[i];
        }
        if (input.equalsIgnoreCase(result)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }

}
