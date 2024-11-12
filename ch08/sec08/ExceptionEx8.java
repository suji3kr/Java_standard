package ch08.sec08;

public class ExceptionEx8 {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0/0);

			
		}catch(ArithmeticException ae) {
			ae.printStackTrace();
			System.out.println("예외메세지: " + ae.getMessage());
		}finally {						//try 관련이 있는 내용
			System.out.println(4);  
				
		}//예) 파일 닫기
		
		System.out.println(6);			//try 관련이 없는 내용
	}

}
