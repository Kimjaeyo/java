
package chapter05;


import java.util.Scanner;

public class JavaPractice2 {

	public static void main(String[] args) {
		System.out.println("숫자 입력:");
		Scanner stdin = new Scanner(System.in);
		
		int num = stdin.nextInt();
		
		int i;
		int sum=0;
		
		for(i=1; i<101; i++) 
		{
			if(i%num==0)
			{
				sum = sum + i;
				System.out.println(i);
			}
				
		}
			System.out.println("1부터 100까지의 배수의 합은:"+sum);
		
	}

}
