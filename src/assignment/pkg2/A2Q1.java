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
public class A2Q1 {

    /**
     * @param args the command line arguments
     */
    public int digitalSum(int n, int sum){
        // do stuff(math)
        sum= sum +n%10;
        int l = n/10;
        // set the base case
        if(l == 0){
            return sum;
        }
        // use the loop in the loop(aka recousion)
        return digitalSum(l,sum);
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
        A2Q1 test = new A2Q1();
        Scanner in = new Scanner(System.in);
        System.out.println("enter a number");
        int g = in.nextInt();
        int d =test.digitalSum(g, 0);
        System.out.println("the sum of the numbers is " + d);
        }
}
    
