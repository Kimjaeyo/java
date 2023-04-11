/**
 * 숫자를 반복적으로 입력 받아서 정수의합이 1000이상 되면 1000을 넘는 수와 평균을 출력 
 */
package chapter05;

import java.util.Scanner;

public class BreakTest {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		
		int num;
		int i=0;
		int total = 0;
		while(true) {
			
			System.out.println("숫자를 입력하시오:");
			num = stdin.nextInt();
			total = total+num;
			i++;
			if(total>1000)
			break;
			 
		}
		System.out.println("1000을 넘는수는:"+num+"평균값은:"+(total/i));
		
	}

}
