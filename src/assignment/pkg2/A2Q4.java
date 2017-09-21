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
public class A2Q4 {

    /**
     * @param args the command line arguments
     */
    public int hailstone(int stone){
        System.out.println(stone);
        // base case
        if(stone ==1){
            return 0;
        }
        int n = stone%10;
        if(n == 1||n == 3||n == 5||n == 7||n== 9){
           stone = 3*stone+1;
        }else if(n == 2||n == 4||n == 6||n == 8||n== 0){
            stone = stone/2;
        }
        return hailstone(stone);
    }
    public static void main(String[] args) {
        A2Q4 test = new A2Q4();
        Scanner in = new Scanner(System.in);
        System.out.println("enter a number ");
        int t = in.nextInt();
        int end =test.hailstone(t);
    }
}
