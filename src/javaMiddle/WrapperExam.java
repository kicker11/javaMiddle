package javaMiddle;

public class WrapperExam {

	public static void main(String[] args) {
		int i = 5;
		Integer i2 = new Integer(5) ;
		
		Integer i3 = 5;  // AutoBoxing : Wrappr class 를 자동으로 형변환을 해 준다.  Interger i3 = new Integer(5); 를 자동으로 변환해 준 것. Java 5 이상만 가능
		
		int i4 = i3.intValue();
		
		int i5 = i3 ; // AutoUnBoxing : Wrappr class 를 자동으로 형변환을 해 준다.  Java 5 이상만 가능
		

	}

}
