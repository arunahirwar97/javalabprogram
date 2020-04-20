import java.util.Scanner;

public class tringle1 {
	 public static void main(String [] args) {
     	Scanner ip= new Scanner(System.in);
     	System.out.print("Enter the num find tringel :");
     	int a  =ip.nextInt();
     	for(int i=1;i<=a;i++ ) {
     		for(int j=0;j<i;j++) {
     			System.out.print("*");
     		}
     		System.out.print("\n");
     	}
	 }	
}
	 
