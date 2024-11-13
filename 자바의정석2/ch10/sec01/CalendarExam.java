package ch10.sec01;

import java.util.Calendar;

public class CalendarExam {
	
	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH);
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int hour = cal.get(Calendar.HOUR);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		
		
		System.out.println("현재 날짜와 시간: " + year + "-" + month + "-" + day + "-" + hour + ":" + minute + ":" + second ); 
		
	}

}
