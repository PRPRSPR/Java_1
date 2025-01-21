package hw250121;

public class Bb extends OddDetec {
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
}
