class Main {
  public static String[] getSuffixArray (String s) {
    // fill here!
    String[] result = new String[s.length()];
    for (int i = 0; i < s.length(); i++) {
      result[i] = s.substring(i, s.length()); 
    }
    return result; 
  }
  public static void main(String[] args) {
    String[] suffix_arr = getSuffixArray("program "); 
    for (int i = 0; i < suffix_arr.length; i++) {
      System.out.println(suffix_arr[i]); // program, rogram, ogram, gram, ram, am, m
    }
  }
}