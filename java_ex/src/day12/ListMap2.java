package day12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class ListMap2 {
	static Scanner scan = new Scanner(System.in);
	
	public static int setScore(String msg) {
		while(true) {
			System.out.print(msg+"점수 : ");
			int score = scan.nextInt();
			if(score<=100 && score>=0) {
				return score;
			}
			System.out.println("0~100 사이 값 입력");
		}
	}
	public static int setScore(String msg, int max) {
		while(true) {
			System.out.print(msg+"점수 : ");
			int score = scan.nextInt();
			if(score<=max && score>=0) {
				return score;
			}
			System.out.println("0~"+max+" 사이 값 입력");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();
		
		while(true) {
			HashMap<String, Object> map = new HashMap<>();
			// 이름(name), 자바점수(java), 오라클점수(oracle), Html점수(html) 입력받기
			// 점수는 0~100 사이만 가능. 그 외 값 다시 입력.
			// map을 list에 추가 

			System.out.println("[(1)추가 (2)수정 (3)확인 (4)종료]");
			int menu = scan.nextInt();
			if(menu == 1) {
				
				System.out.print("이름 : ");
				String name = scan.next();
				map.put("name", name);

//				while(true) {
//					System.out.print("자바점수 : ");
//					int java = scan.nextInt();
//					if(java<=100 && java>=0) {
//						map.put("java", java);
//						break;
//					}
//					System.out.println("0~100 사이 값 입력");
//				}
//				while(true) {
//					System.out.print("오라클점수 : ");
//					int oracle = scan.nextInt();
//					if(oracle<=100 && oracle>=0) {
//						map.put("oracle", oracle);
//						break;
//					}
//					System.out.println("0~100 사이 값 입력");
//				}
//				while(true) {
//					System.out.print("Html점수 : ");
//					int html = scan.nextInt();
//					if(html<=100 && html>=0) {
//						map.put("html", html);
//						break;
//					}
//					System.out.println("0~100 사이 값 입력");
//				}
				
				// 반복문이 반복되고 있음. >> 클래스에서 메소드로 만들어주기
				// 자바(0~40), 오라클(0~35), HTML(0~25)
				
				map.put("java", setScore("자바", 40));
				map.put("oracle", setScore("오라클",35));
				map.put("html", setScore("HTML",25));
				
				list.add(map);
			}else if(menu==2) {
				// 이름, 과목명, 점수 입력받아 해당 학생의 과목 점수를 수정
				//ex) 이름 : 홍길동, 과목 : 자바, 자바점수 : 30 ==> 홍길동의 자바 점수를 30으로 변경
				
				System.out.print("이름 : ");
				String name = scan.next();
				for(int i=0; i<list.size(); i++) {
					HashMap<String, Object> user = list.get(i);
					if(name.equals(user.get("name"))) {
						System.out.print("과목 : ");
						String subject = scan.next();
						user.put("java", setScore(subject, 40));
						
						
					}
				}
				
			}else if(menu==3) {
				System.out.println(list);
				for(int i=0; i<list.size(); i++) {
					System.out.println();
				}
			}else if(menu==4) {
				break;
			}
		}
		
	}

}
