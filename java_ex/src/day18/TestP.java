package day18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class TestP {
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		1부터 100까지 숫자 중 홀수이거나 8의 배수인 숫자를 출력하시오.
//		단, 50~60까지의 숫자를 출력하지 마시오.
		
		for(int i=1; i<=100; i++) {
			if(i>=50&&i<=60) {
				continue;
			} else if(i%2==1 || i%8==0) {
				System.out.print(i+" ");
			}
			
		}
		
//		6개의 공간을 가지는 int형 배열을 생성하고 스캐너를 통해 아래 조건에 맞게
//		숫자를 입력받아서 배열의 모든 공간에 넣으시오.
//		조건1. 배열에 들어가는 숫자는 1부터 100사이의 숫자일 것
//		조건2. 중복된 숫자는 들어가지 못하게 할 것
//		조건3. 배열 내림차순
		
		int arr[] = new int[6];
		for(int i=0; i<arr.length; i++) {
			boolean flg = false;
			System.out.print((i+1)+"번째 숫자 입력 : ");
			int input = scan.nextInt();
			if(input>=1||input<=100) {
				for(int j=0; j<i; j++) {
					if(input == arr[j]) {
						System.out.println("중복된 입력입니다.");
						flg = true;
					}
				}
				if(flg) {
					i--;
					continue;
				}
				arr[i] = input;
			} else {
				System.out.println("올바른 숫자 입력");
				i--;
			}
		}
//		
//		>> 무한루프+flg 사용
//		
//		int arr2[] = new int[6];
//		for(int i=0; i<arr2.length; i++) {
//			while(true) {
//				System.out.print((i+1)+"번째 숫자 입력 : ");
//				int input = scan.nextInt();
//				if(input<=1||input>=100) {
//					System.out.println("올바른 숫자 입력");
//				}else {
//					boolean flg = false;
//					for(int j=0; j<i; j++) {
//						if(input == arr2[j]) {
//							System.out.println("중복된 입력입니다.");
//							flg = true;
//						}
//					}
//					if(!flg) {
//						arr2[i] = input;
//						break;
//					}
//				}
//			}
//		}
		
		for(int i=0; i<arr.length-1; i++) {
			int max =i;
			for(int j=i+1; j<arr.length; j++) {
				max=(arr[j]<arr[max])?max:j;
			}
			int temp = arr[max];
			arr[max] = arr[i];
			arr[i] = temp;
		}
		
		System.out.println(Arrays.toString(arr));
		
		
//		아래 코드와 실행결과를 보고 Human, Student 클래스를 완성하시오.
		
		Human hong = new Human("홍길동", 30); // name, age
		System.out.println(hong);
		boolean flg = true;
		while(flg) {
			System.out.print("핸드폰 번호 입력 : ");
			String phone = scan.next();
			flg = hong.setPhone(phone);
		};
		System.out.println("번호 등록 완료");
		System.out.println("--------------------------------");
		
		Student kim = new Student("김철수", 20, "20201234");
		System.out.println(kim);
		System.out.println("--------- 수강해야할 과목 ---------");
		ArrayList<String> subjectList = kim.subjectList();
		for(int i=0; i<subjectList.size(); i++) {
			System.out.println(subjectList.get(i));
		}
		
		
//		주제 : 과일 가게 프로그램
//		* 숫자 1을 입력할 경우 '과일 추가', 2를 입력할 경우 '과일 삭제', 3을 입력할 경우 '가격 수정',
//		4를 입력할 경우 '현황 파악' 그 외의 숫자를 입력할 경우 종료 되도록 한다.
//		ex) "=== (1) 과일 추가 (2) 과일 판매 (3) 가격수정 (4) 현황 파악 (그외) 종료 ==="
//		공통사항 : 모든 데이터는 ArrayList> 형태로 관리한다.
		
//		1. 입력 부분
//		-> key를 String, value를 Object로 받는 HashMap 생성
//		-> 다음과 같이 map에 스캐너로 입력된 값 저장
//		-> key : name, value : 이름(문자) (ex, 오렌지)
//		-> key : price, value : 가격(숫자) (ex, 1000), 단, 100~10000 사이 값이 아니면 다시 입력
//		-> key : count, value : 개수(숫자) (ex, 35), 단, 최대 개수는 100개이며 0개 미만의 값을 가지면 안됨
//
//		만약 기존에 있는 과일을 추가할 경우 개수만 입력 받은 후 해당 개수를 기존 개수에 더해준다.
//		ex) 오렌지의 count값이 기존에 10인 상태에서 다시 한번 name에 오렌지를 입력할 경우
//		기존 10개에 새로 입력한 개수를 더해준다. (가격은 수정하지 않으며, 개수는 합쳐서 100개를 넘으면 안된다.)
//
//		=> 해당 map을 ArrayList 객체에 저장한다.
//
//		2. 삭제 부분
//		스캐너로 입력한 값과 map의 name value 값이 동일할 경우 리스트에서 삭제한다.
//
//		-> ex, 스캐너로 "오렌지"를 입력하면 name의 value가 "오렌지"인 map을 리스트에서 제거한다.
//
//		3. 가격 수정
//		-> 스캐너로 입력받은 값과 map의 key값의 name이 입력받은 값과 동일할 경우
//		가격을 입력받아서 수정할 수 있도록 한다.
//		출력 예시) 과일명 입력 : 오렌지
//		가격을 수정해주세요(기존 가격 1500) : 2000
//		수정되었습니다!
//		(해당 메뉴는 정상적인 입력만 있다고 가정한다.
//		즉, list에 없는 과일을 입력하는 경우에 대한 로직을 구현할 필요는 없다.)
//
//		4. 현황 파악
//		-> list에 있는 모든 정보를 화면에 출력한다
//		ex) 1번메뉴에서 오렌지, 바나나를 추가했을 경우
//		출력 예시) 오렌지의 가격은 1500원, 개수는 10개 남았습니다.
//		바나나의 가격은 2000원, 개수는 20개 남았습니다.
//
//		5. 종료 부분
//		-> 프로그램 종료
		
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();
		
		while(true) {
			System.out.println("=== (1) 과일 추가 (2) 과일 판매 (3) 가격수정 (4) 현황 파악 (그외) 종료 ===");
			int menu = scan.nextInt();
			if(menu == 1) {
				HashMap<String, Object> map = new HashMap<>();
				System.out.print("과일 이름 : ");
				String name = scan.next();
				boolean nameFlg = false;
				for(int i=0; i<list.size(); i++) {
					HashMap<String, Object> fruit = list.get(i);
					if(name.equals(fruit.get("name"))) {
						int num = setNum("개수", 0, 100-(int)fruit.get("num"));
						fruit.put("num", num+(int)fruit.get("num"));
						nameFlg = true;
						break;
					}
				}
				if(!nameFlg) {
					map.put("name", name);
					int price = setNum("가격", 100, 10000);
					map.put("price", price);
					int num = setNum("개수", 0, 100);
					map.put("num", num);
					list.add(map);
				}
			}else if(menu==2) {
				System.out.print("판매 과일 이름 : ");
				String name = scan.next();
				boolean nameFlg = false;
				for(int i=0; i<list.size(); i++) {
					HashMap<String, Object> fruit = list.get(i);
					if(name.equals(fruit.get("name"))) {
						list.remove(i);
						System.out.println("판매완료");
						nameFlg = true;
						break;
					}
				}
				if(!nameFlg) {
					System.out.println("없는 과일");
				}
			}else if(menu==3) {
				System.out.print("수정할 과일 이름 : ");
				String name = scan.next();
				boolean nameFlg = false;
				for(int i=0; i<list.size(); i++) {
					HashMap<String, Object> fruit = list.get(i);
					if(name.equals(fruit.get("name"))) {
						System.out.print("가격을 수정해주세요(기존 가격 "+fruit.get("price")+") : ");
						int price = scan.nextInt();
						fruit.put("price", price);
						System.out.println("수정되었습니다!");
						nameFlg = true;
						break;
					}
				}
				if(!nameFlg) {
					System.out.println("없는 과일");
				}
			}else if(menu==4) {
				for(int i=0; i<list.size(); i++) {
					HashMap<String, Object> fruit = list.get(i);
					System.out.println(fruit.get("name")+"의 가격은 "+fruit.get("price")+"원, 개수는 "+fruit.get("num")+"개 남았습니다.");
				}
			}else {
				System.out.println("종료되었습니다");
				break;
			}
		}
		
	}
	
}
