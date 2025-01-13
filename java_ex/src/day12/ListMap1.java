package day12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class ListMap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();
		
		// 홍길동 +1000p, (동명이인 없다고 가정.)
		
		for(;;) { //무한루프
			HashMap<String, Object> map = new HashMap<>();
			System.out.println("[(1)추가 (2)확인 (3)종료]");
			int menu = scan.nextInt();
			if(menu == 1) {
				System.out.print("이름 : ");
				String name = scan.next();
				System.out.print("포인트 : ");
				int point = scan.nextInt();
				// 이미 등록된 이름에 포인트 더해주기
				boolean updateFlg = false;
				for(int i=0; i<list.size(); i++) { 
					if(list.get(i).get("name").equals(name)) {
						int newPoint = (int)list.get(i).get("point") + point;
						list.get(i).put("point", newPoint);
						updateFlg = true;
						break;
					}
				}
				if(!updateFlg) { // updateFlg == false
					map.put("name", name);
					map.put("point", point);
					list.add(map);
				}
				
			} else if(menu == 2) {
//				System.out.println(list);
				// 이름 입력받아 포인트 확인하기 "ㅇㅇㅇ님의 포인트는 000입니다."
				System.out.print("이름 : ");
				String name = scan.next();
				for(int i=0; i<list.size(); i++) {
					if (list.get(i).get("name").equals(name)) { // >> name.equals(list.get(i).get("name"))
						System.out.println(name + "님의 포인트는 "+list.get(i).get("point")+ " 입니다.");
						break;
					} else {
						System.out.println("이름을 다시 입력해주세요.");
					}
				}
			} else if(menu == 3) {
				System.out.println("종료");
				break;
			} else {
				System.out.println("없는 메뉴");
			}
		}
	}

}
