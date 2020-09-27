
package assignment.pkg2;


public class Assignment25 {
    public static void main(String[] args) {
        int i,n=10,f=0,j=1,sum=0;
        for(i=0;i<n;i++)
        {
        sum=f+j;
        f=j;
        j=sum;
        System.out.println(f);            
   }

    }
    
}
