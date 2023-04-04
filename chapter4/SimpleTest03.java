package chapter4;

import java.util.Scanner;
public class SimpleTest03 {

	public static void main(String[] args) {
		
		
		
		
		while(true) {
			
			
			Scanner stdin = new Scanner(System.in);
			System.out.println("input score:");
			int grade = stdin.nextInt();
			
			
			
		switch(grade/10)
		{
			case 9:
				System.out.println("a");
				break;
			case 8:
				System.out.println("b");
				break;
			case 7:
				System.out.println("c");
				break;
			case 6:
				System.out.println("d");
				break;
			default:
				System.out.println("F");
				
		}
		System.out.println("계속할래예?y/n:");
		Scanner sf = new Scanner(System.in);
		char eruf = sf.next().charAt(0);
		
		if(eruf == 'y')
			continue;
		else
			break;
		}
	}

}
