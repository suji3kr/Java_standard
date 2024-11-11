package ch02.sec01.exam01;

import java.util.Scanner;

public class Calculator3 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수 i 입력: ");
		int i = scanner.nextInt();
				
		System.out.println();
		System.out.print("정수 j 입력: ");
		int j = scanner.nextInt();		
 		
		System.out.println(i + " + "+ j+ " = " + add(i,j));
		System.out.println(i + " - "+ j+ " = " + sub(i,j));
		System.out.println(i + " * "+ j+ " = " + mul(i,j));
		
		System.out.println(i + " / "+ j+ " = " + div(i,j));
		System.out.println(i + " % "+ j+ " = " + mod(i,j));
	
	}
	public static int add(int a, int b) {
		return a + b;
			
	}
	public static int sub(int a, int b) {
		return a - b;
			
	}
	public static int mul(int a, int b) {
		return a * b;
			
	}
	public static int div(int a, int b) {
		if (b == 0 ) {
			System.out.println("두번째 값이 0 이라 나눌 수 없습니다.");
			return 0;
		}else {
			return a * b;
		}	
	}
	
	public static int mod(int a, int b) {
		if (b == 0 ) {
			System.out.println("두번째 값이 0 이라 나머지를 구할 수 없습니다.");
			return a;
		}else {
			return a % b;
		}	
	}
}
