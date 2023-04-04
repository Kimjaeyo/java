/**
 * 입력받은 단의 구구단 출력하기
 */
package chapter05;

import java.util.Scanner;

public class GugudanTest01 {

	public static void main(String[] args) {
		
		System.out.println("단을 입력하시오:");
		Scanner stdin = new Scanner(System.in);
		int dan = stdin.nextInt();
		
		for(int i = 0; i <= 9; i++) {
			System.out.println(dan + "*" + i + "=" +(dan*i));
		}
		
	}

}
