import java.io.*;
import java.util.*;
import java.math.*;
public class Diag_Diff {

    public static void main(String[] args) {
        int sum1=0,sum2=0,fd= 0;
        Scanner in = new Scanner(System.in);
		System.out.println("Enter number of rows in the square matrix");
        int n = in.nextInt();
        int a[][] = new int[n][n];
		System.out.println("Enter elements");
        for(int i=0; i < n; i++){
            for(int j=0; j < n; j++){
                a[i][j] = in.nextInt();				
            }
        }
    	for (int i = 0, j =0; i< n && j < n; i++, j++) {
                  sum1= sum1 + a[i][j];
                  
           }
       for (int i=0,j=n-1 ; i<n && j>=0 ; i++, j--) {
                  sum2= sum2 + a[i][j];
                  
           }	 
        
     fd=Math.abs(sum1-sum2);
     System.out.println(fd);
    }
}
