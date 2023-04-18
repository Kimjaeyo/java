package chap05Test;

import java.util.Scanner;

public class Star3 {

	public static void main(String[] args) {
		Scanner stdin=new Scanner(System.in);
		System.out.print("input number: ");
		int num=stdin.nextInt();
		int i,j,h;
		
		for(i = 1; i <= num; i++){
			for(h = num; h > i; h--) {
				System.out.print(" ");
			}
			for(j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		

	}

}
