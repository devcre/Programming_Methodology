// 한 줄의 텍스트를 읽어 들인 후, 그 텍스트 안에 있는 정수의 합을 구하여 출력하는 함수를 작성하라.
// 여러개의 정수 문자들은 공백문자를 서로 사이에 두고 이어져 있다. 
// 이 때, 텍스트가 정수가 아닌 값들을 포함한다면 문자열 -> 정수 변환 과정에서 NumberFormatException이라는 예외가 발생할 것이다. 
// 이 예외가 발생해도 프로그램이 종료 되지 않고 함수는 0을 리턴하게 하라. 

class Main {
  public static int string_sum(String str) {
    // fill here!
    int newlen = 1;
    int total = 0;
    
    // 굳이 이런 짓을 할 필요가 없다.
    
    for(int j=0; j<str.length(); j++){
      if(str.charAt(j) == ' '){
        newlen += 1;
      }
    }
    
    String[] splStr = new String[newlen];
    splStr = str.split(" ");
    
    // 이 코드 한줄이면 된다.
    // String[] array = str.split(" ");
    
    try{
      for(int i=0; i<newlen; i++){
        total += Integer.parseInt(splStr[i]);
      }
    }
    
    catch (Exception e){
      System.out.println(e.getMessage());
      return 0;
    }
    
    return total;
	}

	public static void main(String[] args) {
		System.out.println(string_sum("100 q 300")); // 0
		System.out.println(string_sum("100 300")); // 400
	}
}