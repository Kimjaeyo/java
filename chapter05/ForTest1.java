/**
 * 2023-04-04
 * 김재윤
 * 입력받은 숫자의 약수를 모두 출력하시오.
 * #문제분석
 * -변수:num,i
 * #알고리즘
 * 1.
 * 2.
 * 3.
 */
package chapter05;

import java.util.Scanner;

public class ForTest1 {

	public static void main(String[] args) {
		
		System.out.println("숫자를 입력하시오:");
		Scanner stdin = new Scanner(System.in);
		
		int num = stdin.nextInt();
		int i;
		
		for(i=1; i<=num; i++)
		{
			if(num%i==0)
			{
				System.out.print(i+ " ");
			}
		}
	}

}
