// 접미사 배열은 문자열 s의 모든 접미사를 사전순으로 정렬해 놓은 배열이다.
// program 의 접미사는 program, rogram, ogram, gram, ram, am, m 으로 총 7개가 있다.
// 문자열 s가 주어졌을 때, 접미사 배열을 반환하는 함수를 작성하라. 
// 단, 접미사 배열의 원소 순서는 길이가 긴 것부터 짧은 순으로 한다.  

class Main {
  public static String[] getSuffixArray (String s) {
    // fill here!
    int length_of_s = s.length();
    String[] suffixArray = new String[length_of_s];
    
    suffixArray[0] = s;
    for(int j=1; j<length_of_s; j++){
      suffixArray[j] = s.substring(j);
    }
    return suffixArray;
  }
  public static void main(String[] args) {
    String[] suffix_arr = getSuffixArray("program"); 
    for (int i = 0; i < suffix_arr.length; i++) {
      System.out.println(suffix_arr[i]); // program, rogram, ogram, gram, ram, am, m
    }
  }
}