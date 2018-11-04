package HelloWorldPackage;
import java.io.PrintStream;

public class Hello {
	   public static void main(String[] args) {
		   printHelloWorld(System.out);
	   }
	   
	   static void printHelloWorld(PrintStream out) {
		   //out.println("Hello world!");
		   out.print("Hello world!\n");
	   }
}
