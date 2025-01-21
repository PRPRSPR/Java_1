package day17;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Review_ListMap2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		ArrayList<HashMap<String,Object>> list = new ArrayList<>();
		
		// 이름, 나이, 주소 입력받아 map 에 저장 > list 에 추가 (3명)
		for(int i=0; i<3; i++) {
			HashMap<String,Object> map = new HashMap<>();
			System.out.println((i+1)+"번째");
			System.out.print("이름 : ");
			String name = scan.next();
			System.out.print("나이 : ");
			int age = scan.nextInt();
			System.out.print("주소 : ");
			String addr = scan.next();
			map.put("name", name);
			map.put("age", age);
			map.put("addr", addr);
			list.add(map);
		}
		
		System.out.println(list);
		
		
		//수정할 사용자 입력 : 홍길동
		//list>map 에 홍길동이 있으면 : 주소 수정할 수 있게.
		//없으면 : 없는 사용자 입니다.
		boolean flg = false;
		for(int i=0; i<list.size(); i++) {
			System.out.print("수정할 사용자 이름 : ");
			String name = scan.next();
			HashMap<String,Object> map = list.get(i);
			if(map.get("name").equals(name)) {
				System.out.print("수정할 주소 : ");
				String addr = scan.next();
				map.put("addr", addr);
				flg = true;
				break;
//				return; >> 단독 사용시 해당 메소드를 빠져나감. 아래 내용 실행되지 않음.
			}
		}
		if(!flg) {
			System.out.println("없는 사용자");
		}
		
		System.out.println(list);
	}

}
