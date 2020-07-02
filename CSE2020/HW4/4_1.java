//  회사의 입사 지원 대상자의 등급을 지원자의 평점과 TOEIC 점수에 따라 다음과 같이 출력 하는 프로그램을 작성하라.
// 평점이 4.0 이상이고 TOEIC 점수가 700점 이상이면 'A'를 출력한다.
// 평점이 3.5 이상이고 4.0 미만이면서 TOEIC 점수가 700점 이상이면 'B'를 출력한다.
// 평점이 3.0 이상이고 3.5 미만이면서 TOEIC 점수가 700점 이상이면 'C'를출력한다.
// 평점이 3.0 미만이거나 TOEIC 점수가 700점 미만이면 'D'를 출력한다.
// 입사 지원 대상자의 평점과 TOEIC 점수는 키보드로부터 입력받아야한다.

// 입출력 예시
// grade: 3.8
// TOEIC score: 700
// B

import java.util.Scanner;
class Main {
  public static void main(String[] args) {
  		double grade; // 평점
  		
  		// 토익 점수를 저장하는 변수를 선언한다
  			// 여기에 코드를 삽입하세요
  		int TOEIC_score;
  		
  		// Scanner 객체를 생성하고 scan이 가리키게 한다
  		Scanner scan = new Scanner(System.in);
  		
  		//평점을 입력 받는다
	    System.out.print("grade:");
  		grade = scan.nextDouble();
  		
  		// 토익 점수를 입력 받는다
  		System.out.print("TOEIC score:");
  			// 여기에 코드를 삽입 하세요
  		TOEIC_score = scan.nextInt();
  		
  		// 평점과 토익 점수에 따라 적절한 메시지를 출력한다
  			// 여기에 코드를 삽입하세요
  		if(grade >= 4.0 && TOEIC_score >= 700){
  		  System.out.print("A");
  		}
  		else if(grade >= 3.5 && grade < 4.0 && TOEIC_score >= 700){
  		  System.out.print("B");
  		}
  		else if(grade >= 3.0 && grade < 3.5 && TOEIC_score >= 700){
  		  System.out.print("C");
  		}
  		else{
  		  System.out.print("D");
  		}
  }
}