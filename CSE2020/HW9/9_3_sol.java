class Main {

	public static int string_sum(String str) {
		int sum = 0;
		String[] array = str.split(" ");
		for (int i = 0; i < array.length; i++) {
			try {
				sum += Integer.parseInt(array[i]);
			} catch (NumberFormatException e) {
				return 0;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "100 q 300";
		System.out.println(string_sum(a));
				
	}
}