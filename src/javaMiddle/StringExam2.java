package javaMiddle;

public class StringExam2 {

	public static void main(String[] args) {
		String str1 = "Hello World" ;
		String str2 = str1.substring(5) ;  // 5번재 문자부터 나머지 문자를 선택
		
		System.out.println(str1);
		System.out.println(str2);
		
		
		String str3 = str1 + str2 ;
		System.out.println(str3 );
		
		String str4 = new StringBuffer().append(str1).append(str2).toString();
		System.out.println(str4 );
		
		
		// 악성 코드 : 내부적으로 과도한 new 생성자를 유도한다.
		String str5 = "" ;
		for ( int i = 0 ; i < 100; i++) {
			str5 = str5 + "*" ;
		}
		System.out.println(str5);
		
		// 올바른 사용 예 : class 객체의 함수를 이용한 방법
		StringBuffer sb = new StringBuffer() ;
		for ( int i = 0; i < 100; i++) {
			sb.append("*") ;
		}
		String str6 = sb.toString() ;
		System.out.println(str6);
	}

}
