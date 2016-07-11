package prob5;

public class Add {
	int a = 0;
	int b = 0;
	int result = 0;

	public Add(int a, int b) {
		setValue(a, b);
	}

	void setValue(int a, int b) {
		result = a + b;
		System.out.println(result);
		return;
	}

}