class Main {
public static int fact(int n) {
		try {
			if (n < 0)
				throw new IllegalArgumentException();
			else if (n <= 1)
				return n;
			else
				return fact(n - 1) * n;
		} catch (IllegalArgumentException e) {
			System.out.println("Negative numbers cannot be calculated");

		}
		return n;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fact(5));

	}

}