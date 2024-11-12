package ch07.sec15.exam01;

public class CastTest1 {

	public static void main(String[] args) {

		Car car = null;
		
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		fe.water();
		car = fe;
		
		fe2 = (FireEngine) car;
		fe2.water();
		
	}

}

class Car {
	String color;
	int door;
	
	void drive( ) {  //운전하는 기능
		System.out.println("dirve, Brrr~");
	}

	void stop( ) {  //멈추는 기능
		System.out.println("stop!!!");
	}
}


class FireEngine extends Car {  //소방차
	void water() {   //물을 뿌리는 기능
		System.out.println("water!!!");
	}
	
}

