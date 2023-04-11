package chapter6;

import java.util.Scanner;

public class ArrayTest3 {

	public static void main(String[] args) {
		int inum[]= {8,7,3,6,8,7,0,4,1,2};
		Scanner stdin=new Scanner(System.in);
 		System.out.println("input number: ");
		int key =stdin.nextInt();
		int cnt=0; //동일한 데이터의 갯수
		
		for(int i=0;i<inum.length;i++)
		{
			if(key==inum[i]) {
				cnt++;
				System.out.println((i+1)+" match");
			}
		}
		if (cnt==0)
			System.out.println(key+ "not match");
		else
			System.out.println(key+ "is" + cnt);
		
	}

}
