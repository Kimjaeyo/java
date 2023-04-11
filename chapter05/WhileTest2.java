/**
 * 2023-04-04
 * 김재윤
 * 입력받은 숫자의 팩토리얼 구하기
 * #문제분석
 * -변수 : fac, facvalue
 * #알고리즘
 * 1. 입력받을 값
 * 2. 반복
	while(fac>1)
	{
	fac을 1씩 감소하면서 곱하기
 */
package chapter05;

import java.util.Scanner;

public class WhileTest2 {

	public static void main(String[] args) {
		System.out.println("숫자를 입력하시오:");
		Scanner stdin = new Scanner(System.in);
		
		int fac = stdin.nextInt();
		int facvalue=fac;
		
		while(fac>1) 
		{
			System.out.print(fac +"*" );
			facvalue = facvalue*--fac;
			
		}
		System.out.println("1="+facvalue);
	}

}
