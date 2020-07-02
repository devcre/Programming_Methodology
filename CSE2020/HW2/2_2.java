// 사용자로부터 길이가 3인 문자열을 입력받아 역순으로 출력하는 프로그램을 작성하세요. 
// 입출력 예시: 
// 길이가 3인 문자열 입력: 프설방
// 방설프

import java.util.Scanner; 

class Main {
  public static void main(String[] args) {
    String str = "";  // 입력받는 문자열 
    String outputStr = ""; //출력 문자열 
    Scanner scan = new Scanner(System.in);
    str = scan.next(); // 문자열 입력받기 
    // 여기에 코드를 입력하세요. 
    for(int i=3; i>0; i--){
      outputStr += str.charAt(i-1);
    }
    
    System.out.println(outputStr);
  }
}