package day2;

public class FLoop1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1; i<=10;) {
			System.out.println(i);
			i++;			
		}
		for(int i=1; i<=10; i++) {
			System.out.println(i);			
		}
		//둘 다 동일하게 작업함.
		
		
		//홀수만 표시하기
		for(int i=1; i<=10; i++) {
			if(i%2==1) {
			System.out.println(i);
			}
		}
		//홀수만 표시하기2
		for(int i=1; i<=10; i+=2) {
			System.out.println(i);			
		}
		
	}

}
