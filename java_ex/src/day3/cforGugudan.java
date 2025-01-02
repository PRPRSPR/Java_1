package day3;

public class cforGugudan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 구구단 출력하기

//		for (int i = 2; i <= 9; i++) {
//			for (int j = 1; j <= 9; j++) {
//				System.out.println(i + "*" + j + "=" + (i * j));
//			}
//		}

		// 구구단 역순 출력하기 (앞자리만 역순)
//		for (int a = 9; a >= 2; a--) {
//			for (int b = 1; b <= 9; b++) {
//				System.out.println(a + "*" + b + "=" + a * b);
//			}
//		}
		
		// 앞자리가 홀수인 구구단 출력하기
//		for (int g = 9; g >= 2; g--) {
//			for (int h = 1; h <= 9; h++) {
//				if(g%2==1) { //2번째 for문 안에 있으면 불필요한 계산까지 하게됨.
//				System.out.println(g + "*" + h + "=" + g * h);
//				}
//			}
//		}

//		for (int g = 9; g >= 2; g--) {
//			if (g % 2 == 1) {
//				for (int h = 1; h <= 9; h++) {
//					System.out.println(g + "*" + h + "=" + g * h);
//				}
//			}
//		}
		
		// 구구단 출력하기 - 꾸밈 추가. 위치 확인할 것
		for (int i = 2; i <= 9; i++) {
			System.out.println("====== "+i+"단 ======"); //단의 최초에 나와야함
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + "*" + j + "=" + (i * j));
			}
			System.out.println(); //단의 마지막에 나와야함.
		}
	}

}
