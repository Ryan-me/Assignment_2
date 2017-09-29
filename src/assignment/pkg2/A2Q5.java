/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg2;

import java.util.Scanner;

/**
 *
 * @author messr2578
 */
public class A2Q5 {

    /**
     * @param args the command line arguments
     */
    public int binaryconvert(int n, int i, int[] array){
        // set the base case
        if(n == 0){
            // get rid of the primary 0
            i = i-1;
            //output the number in binary
            while(i >= 0){
            System.out.print(array[i]);
            i--;
            }
            // end the recoursion
            return 0;
        }
        // convert to binary
        int r = n%2;
        n = n/ 2;
        array[i]= r; 
        i++;
        // recoursion
        return binaryconvert(n,i,array);
    }
    
    public static void main(String[] args) {
        // get user to input a number and use the method to turn to binary
        Scanner in = new Scanner(System.in);
        System.out.println("enter a number to convert to binary");
        int t = in.nextInt();
        System.out.println("your number in binary is:");
        A2Q5 test = new A2Q5();
        int[] numb = new int[10];
        test.binaryconvert(t, 0, numb);
        
    }
}
