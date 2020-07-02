// 다음과 같이 직각 삼각형 모양을 출력하는 프로그램을 작성하세요. 

// *
// **
// ***
// ****

class Main {
  public static void main(String[] args) {
    for(int i=1; i<5; i++){
      for(int j=0; j<i; j++){
        System.out.print("*");
      }
      System.out.print("\n");
    }
  }
}