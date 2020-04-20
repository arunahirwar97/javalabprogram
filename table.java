import java.util.Scanner;

public class table {
     public static void main (String[] args) {
    	 Scanner ip= new Scanner(System.in);
    	 System.out.print("Enter the num find table :" );
 	  	int  p =ip.nextInt();
 	  	for(int i=1;i<=10;i++) {
 	  		System.out.print(i*p);
 	  		System.out.print("\n");
 	  	}
 	  	
}
}
