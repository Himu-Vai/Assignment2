
package assignment.pkg2;

import java.util.Scanner;


public class assignment26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i,n,multi=1;
        System.out.println("Enter the Number:");
        n=input.nextInt();
        for(i=1;i<=n;i++)
        {
        multi=multi*i;           
   }
        System.out.println("The Factorial of "+n+" is "+multi);
}

}
    

