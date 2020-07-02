//  한 대학생의 총 이수학점과 TOEIC 점수를 입력 받아 졸업 혹은 수료 여부를 알려 주는 프로그램을 작성하라.
// 대학의 졸업 요건은 다음과 같다.
// 총 이수학점이 140 이상이고 TOEIC 점수가 700 이상이면 'graduation'을 출력한다.
// 총 이수학점이 140 이상이나 TOEIC 점수가 700 미만이면 'completion'을 출력한다.
// 총 이수학점이 140 미만이면 'failure'을 출력한다

// 입출력 예시
// total credit: 140
// TOEIC score: 700
// graduation

import java.util.Scanner;
class Main {
  public static void main(String[] args) {
		int totalcreditearned; // 총 이수학점
		// 토익 점수를 저장하는 변수를 선언한다
			//여기에 코드를 삽입하세요
		int TOEIC_score;
		
		// Scanner 객체를 생성하고 scan이 가리키게 한다
		Scanner scan = new Scanner(System.in);
		
		System.out.print("total credit:");
			// 여기에 코드를 삽입하세요
		totalcreditearned = scan.nextInt();
		System.out.print("TOEIC score:");
			// 여기에 코드를 삽입하세요
		TOEIC_score = scan.nextInt();
		
		// 총 이수학점과 TOEIC 점수에 따라 졸업/수료/졸업불가 여부를 출력한다
			// 여기에 코드를 삽입하세요
		if(totalcreditearned >= 140 && TOEIC_score >= 700){
		  System.out.print("graduation");
		}
		else if(totalcreditearned >= 140 && TOEIC_score < 700){
		  System.out.print("completion");
		}
		else{
		  System.out.print("failure");
		}
  }
}