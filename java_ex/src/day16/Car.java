package day16;

public class Car implements CarManager {

	private String kind;
	private int speed;
	private String color;

	Car(String kind, int speed, String color) {
		this.kind = kind;
		this.speed = speed;
		this.color = color;
	}

	@Override
	public String toString() {
		return "차 종류는 " + kind + ", 색은 " + color + " 입니다.";

	}

	@Override
	public void SpeedUp(int speed) {
		this.speed += speed;
		if (this.speed > 200) {
			System.out.println("200 이상의 속도는 불가합니다. 200으로 변경됩니다.");
			this.speed = 200;
		}
	}

	@Override
	public void SpeedDown(int speed) {
		this.speed -= speed;
		if (this.speed < 0) {
			System.out.println("0 미만의 속도는 불가합니다. 0으로 변경됩니다.");
			this.speed = 0;
		}
	}

	@Override
	public int getSpeed() {
		return speed;
	}

	public static void main(String[] args) {

		Car c = new Car("소나타", 0, "검정");
		System.out.println(c); // '차 종류는 소나타, 색은 검정 입니다'
		c.SpeedUp(100);
		System.out.println(c.getSpeed()); // 100
		c.SpeedUp(150);
		System.out.println(c.getSpeed()); // 200
		c.SpeedDown(30);
		System.out.println(c.getSpeed()); // 170

	}
}