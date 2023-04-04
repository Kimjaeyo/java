/**
 * 2023.03.28[화]
 * 김재윤
 * 조건문 연습
 */
package chapter4;
import java.util.Scanner;

public class SimpleTest01 {

	public static void main(String[] args) {
		Scanner stdin=new Scanner(System.in);
		System.out.println("input score:");
		int grade=stdin.nextInt();
		
		if(grade>=90)
			{
			System.out.println("합격");
			System.out.println("congraturation");
			System.out.print("thank you");
			}
		else
			System.out.println("non pass");
	}

}
