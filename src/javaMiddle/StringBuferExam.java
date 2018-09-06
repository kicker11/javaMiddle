package javaMiddle;

public class StringBuferExam {

	public static void main(String[] args) {
		StringBuffer sb  = new StringBuffer() ;
		
		sb.append("Hellow") ;
		sb.append(" ") ;
		sb.append("World") ;
		
		String str = sb.toString();
		System.out.println(str);
		
		// Method Chaining :  자기 자신을 반복 호출하면서 자신의 값을 변경시킨다.
		StringBuffer sb2 = new StringBuffer() ;
		StringBuffer sb3 = sb2.append("Hellow") ;
		
		if ( sb2 == sb3 ) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
		
		
		// Method Chaining :  자기 자신을 반복 호출하면서 자신의 값을 변경시킨다.
		String  str2 = new StringBuffer().append("Hellow").append(" ").append("World").toString() ;
		System.out.println(str2);
		
		

	}

}


