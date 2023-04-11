/**
 * 숫자를 반복적으로 입력 받아서 정수의합이 1000이상 되면 1000을 넘는 수와 평균을 출력 
 */
package chapter05;

import java.util.Scanner;

public class JavaPractice {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		
		int num;
		int total = 0;
		int i = 0;
		
		while(true) {
			System.out.println("숫자 입력:");
			num = stdin.nextInt();
			total = total+num;
			i++;
			if(total>1000)
			break;
		}
		System.out.println("1000을 넘은 숫자는:" + num + " 1000을 넘긴 평균값은:"+(total/i));
	}

}

