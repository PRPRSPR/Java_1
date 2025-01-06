package day7;

public class Fruit {
	
	private String name;
	private int price;
	private int num;
	
	Fruit(String name, int price, int num){
		this.name = name;
		//this.name > private String name;을 의미. 
		//name; > 매개변수 String name을 의미.
		this.price = price;
		this.num = num;
		}
	
	Fruit(String name, int price){
		this(name,price,0);
//		this.name = name;
//		this.price = price;
//		this.num = 0;
	}
	
	void toString2() {
		System.out.println(name+"의 가격은 "+price+"원 입니다.");
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	
	

	
}
