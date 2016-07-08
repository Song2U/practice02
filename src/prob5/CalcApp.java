package prob5;

import java.util.Scanner;

public class CalcApp {
	static int result;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.print(">>");
			String input = scanner.nextLine();
			if (input.equals("quit") == true) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			String[] tokens = input.split(" ");
			int a = Integer.parseInt(tokens[0]);
			String op = tokens[1];
			int b = Integer.parseInt(tokens[2]);
			setValue(a, op, b);
		}
	}

	private static void setValue(int a, String op, int b) {
		switch (op) {
		case "+":
			Add add = new Add(a, b);
			break;
		case "-":
			Sub sub = new Sub(a, b);
			break;
		case "*":
			Mul mul = new Mul(a, b);
			break;
		case "/":
			Div div = new Div(a, b);
			break;
		}
	}
}
