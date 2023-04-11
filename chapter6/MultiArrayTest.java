package chapter6;

import java.util.Random;

public class MultiArrayTest {

	public static void main(String[] args) {
		Random ran=new Random();
		int[][] score=new int[4][4];
		
		for(int i=0;i<4;i++)//행
			for(int j=0;j<4;j++)//열
				score[i][j]=ran.nextInt(10); //0~9까지 난수 발생~
		
		for(int k=0;k<4;k++) {
			int sum=0;
			for(int value:score[k]) {
				System.out.println(value+" ");
				sum=sum + value;
			}
		
		System.out.println("sum is " + sum + "\n");
		}
	}

}
