package javaMiddle;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExam {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>() ;
		
		map.put("001", "Kim") ;
		map.put("002", "Lee") ;
		map.put("003", "Choi") ;
		
		map.put("001", "Kang") ;  // 기존의 Key 값이 가지고 있는 Value 값을 변경한다.
		
		System.out.println(map.size());
		
		System.out.println(map.get("001"));
		System.out.println(map.get("002"));
		
		Set<String> keys = map.keySet() ;
		
		Iterator<String> iter = keys.iterator();
		
		while ( iter.hasNext()) {
			String key = iter.next();
			String val = map.get(key) ;
			System.out.println(String.format("key = %s , value = %s", key, val));
		}

	}

}
