package ch06.sec06.exam07;

public class Data1 {
	
	int value;	
//	Data1(){}   생성자 파라메드가 아무것도 없을 때는 자동생성
} 

class Data2{
	int value;
	Data2(int x){     // 정수 벨류 가져와
		value = x;
	}
}	
class ConstructorTest {	

	public static void main(String[] args) {
		Data1 d1 = new Data1();
		Data2 d2 = new Data2(10);
		
	}

}
