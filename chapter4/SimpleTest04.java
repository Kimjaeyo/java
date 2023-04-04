/**
 * 
 * 
 * 직급과 나이를 입력 받아서 직급이 7 또는 8이고 나이가 40대이면 "연금 80%"
 * 직급이 5 또는 6이고 나이가 50대이면 "연금 100%"
 * 그 외의 경우는 "연금 대상자 아님"
 * 을 출력하는 프로그램
 */
package chapter4;

import java.util.Scanner;

public class SimpleTest04 {

	public static void main(String[] args) {
		
		System.out.println("직급과 나이 입력:");
		Scanner stdin = new Scanner(System.in);
		int level = stdin.nextInt();
		int age = stdin.nextInt();
		
		if(level > 6 && level < 9 && age > 40)
			System.out.println("연금 80%");
		else if(level > 4 && level < 7 && age > 50 && age < 60)
			System.out.println("연금 100");
		else
			System.out.println("연금 대상자 아님");
		
		
	}

}
