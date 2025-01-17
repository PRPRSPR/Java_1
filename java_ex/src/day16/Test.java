package day16;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum=0;
		for(int i=1;i<=100;i++) {
			if(i%2==0 && i%5==0) {
				sum+=i;
			}
		}
		System.out.println("합 : "+sum);
		
	}

}
