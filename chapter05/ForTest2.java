package chapter05;

import java.util.Scanner;

public class ForTest2 {

	public static void main(String[] args) {
		System.out.println("숫자를 입력하시오:");
		Scanner stdin = new Scanner(System.in);
		
		int num = stdin.nextInt();
		int i,j;
		
		
			for(i=1; i<=num; i++) 
			{
			
				System.out.print("*");
			
			}
				for(i=1; i<=num; i++)
				{
					System.out.print("*");		
				}
			
	}
	
}