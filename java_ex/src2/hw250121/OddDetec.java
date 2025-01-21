package hw250121;

public abstract class OddDetec {
	protected int n;

	public OddDetec(int n) {
		this.n = n;
	}

	public abstract boolean isOdd(); // 홀수이면 true 리턴

}
