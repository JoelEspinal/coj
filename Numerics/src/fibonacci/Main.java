package fibonacci;

public class Main {

	public static void main(String[] args) {
		fibonacci(0, 1);
	}
	
	static int limit = 100;
	static int fibonacci(int x1, int x2) {
		System.out.println(x2);
		int wildcard = x1 + x2;
		if(wildcard >= limit) return wildcard;
		return x1 + fibonacci(x2, wildcard);
	}
}
