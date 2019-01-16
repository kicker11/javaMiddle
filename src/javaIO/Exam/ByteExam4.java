package javaIO.Exam;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ByteExam4 {

	public static void main(String[] args) {
		//try-with-resources
		// try-catch-finally 를 통해 명시적으로  IO를  close 시키지 않아도 자동으로 close 시킨다.
		try(	DataInputStream in = new DataInputStream(new FileInputStream("src/javaIO/Exam/data.txt")) ){
			int i = in.readInt();
			System.out.println(i);
			boolean Yn = in.readBoolean();
			System.out.println(Yn);
			double dou = in.readDouble();
			System.out.println(dou);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
