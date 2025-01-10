package day11;

import java.util.ArrayList;
import java.util.Scanner;

public class ListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		ArrayList<Human> list = new ArrayList<>();

		while (true) {
			System.out.println("(1)추가 (2)확인 (3)삭제 (4)종료");
			System.out.print(" >> ");
			int s = scan.nextInt();
			if (s == 1) {
				System.out.print("이름 : ");
				String name = scan.next();
				System.out.print("나이 : ");
				int age = scan.nextInt();
				System.out.print("주소 : ");
				String addr = scan.next();
				Human h = new Human(name, age, addr);
				list.add(h);
				System.out.println("추가되었습니다.");
			} else if (s == 2) {
				for (int i = 0; i < list.size(); i++) {
					System.out.print((i + 1) + ". 이름 : " + list.get(i).getName());
					System.out.print(", 나이 : " + list.get(i).getAge());
					System.out.println(", 주소 : " + list.get(i).getAddr());
				}
			} else if (s == 3) {
				System.out.print("삭제할 사용자의 이름 : ");
				String name = scan.next();
				boolean delF = false;
				for (int i = 0; i < list.size(); i++) {
					if (list.get(i).getName().equals(name)) {
						list.remove(i);
						delF = true;
						break;
					}
				}
				if (delF) {
					System.out.println("삭제 완료");
				} else {
					System.out.println("해당 사항 없음");
				}
			} else if (s == 4) {
				System.out.println("종료되었습니다.");
				break;
			} else {
				System.out.println("잘못된 입력입니다.");
			}

		}
	}

}
