import java.util.Scanner;

public class evenoddravi {
	public static void main(String [] args) {
		 Scanner ip= new Scanner(System.in);
		  	System.out.print("Enter the num find even or odd  :");
		  	float  a =ip.nextFloat();
		  	if(a%2==0) {
		  		System.out.print(a + " is even num ");
		  	}
		  	else
		  		System.out.print(a + " is  not even num");
	}
}
