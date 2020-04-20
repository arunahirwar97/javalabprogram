import java.util.Scanner;

public class leapyear {
	public static void main(String [] args) {	
	 Scanner ip= new Scanner(System.in);
  	System.out.print("Enter any year :");
  	int  a =ip.nextInt();
  	if(a%400==0 ||((a%4==0)&&(a%100!=0))){
  		System.out.print(a + " Is leap year ");
  		
  	}
  	else
  		System.out.print(a +" Is not leap year ");
  	
	}
}
