import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;
public class arun1{
 public static void main(String [] args) throws IOException {
	 FileReader f = null;
	 int c; 
	 try {
		 f = new FileReader("Arun.txt");
	 }
	 catch (FileNotFoundException fe) 
	 {
		    System.out.print("File Does not found");	 
	 }
	 while ((c=f.read())!=-1) 
         System.out.print((char)c); 
	 f.close();
 }
}
