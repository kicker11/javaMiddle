package javaMiddle;

public class BoxExam {

	public static void main(String[] args) {
//		Box box = new Box();
//		box.setObj(new Object()); 
//		Object obj = box.getObj() ;
//		
//		
//		box.setObj("Hello");
//		String str = (String)box.getObj();
//		System.out.println(str);
//		
//		box.setObj(1);
//		int val = (int)box.getObj();

        // Generic을 이용한 방법
		Box<Object> box = new Box<>();
		box.setObj(new Object()); 
		Object obj = box.getObj() ;
		System.out.println(obj);
		
		Box<String> box2 = new Box<>();
		box2.setObj("Hello");
		String str2 = box2.getObj();
		System.out.println(str2);
		
		Box<Integer> box3 = new Box<>();
		box3.setObj(1);
		int val = box3.getObj();
		System.out.println(val);
		
	}

}
