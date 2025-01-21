package hw250121;

public class Bb extends OddDetector {
	public Bb(int n) {
		super(n);
	}

	@Override
	public boolean isOdd() {
		if(n%2==1) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		Bb b = new Bb(10);
		System.out.println(b.isOdd());
	}

}
