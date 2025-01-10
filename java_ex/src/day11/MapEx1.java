package day11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class MapEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		ArrayList<HashMap<String, Object>> list = new ArrayList<>();
//		>> HashMap<String, Object>를 <>안에 그대로 넣어준다

		while (true) {
			System.out.print("[(1)추가 (2)확인 (3)삭제 (4)종료] : ");
			int menu = scan.nextInt();
			if (menu == 1) {
				HashMap<String, Object> map = new HashMap<>();
				System.out.print("이름 : ");
				map.put("name", scan.next());
				System.out.print("나이 : ");
				map.put("age", scan.nextInt());
				System.out.print("주소 : ");
				map.put("addr", scan.next());
				list.add(map);
			} else if (menu == 2) {
				for (int i = 0; i < list.size(); i++) {
					System.out.print((i + 1) + ". ");
					System.out.print("이름 : " + list.get(i).get("name") + ", ");
					System.out.print("나이 : " + list.get(i).get("age") + ", ");
					System.out.println("주소 : " + list.get(i).get("addr"));
				}
			} else if (menu == 3) { // 삭제 추가하기
				System.out.print("삭제할 사용자의 이름 : ");
				String name = scan.next();
//				>> 삭제할 이름 입력받기	

				boolean deleteFlg = false;
//				>> boolean 타입의 deleteFlg 변수 만들어 false 로 초기화
//				
				for (int i = 0; i < list.size(); i++) { // list 사이즈 만큼
//					HashMap<String, Object> map = list.get(i);
//					if(name.equals(map.get("name"))){
//					>> 위의 두 줄과 아래 if 문이 같음
					if (list.get(i).get("name").equals(name)) {
//				>> list 의 i 번째 map 에서 키 "name"으로 값을 찾아 입력받은 name 값과 비교
//					true, 일치하면 아래 실행 / false, 아무것도 실행하지않고 다음으로 넘어감
						list.remove(i); // list 의 i 번째 map 삭제
						deleteFlg = true; // deleteFlg true 로 초기화
						break; // 반복문 나가기
					}
				}
				if (deleteFlg) {
//				>> 위의 반복문 이후 true/false 상태 확인 ==> 삭제되었는지 분별 가능
					System.out.println("삭제되었습니다.");
//					>> deleteFlg = true
				} else {
					System.out.println("해당 이름을 가진 사용자가 존재하지 않습니다.");
//					>> deleteFlg = false
				}
			} else if (menu == 4) {
				System.out.println("종료되었습니다.");
				break;
			} else {
				System.out.println("1~3번 중 선택");
			}
		}

	}

}
