package chapter05;

public class WhileTest01 {

	public static void main(String[] args) {
		int sum=0, cnt=1;
		
		while(cnt<=10)
		{	
			sum=sum+cnt;
			cnt=cnt+1;
		}
		System.out.println("1~10합계:" +sum);
		int i, total=0;
		for(i = 0; i<=10; i++) 
		{
			total=total+i;
		}
		System.out.println(sum);
		int hap=0, j=1;
		
			do
		{	
			hap=sum+j;
			j=j+1;
		}while (cnt<=10);
			
			System.out.println("1~10 total(do~while):"+hap);
	}

}
