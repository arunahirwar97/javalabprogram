import java.util.Scanner;
public class harmo {
        public static void main(String [] args) {
        	Scanner ip= new Scanner(System.in);
        	System.out.print("Enter the number find the harmonic Series :");
        	float a = ip.nextFloat(); 
        	 double result = 0.0;
    		 while(a > 0){
    		 result = result + (double) 1 / a;
    		 a--;
    		 }
    		 System.out.println("Output of Harmonic Series is "+result);

        }
}
