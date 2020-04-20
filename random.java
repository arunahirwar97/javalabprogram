import java.lang.Math;
import java.util.Scanner;
public class random {
    public static void main(String [] args) {
    	 Scanner ip= new Scanner(System.in);
	     	System.out.print("Enter the num find Random  Number :");
	     	int  a =ip.nextInt();
	     	for(int i=0;i<a;i++ ) {
	     		System.out.print((int)(Math.random()*100));
	     		System.out.print("\n");
	     	}
    }
}
