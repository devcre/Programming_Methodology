// 영어 단어를 입력으로 받고, 그 단어 안에 있는 각 문자의 빈도수를 출력하는 함수 get_word_count를 작성하라.

// 1. 각 문자의 빈도수는 배열안에 저장 되고 반환되어야 한다. 

// 2. 받아 들인 단어는 먼저 모두 대문자로 변환 되어야 한다.

// 3. 다음으로 각 문자는 배열의 지수로 사용되기 위해 0이상 25이하의 정수로 전환 된다.
// 이는 각 대문자에서 'A'를 뺌으로써 수행된다. 예를 들면, 대문자 'C'는 'C' -'A' =2 이므로 2로 바뀐다.

// 4. 읽어 들인 단어가 대문자나, 소문자가 아닌 문자를 포함해도 프로그램이 문제없이 돌아야 한다. 


// 출력 예시.
// System.out.println(word_count("AB-++d",word_count));

// Not lowercase / uppercase
// Not lowercase / uppercase
// Not lowercase / uppercase
// 3

// for (int i = 0; i < word_count.length; i++)
//      System.out.print((char) ('A' + i) + ":" + word_count[i] + " ");
    
// A:1 B:1 C:0 D:1 E:0 F:0 G:0 H:0 I:0 J:0 K:0 L:0 M:0 N:0 O:0 P:0 Q:0 R:0 S:0 T:0 U:0 V:0 W:0 X:0 Y:0 Z:0

class Main {
  
  public static int[] get_word_count(String word) {
  		int[] word_count = new int[26];
  		int len = word.length();
  		byte[] conv_word = new byte[len];
  		int i;
  		int range;
			// fill here!
			
			word = word.toUpperCase();
			
			for(i=0; i<len; i++){
			  conv_word[i] = (byte)word.charAt(i);
			}
			
			for(i=0; i<len; i++){
			  range = conv_word[i] - (byte)'A';
			  if(range >= 0 && range <= 25){
			    word_count[range] += 1;
			  }
			}
		  return word_count;	
	}
	
	public static void main(String[] args) {

		int[] word_count = get_word_count("AB-++d");
		for (int i = 0; i < word_count.length; i++)
			System.out.print((char) ('A' + i) + ":" + word_count[i] + " ");
    //A:1 B:1 C:0 D:1 E:0 F:0 G:0 H:0 I:0 J:0 K:0 L:0 M:0 N:0 O:0 P:0 Q:0 R:0 S:0 T:0 U:0 V:0 W:0 X:0 Y:0 Z:0 

	}
}