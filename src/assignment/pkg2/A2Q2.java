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
public class A2Q2 {

    /**
     * @param args the command line arguments
     */
     public int digitalsum(int n, int sum){
        // do stuff(math)
        sum= sum +n%10;
        int l = n/10;
        // set the base case
        if(l == 0&& n <=10){
            return sum;
        }
        // use the loop in the loop(aka recousion)
        return digitalsum(l,sum);
        
    }
     public int digitalroot(int r, int add){
         add = add+r%10;
         r = r/10;
         //set the base case
         if( r == 0 && add<10){
             return add;
         }
         return digitalroot(r,add);
     }
    public static void main(String[] args) {
        // TODO code application logic here
        A2Q2 test = new A2Q2();
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number");
        int g = in.nextInt();
        int d =test.digitalsum(g, 0);
        int r = test.digitalroot(d, 0);
        System.out.println("the root of the numbers is "+ r);
        }
}