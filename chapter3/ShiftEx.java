package chapter3;
import java.util.Scanner;
public class ShiftEx {

	public static void main(String[] args) {
		Scanner stdin=new Scanner(System.in);
		System.out.println("Enter two numbers;");
		int a=stdin.nextInt();
		int b=stdin.nextInt();
		
		System.out.println("a="+a+"("+Integer.toBinaryString(a)+")");
		System.out.println("b="+b+"("+Integer.toBinaryString(b)+")");
		
		System.out.println("a<<2="+a+"("+Integer.toBinaryString(a<<2)+")");
		System.out.println("a>>2="+a+"("+Integer.toBinaryString(a>>2)+")");
		
		System.out.println("b<<2="+b+"("+Integer.toBinaryString(b<<2)+")");
		System.out.println("b>>2="+b+"("+Integer.toBinaryString(b>>2)+")");
	}

}
