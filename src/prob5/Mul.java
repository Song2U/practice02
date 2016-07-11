package prob5;

public class Mul {
	int a = 0;
	int b = 0;
	int result = 0;

	public Mul(int a, int b) {
		setValue(a, b);
	}

	void setValue(int a, int b) {
		result = a * b;
		System.out.println(result);
		return;
	}
}
