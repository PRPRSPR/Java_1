package day6;

public class Food {
	//private=>해당 클래스에서만 사용가능. 다른 클래스에서 값 수정 불가.
	private String name;
	private int price;
	
	Food(String name, int price){
		this.name=name;
		this.price=price;
	}
	
	void sell() {
		System.out.println(price+"원에 판매했습니다.");
	}

	//Alt+Shift+S >> Generate Getters and Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
//	void setPrice(int price) { //price에 직접접근x. setPrice로 간접접근 가능.
//		if(price<0) {
//			System.out.println("가격을 다시 확인해주세요.");
//			return; //바로 메소드를 빠져나가는 역할
//		}
//		System.out.println("정말 "+price+"가 맞습니까?");
//		this.price=price;
//	}
//	
//	void getPrice() {
//		return  price;
//	}
}
