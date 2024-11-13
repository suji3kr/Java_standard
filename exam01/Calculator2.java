package ch02.sec01.exam01;

import java.util.Scanner;

public class Calculator2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수 i 입력: ");
		int i = scanner.nextInt();
				
		System.out.println();
		System.out.print("정수 j 입력: ");
		int j = scanner.nextInt();		
 		
		System.out.println(i + " + "+ j+ "=" + (i+j));
		System.out.println(i + " - "+ j+ "=" + (i-j));
		System.out.println(i + " * "+ j+ "=" + (i*j));
		
		if (j==0) {
			System.out.println("j 값이 0 이라 나눗셈을 할 수 없습니다.");
			
		}else {
			System.out.println(i + " % "+ j+ "=" + (i%j));
		}
		System.out.println(i + " / "+ j+ "=" + ((float)i+j));	
	}

}
