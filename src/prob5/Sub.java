package prob5;

public class Sub {
	int a = 0;
	int b = 0;
	int result = 0;

	public Sub(int a, int b) {
		setValue(a, b);
	}

	void setValue(int a, int b) {
		result = a - b;
		System.out.println(result);
		return;
	}
}
