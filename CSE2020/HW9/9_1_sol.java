class Main {
  
	public static String len_check(String str) {
		if (str == null) {
	    throw new RuntimeException("null");
	  }
	  else if (str.length() > 20) {
	    throw new RuntimeException("More than 20 words");
	  }
	  else return str; 
	}

	public static void main(String[] args) {

		System.out.println(len_check("abcdefghijklmnopqrsu"));
		System.out.println(len_check("abcdefghijklmnopqrsuv"));

	}
}