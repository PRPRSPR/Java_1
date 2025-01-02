package day3;

public class bLoop1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=10;i++) {
			if(i==5) {
				continue; //더 이상 내용을 실행하지않고 바로 반복 후 작업(i++)으로 넘어감
			}
			System.out.print(i);
		}
	}

}
