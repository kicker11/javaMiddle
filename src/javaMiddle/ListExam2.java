package javaMiddle;

import java.util.*;

public class ListExam2{
  public List<String> addArray(String[] arr1, String[] arr2){
    List<String> list = new ArrayList<String>();

    for(String str : arr1){
      System.out.println(str);     
      list.add(str) ;
    }

    for(String str : arr2){
      System.out.println(str);
      list.add(str) ;
    }
    

    return list;
  }

  public static void main(String[] args){
	  List<String> list2 = new ArrayList<String>() ;
	  
	  String[] ar1 = new String[2] ;
	  String[] ar2 = new String[3] ;

	  ar1[0] = "abc" ;
	  ar1[1] = "xyz" ;
	  
	  ar2[0] = "ABC" ;
	  ar2[1] = "HIJ" ;
	  ar2[2] = "XYZ" ;
	  
	  
	  ListExam2 ex = new ListExam2();
	  
	  list2 = ex.addArray(ar1, ar2) ;
	  //list2 = addArray(ar1 , ar2) ;
	  
  }
}
