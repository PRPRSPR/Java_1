package day8;

public class Override1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Orange orange = new Orange();
		orange.name = "오렌지";
		orange.color = "주황색";
		orange.price = 100000;
		
		System.out.println(orange);
//		>> orange의 주소값이 출력됨. 패키지명,클래스명,주소
//		현재 오버라이딩 되어 값 출력 가능. 과일명 : 오렌지, 색 : 주황색, 가격 : 100000
		System.out.println(orange.toString());
//		>> Orange클래스에 오버라이딩 하지 않으면 위와 동일한 방식의 값 출력
//		현재 오버라이딩 되어 값 출력 가능. 과일명 : 오렌지, 색 : 주황색, 가격 : 100000
	}

}
