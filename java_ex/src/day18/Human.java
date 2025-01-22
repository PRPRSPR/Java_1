package day18;

public class Human {
	private String name;
	private int age;
	private String phone;
	
	Human(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name+"의 나이는 "+age+" 입니다.";
	}
	
	boolean setPhone(String phone) {
		if(phone.contains("-")||phone.length()!=11) {
			System.out.println("핸드폰 번호는 11글자로 입력해주세요.(-제외)");
			System.out.println("ex) 01012341234");
			return true;
		}
		this.phone = phone;
		return false;
	}
}
