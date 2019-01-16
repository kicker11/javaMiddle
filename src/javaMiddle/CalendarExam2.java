package javaMiddle;

import java.util.Calendar;

public class CalendarExam2 {

	public String hundredDaysAfter() {
		Calendar cal = Calendar.getInstance() ;
		cal.add(Calendar.DAY_OF_YEAR, 100);
		String result = String.valueOf(cal.get(Calendar.YEAR)) + "년";
		result = result + String.valueOf(cal.get(Calendar.MONTH)+1) + "월";
		result = result + String.valueOf(cal.get(Calendar.DATE)) + "일";
		System.out.println(result);
		return result ;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalendarExam2 ce2 = new CalendarExam2();
		ce2.hundredDaysAfter() ;
	}

}
