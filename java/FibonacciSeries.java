/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacciseries;

import java.util.Calendar;

/**
 *
 * @author Vinoth
 */
public class FibonacciSeries {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int oldVal=0, newVal=1, inputFromUser = 10;
        System.out.println(oldVal+" \n"+newVal);
       for(int i=0;i<inputFromUser;i++){
           int temp = newVal;
           newVal = oldVal+newVal;
           oldVal = temp;
           System.out.println(newVal);
       }
    }

}
