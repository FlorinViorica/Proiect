public class Recursivitate {

	public static void main(String[] args) {
		System.out.println("factorial: " + factorial(10));
		System.out.println("fibonacci: " + fibonacci(10));
		System.out.println("tiangle: " + triangle(10));

		int k = 234235;
		int s = 0;
		while (k > 0) {
			s += k % 10;
			k = k / 10;
		}
		System.out.println("suma: " + s);

		stelute(200);
	}

	// ex 1
	public static int factorial(int n) {
		System.out.println("factorial de " + n);
		if (n == 0) {
			return 1;
		}
		return n * factorial(n - 1);
	}

	// ex 3
	public static int fibonacci(int n) {
		if (n == 1) {
			return 1;
		}
		if (n == 0) {
			return 0;
		}
		return fibonacci(n - 1) + fibonacci(n - 2);
	}

	// ex 5
	public static int triangle(int n) {
		if (n == 1) {
			return 1;
		}
		return n + triangle(n - 1);
	}

	// ex 6
	public static int sumDigits(int n) {
		if (n == 0) {
			return 0;
		}
		return n % 10 + sumDigits(n / 10);
	}

	// ex 9
	public static int powerN(int n, int p) {
		if (p == 0) {
			return 1;
		}
		return n * powerN(n, p - 1);
	}

	// ex 11
	public static boolean array6(int[] array, int index) {
		if (index < 0 || index >= array.length) {
			return false;
		}
		if (array[index] == 6) {
			return true;
		}
		return array6(array, index + 1);
	}

	// ex 12
	public static void stelute(int n) {
		if (n <= 1) {
			System.out.println("*");
			return;
		}
		for (int i = 0; i < n; i++) {
			System.out.print("*");
		}
		System.out.println();
		stelute(n - 1);
	}

}
