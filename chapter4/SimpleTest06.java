package chapter4;

import java.util.Scanner;

public class SimpleTest06 {

	public static void main(String[] args) {
		
		System.out.println("숫자 입력:");
		Scanner stdin = new Scanner(System.in);
		int a = stdin.nextInt();
		
		
		if(a > 0)
			System.out.println("양수입니다");
		else if(a < 0)
			System.out.println("음수입니다");
		else
			System.out.println("0입니다");
	}

}
