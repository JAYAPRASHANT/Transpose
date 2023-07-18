package Transpose;
import java.util.Arrays;
import java.util.Scanner;
public class Transpose {
	public static int[][] Trans(int[][] a,int n) {
		int temp=0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i<j) {
			
				temp=a[i][j];
				a[i][j]=a[j][i];
				a[j][i]=temp;
			}
			}
		}
		return a;
	}


      public static void main(String[] args) {
    	  Scanner sc=new Scanner(System.in);
          int n=sc.nextInt();
          int[][] a=new int[n][n];
          for(int i=0;i<n;i++) {
          	for(int j=0;j<n;j++) {
          		a[i][j]=sc.nextInt();
          	}
          }
          int res[][]=Trans(a,n);
          for(int []ress:res) {
        	  System.out.println(Arrays.toString(ress));
          }
      }
}
          
        
