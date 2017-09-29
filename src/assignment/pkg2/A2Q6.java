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
public class A2Q6 {

    /**
     * @param args the command line arguments
     */
    
    public int convert(int n, int b, int[] array, int i){
        // base case
        if(n == 0){
            // get rid of the primary 0
            System.out.println("");
            i = i-1;
            //output the number in the specified base 
            while(i >= 0){
                // if the number is over 10 convert to letter
                if(array[i] >= 10){
                    if(array[i] == 10){
                        System.out.print("A");
            }       if(array[i] == 11){
                        System.out.print("B");
            }       if(array[i] == 12){
                        System.out.print("C");
            }       if(array[i] == 13){
                        System.out.print("D");
            }       if(array[i] == 14){
                        System.out.print("E");
            }       if(array[i] == 15){
                        System.out.print("f");
            }
            }else{
            System.out.print(array[i]);
            }
            i--;
        }
            // end the recoursion
            return 0;
    }
        // convert to base
        int r = n%b;
        System.out.print(r);
        n = n/b;
        array[i] = r;
        i++;
        //recoursive
        return convert(n,b, array, i);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        System.out.println("enter a number");
        int n = in.nextInt();
        System.out.println("enter a base");
        int b = in.nextInt();
        System.out.println("your number in base "+b+" is:");
        A2Q6 test = new A2Q6();
        int[] numb = new int[1000];
        test.convert(n, b, numb, 0);
    }
}
