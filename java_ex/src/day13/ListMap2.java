package day13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class ListMap2 {
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
//	public static void fName(ArrayList list, String name) {
//		for(int i=0; i<list.size();i++) {
//			HashMap<String, Object> map1 = (HashMap<String, Object>) list.get(i);
//			if(name.equals(map1.get("name"))) {
//				
//			}else {
//				
//			}
//		}
//	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<HashMap<String,Object>> list = new ArrayList<>();
		
		//과일가게
		//1번-과일추가, 2번-과일판매, 3번-과일확인, 4번-종료
		
		while (true) {
			HashMap<String, Object> map = new HashMap<>();
			System.out.println("[(1)추가 (2)판매 (3)확인 (4)종료]");
			int menu = scan.nextInt();
			if(menu==1) { 
//				추가-map에 과일명(name), 가격(price),개수(num) 입력받아 list 저장
//				System.out.print("과일명 : ");
//				String name = scan.next();
//				map.put("name", name);
//				
				//100~100000원
//				while(true) {
//					System.out.print("가격 : ");
//					int price = scan.nextInt();
//					if(price>=100 && price>=100000) {
//						map.put("price", price);
//						break;
//					} else {
//						System.out.println("100~100000원 사이의 값 입력");
//					}
//				} 
//
				//1~300개
//				while(true) {
//					System.out.print("개수 : ");
//					int num = scan.nextInt();
//					if(num>=1 && num<=300) {
//						map.put("num", num);
//						break;
//					} else {
//						System.out.println("1~300개 사이의 값 입력");
//					}
//				} 
				
				//동일한 이름의 과일. 가격 수정 x. 개수 누적
				
				System.out.print("과일명 : ");
				String name = scan.next();
				boolean flg = false;
				for(int i=0; i<list.size();i++) {
					HashMap<String, Object> map1 = list.get(i);
					if(name.equals(map1.get("name"))) {
						int newNum;
						int num = setNum("개수",1,300-(int)map1.get("num"));
//						>> 300개 초과되지 않도록 (int)map1.get("num") 만큼 빼주기
						newNum = (int)map1.get("num")+num;
						map1.put("num", newNum);
//						newNum 없이 한 줄로 축약 가능
//						>> map1.put("num", (int)map1.get("num")+num);
						flg=true;
						break;
					} 
				}
				if(!flg) {
					map.put("name", name);
					int price = setNum("가격",100,100000);
					map.put("price", price);
					int num = setNum("개수",1,300);
					map.put("num", num);
					list.add(map);
				}
				
				System.out.println();
				
				
			}else if(menu==2) { 
			// 판매-과일명, 구매개수, 판매완료:'n개를 판매하여 m개 남았습니다'
			// 없는과일:'없는 과일입니다', 보유개수초과:'현재 사과는 m개 남아있습니다'
//				while(true) {
//					System.out.print("구매할 과일명 : ");
//					String name = scan.next();
//					boolean flg = false;
//					for(int i=0; i<list.size();i++) {
//						HashMap<String, Object> map1 = list.get(i);
//						if(!name.equals(map1.get("name"))) {
//							System.out.println("없는 과일입니다.");
//						} else {
//							while(true) {
//								System.out.print("구매 개수 : ");
//								int num = scan.nextInt();
//								if((int)map1.get("num")<num) {
//									System.out.println("현재 "+map1.get("name")+"은(는) "+map1.get("num")+"개 남아있습니다.");
//								} else if((int)map1.get("num")>=num) {
//									map1.put("num", (int)map1.get("num")-num);
//									System.out.println(num+"개를 판매하여 "+map1.get("num")+"개 남아있습니다.");
//									flg = true;
//									break;
//								}
//							}
//						} 
//					}
//					if(flg) {
//						break;
//					}
//				}
				System.out.print("구매할 과일명 : ");
				String name = scan.next();
				boolean flg = false;
				for(int i=0; i<list.size();i++) {
					HashMap<String, Object> map1 = list.get(i);
					if(name.equals(map1.get("name"))) {
						System.out.print("구매 개수 : ");
						int num = scan.nextInt();
						if(num>(int)map1.get("num")) {
							System.out.println("현재 "+map1.get("name")+"은(는) "+map1.get("num")+"개 남아있습니다.");
						}  else {
							map1.put("num", (int)map1.get("num")-num);
							System.out.println(num+"개를 판매하여 "+map1.get("num")+"개 남아있습니다.");
						}
						flg = true;
						break;
					}
				}
				if(!flg) {
					System.out.println("없는 과일입니다.");
				}
				
			}else if (menu==3) { //확인
				// 과일명 검색>"ㅇㅇㅇ의 가격은 000, 개수는 nn개 남았습니다"
				System.out.print("과일명 : ");
				String name = scan.next();
				for(int i=0; i<list.size();i++) {
					HashMap<String, Object> map1 = list.get(i);
					if(name.equals(map1.get("name"))) {
						System.out.println(name+"의 가격은 "+map1.get("price")+", 개수는 "+map1.get("num")+"개 남았습니다.");
					}
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
