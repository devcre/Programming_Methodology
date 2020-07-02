// 주어진 문장 내에 있는 글자들의 수를 출력하는 프로그램을 작성하라.
// 입력 받은 문장 내에 마침표(.), 물음표(?), 쉽표(,)와 느낌표(!)와 같은 구두점은 없다고 가정한다. 
// 문장 내에 있는 글자들의 수에 빈 칸, 빈 줄,탭 (tab)과 같은 흰색 공간문자는 포함되지 않는다.

// 다음은 모범 출력이다.

// Please enter a sentence:i like	fall
// 

import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    System.out.print("Please enter a sentence:");
  	Scanner scan = new Scanner(System.in);
    
    //여기에 코드를 입력하세요
    int number = 0;
    String string = "";
    String ptr = "";
    String blank = " ";
    String bline = "\n";
    String btab = "\t";
    
    string = scan.nextLine();
    ptr = string.substring(0, 1);
    
    for(int i=0; i<string.length(); i++){
      if((ptr.equals(blank) == false) && (ptr.equals(bline) == false) && (ptr.equals(btab) == false)){
        number += 1;
      }
      ptr = string.substring(i, i+1);
    }
    
    System.out.println(number);
  }
}