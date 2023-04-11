/**
 * 1~100까지의 숫자 중에서 사용자로부터 입력 받은 숫자의 배수의 합을 구하라.
 */
package chapter05;

import java.util.Scanner;

public class ContinueTest {

	public static void main(String[] args) {
		
		System.out.println("숫자를 입력하시오:");
		Scanner stdin = new Scanner(System.in);
		
		int num = stdin.nextInt();
		
		int i;
		int sum=0;
		
		
		for(i=1; i<101; i++) {
			
			if(i%num==0) 
			{
				System.out.println(i);
				sum=sum+i;
				
			}	
			
		}
			System.out.println(sum);
	}

}
