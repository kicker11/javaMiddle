package javaMiddle;

public class Student {
	
	String name ;
	String number ;
	int birthday ;
	
	

	@Override
	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 * number(학번) 만을 비교하도록 overriding
	 */
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((number == null) ? 0 : number.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (number == null) {
			if (other.number != null)
				return false;
		} else if (!number.equals(other.number))
			return false;
		return true;
	}



	public static void main(String[] args) {
		Student s1  = new Student() ;
		
		s1.name = "홍기동" ;
		s1.number = "1234" ;
		s1.birthday = 1995 ;
		
		
		Student s2 = new Student() ;
		
		s2.name = "홍기동" ;
		s2.number = "1234" ;
		s2.birthday = 1995 ;
		
		
		if ( s1.equals(s2)) {
			System.out.println("s1 and s2 same");
		} else {
			System.out.println("s1 and s2 different");
		}
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		System.out.println(s1);
		System.out.println(s1.toString());
	}



	@Override
	public String toString() {
		return "Student [name=" + name + ", number=" + number + ", birthday=" + birthday + "]";
	}
}
