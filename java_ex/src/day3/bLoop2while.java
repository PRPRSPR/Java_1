package day3;

public class bLoop2while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=1;
		while(i<=10) {
			System.out.println(i);
			i++; //없으면 무한루프. 위치에 따라 결과 달라짐.
		}
		
//		for(int j=1; j<=10; j++) {	} // while과 다르게 반복 후 작업이 포함되어있음
		
		// while문으로 구구단 출력
		
		int a=2;
		while (a<=9) {
			int b=1; //아래 반복에서 9까지 증가 후 초기화 시켜줘야 다시 반복가능.
			while(b<=9) {
				System.out.println(a+"*"+b+"="+a*b);
				b++;
			}
			a++;
		}
	}

}
