import java.util.Scanner;

public class interest {
	public static void main (String [] args) {
		 Scanner ip= new Scanner(System.in);
		  	float  p =ip.nextFloat();
		 	float  r =ip.nextFloat();
		 	float  t =ip.nextFloat();
		 	float i;
		 	i = (p*r*t)/100;
		 	System.out.print("Interest is : "+ i);
	}
}
