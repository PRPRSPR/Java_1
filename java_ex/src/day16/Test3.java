package day16;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Test3 {
	static Scanner scan = new Scanner(System.in);
	public static int setNum(String msg) {
		while(true) {
			System.out.print(msg+" : ");
			int num = scan.nextInt();
			if(num>=0 && num<=100) {
				return num;
			}else {
				System.out.println("0~100 값을 입력해주세요.");
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<HashMap<String,Object>> list = new ArrayList<>();
		
		System.out.println("=== 학생 관리 시스쳄 입니다! ===");
		while(true) {
			HashMap<String, Object> std = new HashMap<>();
			System.out.print("[(1) 학생추가 (2) 성적입력 (3) 조회 (4) 성적수정 (5) 종료]");
			int menu = scan.nextInt();
			if(menu == 1) {
				System.out.print("이름 입력 : ");
				String name = scan.next();
				boolean flg = false;
				for(int i=0; i<list.size();i++) {
					HashMap<String, Object> student = list.get(i);
					if(name.equals(student.get("name"))) {
						System.out.println("이미 존재하는 학생입니다. 처음으로 이동 합니다.");
						flg = true;
						break;
					}
				}
				if(!flg) {
					System.out.println("학생이 추가되었습니다!");
					std.put("name", name);
					list.add(std);
				}
				
			}else if(menu == 2) {
				System.out.print("이름 입력 : ");
				String name = scan.next();
				for(int i=0; i<list.size();i++) {
					HashMap<String, Object> student = list.get(i);
					if(name.equals(student.get("name"))) {
						int java = setNum("java");
						student.put("java", java);
						int oracle = setNum("oracle");
						student.put("oracle", oracle);
						break;
					}else {
					System.out.println("해당 학생이 존재하지 않습니다.");
					}
				}
			}else if(menu == 3) {
				System.out.println(list);
			}else if(menu == 4) {
				System.out.print("이름 입력 : ");
				String name = scan.next();
				for(int i=0; i<list.size();i++) {
					HashMap<String, Object> student = list.get(i);
					if(name.equals(student.get("name"))) {
						System.out.print("수정할 과목명(java,oracle) : ");
						String subject = scan.next();
						if(subject.equals("java")) {
							int java = setNum("java");
							student.put("java", java);
							break;
						}else if(subject.equals("oracle")) {
							int oracle = setNum("oracle");
							student.put("oracle", oracle);
							break;
						}else {
							System.out.println("없는 과목입니다. 메뉴로 이동합니다.");
							break;
						}
					}else {
					System.out.println("해당 학생이 존재하지 않습니다.");
					break;
					}
				}
			}else if(menu == 5){
				System.out.println("종료되었습니다.");
				break;
			}else {
				System.out.println("메뉴에 없는 번호입니다.");
			}
			
		}
	}

}
