package day3;

public class forsample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=1;i<=10;i++) {//1~10까지 반복
			sum+=i; //sum=sum+i;
			System.out.println(i); //1. 더하는 수 출력
			
			if(i<=9) { //2. 1~9까지는 '+'출력
				System.out.println("+");
			} else { //i가 10인 경우
				System.out.println("="); //3. '='출력하고
				System.out.println(sum); //4. 덧셈 결과 출력
			}
		}
	}

}
