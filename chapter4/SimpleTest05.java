/**
 * 두 개의 숫자를 입력 받아서 두 숫자 사이의 홀수값을 모두 더해서 출력하기
 */
package chapter4;

import java.util.Scanner;

public class SimpleTest05 {

	public static void main(String[] args) {
	
		System.out.println("두 개의 숫자 입력:");
		Scanner stdin = new Scanner(System.in);
		int hol1 = stdin.nextInt();
		int hol2 = stdin.nextInt();
		
		int i = 0;
		int total=0;
		
		if(hol1>hol2) {
			for(i= hol2+1; i < hol1; i++) 
			{
				if(i % 2 != 0)
					total = total + i;
			}
			System.out.println(total);
		}
		else {
			for(i= hol1+1; i < hol2; i++) 
			{
				if(i % 2 != 0)
					total = total + i;
			}
			System.out.println(total);
		}
		
		
		
		
	}

}
