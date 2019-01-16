package javaMiddle;

import java.util.Calendar;

public class CalendarExam {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();  // Calendar Class 를 상속한다.
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH)+1);   //java 의 월은 0월 ~ 11월까지로 제공한다. 따라서 +1 필요
		System.out.println(cal.get(Calendar.DATE));
		
		
		
		System.out.println(cal.get(Calendar.HOUR));
		cal.add(Calendar.HOUR_OF_DAY, -5);
		System.out.println(cal.get(Calendar.HOUR_OF_DAY));
		System.out.println(cal.get(Calendar.MINUTE));
		
		
	}

}
