/**
 * 2023.04.04
 * 김재윤
 * 두 숫자를 입력 받아서 두 수 사이의 합계 출력 하기
 */
package chapter05;

import java.util.Scanner;

public class TestEX05 {

	public static void main(String[] args) {
		System.out.println("두 숫자 입력:");
		Scanner stdin = new Scanner(System.in);
		int first = stdin.nextInt();
		int second = stdin.nextInt();
		
		int i,j;
		int temp = 0;
		
		if(first>second) 
		{
			
			for(i = second+1; i < first; i++) 
			{
				temp = temp + i;
				
			}
		}
		else 
		{
			for(j = first+1; j < second; j++) 
			{
				temp = temp + j;
			}
		}
			System.out.println(temp);
		}
		
		
		
	}


