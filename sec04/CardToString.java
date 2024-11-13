package ch09.sec04;


class Card{
	String kind;
	int number;
	
	public Card() {
		this("SPADE", 1);
		
	}
	public Card(String kind, int number) {
//		super();
		this.kind = kind;
		this.number = number;
	}
		
}

public class CardToString {

	public static void main(String[] args) {
		Card c1 = new Card();
		Card c2 = new Card();
		
		System.out.println(c1.toString());    //클래스위치+식별자로 표시됨 
		System.out.println(c2.toString());    // 해시코드가 다르게 표시됨

	}

}
