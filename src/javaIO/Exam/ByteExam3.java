package javaIO.Exam;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class ByteExam3 {

	public static void main(String[] args) {
		//try-with-resources
		// try-catch-finally 를 통해 명시적으로  IO를  close 시키지 않아도 자동으로 close 시킨다.
		try(	DataOutputStream out = new DataOutputStream(new FileOutputStream("src/javaIO/Exam/data.txt")) ){
			out.writeInt(100);
			out.writeBoolean(true) ;
			out.writeDouble(50.5);
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
