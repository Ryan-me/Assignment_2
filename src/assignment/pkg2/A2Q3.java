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
public class A2Q3 {

    /**
     * @param args the command line arguments
     */
    public static int triangle(int tri, int n){
        if (tri == 0){
            return n;
        }
        n = n + tri;
        tri = tri - 1;
        return triangle(tri,n);
        
    }
    public static void main(String[] args) {
        A2Q3 test = new A2Q3();
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number of rows in the triangle");
        int t = in.nextInt();
        int end =test.triangle(t,0);
        System.out.println("the numbher of blocks in the triangle is "+end);
    }
}
