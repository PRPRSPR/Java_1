package hw250107;

public class ColorTV extends TV {
	
	private int inch;
	private int color;
	
	ColorTV(int inch , int color){
		super(inch);
		this.color = color;
	}
	
	protected int getColor() {
		return color;
	}
	
	void printProperty() {
		System.out.println(getSize()+"인치 "+color+"컬러");
	}
	
}
