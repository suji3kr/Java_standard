package ch11.sec02;

import java.util.ArrayList;
import java.util.List;

public class ArrayList2 {
	
	public static void main(String[] args) {
		final int LIMIT = 5;    // 기호상수 관련 문자 일괄적으로 5개로 수정 // 메인 안에서 끝날때는 Static 안써도됨
		String source = "0123456789abcdefghijABCDEFGHIJ!@#$%^&*()ZZZ";
		int length = source.length();
		
		List list = new ArrayList(length/LIMIT + 5); // 크기를 약간 여유있게
		
		for(int i = 0; i < length; i+=LIMIT) {
			if(i + LIMIT < length )
				list.add(source.substring(i, i+LIMIT));
			else 
				list.add(source.substring(i));
		}
		
		for(int i=0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	} 
}
