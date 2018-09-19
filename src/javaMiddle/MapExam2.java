package javaMiddle;

import java.util.*;

public class MapExam2{
  public Map<String, Integer> makeMap(){
    Map<String, Integer> products = new HashMap<>();
    //상품의 이름과 값을 products에 추가해 보세요.
      
      products.put("가위", 2500) ;
      products.put("크래파스", 5000) ;


    return products;
  }

  public static void main(String[] args){
      
     MapExam2 exMap2 = new MapExam2() ;
      
      Map<String, Integer> map = new HashMap<>() ;
     
      map = exMap2.makeMap() ;
      
      System.out.println("가위의 가격은 " + map.get("가위"));
      
  }
}