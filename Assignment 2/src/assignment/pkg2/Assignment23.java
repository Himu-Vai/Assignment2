
package assignment.pkg2;


public class Assignment23 {
    public static void main(String[] args) {
        
    
    int i, j,k,n=5; 
        for(i=1; i<=n; i++) 
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
        for(i=n-1; i>=1; i--) 
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

