
import java.util.Scanner;
public class overloadig {
static int plus(int x,int y) {
	return x+y;
}
	static double plus(double x,double y) {
		return x+y;
	}
	
public static void main(String[] args) {
	Scanner ip = new Scanner(System.in);
	System.out.print("Integeger value ");
	int c = ip.nextInt();
	int d = ip.nextInt();
    System.out.print("Doule value : ");
    double e = ip.nextDouble();
    double f = ip.nextDouble();	 
	int a = plus(c,d);
	double s = plus(e,f);
	System.out.print("int value is :" + a+"\ndouble value is :"+s);
	
		
}
		
		
}
