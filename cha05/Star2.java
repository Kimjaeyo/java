package chap05Test;

import java.util.Scanner;

public class Star2 {

	public static void main(String[] args) {
		Scanner stdin=new Scanner(System.in);
		System.out.println("input number: ");
		int num=stdin.nextInt();
		int i,j;
		
		for(i = 0; i < num; i++){
			for(j = num; j >i; j--) {
				System.out.print("*");
			}
			System.out.println(" ");
		}

	}

}
