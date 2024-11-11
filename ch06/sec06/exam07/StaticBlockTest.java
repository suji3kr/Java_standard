package ch06.sec06.exam07;

public class StaticBlockTest {

	static int[] arr = new int[10];
	static {
		for(int i =0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*10) + 1;
		}
		
	}
	public static void main(String[] args) {
		
		for(int i =0; i<arr.length; i++) {
			System.out.println("array[" +i+"]: " + arr[i]);
		}
		
	}

}
