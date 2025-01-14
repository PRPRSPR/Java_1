package day13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class ListMap3 {
	static Scanner scan = new Scanner(System.in);
	
	public static int setNum(String msg, int min, int max) {
		while(true) {
			System.out.print(msg+" : ");
			int num = scan.nextInt();
			if(num>=min && num<=max) {
				return num;
			}else {
				System.out.println(min+"~"+max+" 사이 값 입력");
			}
		}
	}
	public static HashMap<String, Object> selectFruit(ArrayList<HashMap<String,Object>> list,String name){
		for(int i=0; i<list.size();i++) {
			if(name.equals(list.get(i).get("name"))) {
				return list.get(i);
			}
		}
		return null;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<HashMap<String,Object>> list = new ArrayList<>();
		
		//과일가게
		//1번-과일추가, 2번-과일판매, 3번-과일확인, 4번-종료
		
		//메소드 활용으로 가독성 좋게 코드 만들기
		
		while (true) {
			HashMap<String, Object> map = new HashMap<>();
			System.out.println("[(1)추가 (2)판매 (3)확인 (4)종료]");
			int menu = scan.nextInt();
			if(menu==1) { 
				// 동일한 이름의 과일. 가격 수정 x. 개수 누적
				System.out.println("과일명 : ");
				String name = scan.next();
				map.put("name", name);
				
				HashMap<String,Object> fruit = selectFruit(list, name);
				if(fruit != null) {
					int num = setNum("개수",1,300-(int)fruit.get("num"));
					fruit.put("num", (int)fruit.get("num")+num);
				} else {
					int price = setNum("가격",100,100000);
					map.put("price", price);
					int num = setNum("개수",1,300);
					map.put("num", num);
					list.add(map);
				}
				
				
			}else if(menu==2) { 
			// 판매-과일명, 구매개수, 판매완료:'n개를 판매하여 m개 남았습니다'
			// 없는과일:'없는 과일입니다', 보유개수초과:'현재 사과는 m개 남아있습니다'
				System.out.print("구매할 과일명 : ");
				String name = scan.next();
				HashMap<String,Object> fruit = selectFruit(list,name);
				if(fruit != null) {
					System.out.print("구매 개수 : ");
					int num = scan.nextInt();
					if(num>(int)fruit.get("num")) {
						System.out.println("재고가 없습니다.");
						System.out.println("현재 남은 개수는 "+(int)fruit.get("num")+"개 입니다.");
					} else {
						fruit.put("num", (int)fruit.get("num")-num);
						System.out.println("판매되었습니다.");
					}
					
				} else {
					System.out.println("없는 과일 입니다.");
				}
				
			}else if (menu==3) { //확인
				// 과일명 검색>"ㅇㅇㅇ의 가격은 000, 개수는 nn개 남았습니다"
				System.out.print("과일명 : ");
				String name = scan.next();
				HashMap<String,Object> fruit = selectFruit(list,name);
				if(fruit != null) {
					System.out.println(name+"의 가격은 "+fruit.get("price")+", 개수는 "+fruit.get("num")+"개 남았습니다.");
				} else {
					System.out.println("없는 과일 입니다.");
				}
			}else if (menu==4) { //종료
				System.out.println("종료");
				break;
			} else { //다시시도
				System.out.println("메뉴에 없는 번호");
			}
		}
		
	}

}
