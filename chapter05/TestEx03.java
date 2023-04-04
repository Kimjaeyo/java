/**
 * 1~1000까지 정수 중에서 사용자가 입력한 숫자의 배수만을 더하여 출력하는 프로그램 for로 작성
 */
package chapter05;
import java.util.Scanner;
public class TestEx03 {

	public static void main(String[] args) {
		System.out.println("숫자 입력:");
		Scanner stdin = new Scanner(System.in);
		int sum = stdin.nextInt();
		
		int total=0;
		int i;
		
		for(i = 0; i < 1001; i++) {
			if(i%sum==0) {
				total = total+i;
				System.out.println(i);
			}
		}
		System.out.println(total);
	}

}
