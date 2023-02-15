
package Question1;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter length of each side of triangle: ");
        int len1 = input.nextInt();
        int len2 = input.nextInt();
        int len3 = input.nextInt();
        
        if(len1 >= (len2+len3) || len3 >= (len2+len1) || len2 >= (len1+len3) )
            System.out.println( "Invalid triangle");
        else if(len1==len2 && len2==len3)
            System.out.println( "Equilateral Triangle");
        else if (((len1 * len1) + (len2 * len2)) == (len3 * len3) || ((len1 * len1) + (len3 * len3)) == (len2 * len2) || ((len3 * len3) + (len2 * len2)) == (len1 * len1))
            System.out.println( "Right Triangle");
        else if(len1!=len2 && len2!=len3 && len3!=len1)
            System.out.println( "Scalene Triangle" );
        else if ((len1==len2 && len2!=len3 ) || (len1!=len2 && len3==len1) || (len3==len2 && len3!=len1))
            System.out.println( "Isosceles Triangle");
        }
    }
