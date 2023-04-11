package chapter05;

import java.util.Scanner;

public class Practice3 {

	public static void main(String[] args) {
		
		System.out.println("숫자 입력:");
		Scanner stdin = new Scanner(System.in);
		
		int star = stdin.nextInt();
		int i,j;
	
		for(i=1; i<10; i++) {
			for(j=1; j<i; j++)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}
		
	}

}
