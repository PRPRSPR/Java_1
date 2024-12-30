package practice;

public class Loop1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//for문으로 1~9 곱셈표 만들기
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.print(i + "x" + j + "=" + i * j);
				System.out.print('\t');
			}
			System.out.println();
		}
	}

}
