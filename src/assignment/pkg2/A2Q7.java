/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg2;

import java.util.Scanner;

/**
 *
 * @author Messr2578
 */
public class A2Q7 {

    /**
     * @param args the command line arguments
     */
    public boolean isPalindrome(String pal , int length, int begin, boolean che){
        if(length == 0 ){
            return che;
        }
        // create the letters separately
        String beg = pal.substring(begin,begin+1);
        String end = pal.substring(length-1,length);
        // compare the letters
        if(beg.equals(end)){
            che = true;
        }
        if (!beg.equals(end)){
            return false;
        }
        // change the number next time
        begin++;
        length--;
        // recoursion
        return isPalindrome(pal,length,begin, che);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        System.out.println("enter a possible palendrome");
        String pal = in.nextLine();
        A2Q7 test = new A2Q7();
        //test.isPalindrome(pal, pal.length(),0);
        System.out.println(test.isPalindrome(pal, pal.length(),0, true));
    }
}
