
package assignment.pkg2;


public class Assignment21 {
    public static void main(String[] args) {
        int i, j,k,n=5; 
        for(i=n; i>=1; i--) 
        {
            for (k=0;k<n-i;k++) 
            {
                System.out.print(" "); 
            } 
            for(j=1; j<=i; j++) 
            { 
                System.out.print("* "); 
            } 
            System.out.println(); 
        } 
   }

}
    

