package day12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Map2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();
		
		// json (List 안에 HashMap)
		
//		map.put("name", "홍길동");
//		map.put("age", 30);
//		map.put("height", 170.5);
//		list.add(map);
//		System.out.println(list);
		
		// 스캐너로 이름, 나이, 키를 입력받아서
		// 3명의 정보를 리스트에 저장
		
		for (int i=0; i<3; i++) {
			HashMap<String, Object> map = new HashMap<>();
			System.out.println((i+1)+". 이름, 나이, 키 입력");
			System.out.print("이름 : ");
			String name = scan.next();
			System.out.print("나이 : ");
			int age = scan.nextInt();
			System.out.print("키 : ");
			int height = scan.nextInt();
			
			map.put("name", name);
			map.put("age", age);
			map.put("height", height);
			
			list.add(map);
		}
		System.out.println(list);
		
		
	}

}
