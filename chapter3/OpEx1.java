/**
 * 동전 교환 프로그램
 * 입력된 액수만큼 500원, 100원, 50원,10원짜리 동전으로
 * 교환해 주는 프로그램 작성
 * 조건1:동전의 총개수를 최소화
 * 조건2:고액의 동전 우선 교환
 */

package chapter3;

import java.util.Scanner;

public class OpEx1 {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.println("액수를 입력해주세용:");
		
		int a=stdin.nextInt();
		int money=a%500;
		
		
		System.out.println("500원짜리 동전:"+a/500+"개");
		System.out.println("100원짜리 동전:"+money/100+"개");
		money = money%100;
		System.out.println("50원짜리 동전:"+money/50+"개");
		money = money%50;
		System.out.println("10원짜리 동전:"+money/10+"개");

		
	}

}
