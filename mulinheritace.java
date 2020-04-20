import java.util.Scanner;

class v {
	       ru {int x;
	           int y;
		       void add(){
		                    return (x+y);}
		       void sub()
		       {
		    	   return (x-y);
		       }
		       
}


public class mulinheritace {
    v r = new v();
	Scanner ip= new Scanner(System.in);
	float a = ip.nextFloat();
	float b  = ip.nextFloat();
  z = r.add(a,b);
  d = r.sub(a,b);
	System.out.println("Addition is "+z + "Sutraction = " + d);
}
}