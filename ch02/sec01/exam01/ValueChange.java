package ch02.sec01.exam01;

public class ValueChange {

	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		int tmp;
		System.out.println("x="+ x);
		System.out.println("y="+ y);
		
		
		
		tmp = x;
		x = y; 
		y = tmp;
		
		
		System.out.println("x <-> y 데이터 교환");
		System.out.println("x="+ x);
		System.out.println("y="+ y);
		
	}
}
