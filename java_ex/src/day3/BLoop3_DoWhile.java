package day3;

public class BLoop3_DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=100;i<=10;i++) {
			System.out.println("실행!"); //실행되지 않음
		}
		
		int i=100;
		while(i<=10) {
			System.out.println("실행!"); //실행되지 않음
		}
		
		do {
			System.out.println("실행!"); //1회 실행됨.
		} while (i<=10);
	}

}
