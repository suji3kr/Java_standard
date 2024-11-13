package ch09.sec03;

public class HashCodeEx1 {
	 public static void main(String[] args) {
		 
		 String str1 = new String ("abc");
		 String str2 = new String ("abc");
		 
		 System.out.println(str1.equals(str2));  // 실체 인 값을 비교  true
		 System.out.println(str1 == str2);       // 주소를 비교   false

		 System.out.println(str1.hashCode());
		 System.out.println(str2.hashCode());  //결과값이 같음  //오브젝트기준 기본 메서드 = 객체 중심
		 
		 System.out.println(System.identityHashCode(str1));
		 System.out.println(System.identityHashCode(str2));   // 결과값이 다름 identity에 기반한 HashCode  = 각자 기준 
		 
		 
	 }

}
