package chapter3;

public class Typeinteger {

	public static void main(String[] args) {
		int var1=0b1011; //2진수
		int var2=0xB3; //16진수
		int var3=356; //10진수
		
		byte var4=-128; //byte 정수
		//byte var5=128; //컴파일 에러
		
		long var6=10000000000L; // 정수 리터럴 INT타입의 허용 범위 넘는 경우 'L'붙이기
		//long var7=10000000000; 컴파일 에러
		
		char c1='A';
		char c2=65;
		char c3='\u0041';
		
		String name="mklee"; //문자열
		String str1="i like \"java\"";
		String str2="number\tname\tage";
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
		System.out.println(var6);
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(name);
		System.out.println(str1);
		System.out.println(str2);
		
	}

}
