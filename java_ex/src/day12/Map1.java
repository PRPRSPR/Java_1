package day12;

import java.util.HashMap;

public class Map1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, String> map = new HashMap<>();
		
		map.put("name", "홍길동");
		map.put("age", "30");
		
		String ageStr = map.get("age")+1;
		
		int age = Integer.parseInt(map.get("age"))+1;
		
		System.out.println(ageStr);
		System.out.println(age);
		
		
	}

}
