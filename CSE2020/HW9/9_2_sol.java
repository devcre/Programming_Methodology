class Main {
public static int[] word_count = new int[26];
	
	public static int[] get_word_count(String word) {
	  int[] word_count = new int[26];
		word = word.toUpperCase();
		for (int i = 0; i < word.length(); i++) {
			try {
				if (!(word.charAt(i) - 'A' < 0 || word.charAt(i) - 'A' > 25))
				  word_count[word.charAt(i) - 'A']++;
					//throw new Exception("Not lowercase / uppercase");
				
			} catch (Exception e) {
			  System.out.println(e.getMessage());
			}
		}
		return word_count;
	}

	public static void main(String[] args) {
		
		int[] word_count = get_word_count("AB-++d");
		
		for (int i = 0; i < word_count.length; i++)
			System.out.print((char) ('A' + i) + ":" + word_count[i] + " ");

	}
}