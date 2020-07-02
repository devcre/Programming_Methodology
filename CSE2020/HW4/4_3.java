// 한 대학생이 이번 학기에 프로그래밍 과목을 수강하고 있다.
// 이 과목의 성적 평가 요소는 출석, 과제, 수시 시험, 중간시험과 기말시험이다.
// 각 평가 요소의 반영률은 출석 10%, 과제 40%, 수시시험 10%, 중간시험 20%, 기말시험 20%이다.
// 이 과목의 학점은 다음과 같은 기준에 의해 주어진다

// 학점     총점
//  A      90 ~ 100 
//  B      80 ~ 89
//  C      70 ~ 79
//  D      60 ~ 69
//  F       0 ~ 59

// 이 학생의 각 평가 요소 점수를 입력 받아 총점을 계산하고 학점을 부여하는 프로그램을 작성하라.

// 입출력 예시
// attendance score:94
// assignment score:88
// quiz score:82
// midterm exam score:75
// final exam score:98
// total score:87.4
// grade:B

import java.util.Scanner;
class Main {
  public static void main(String[] args) {
		// 한 과목의 평가 요소들의 점수들을 저장하는 변수들을 선언한다
		int attendScore;
		int assignmentScore;
		int quizScore;
		int midtermexamScore;
		int finalexamScore;
		// 총점을 저장하는 변수를 선언한다
			// 여기에 코드를 삽입하세요
		double totalScore;

		//학점을 저장하는 변수를 선언한다
			//여기에 코드를 삽입하세요
		char grade;
		
		// 키보드로부터 입력하는 데이터를 읽기 위한 Scanner 객체를 만든다.
		Scanner scan = new Scanner(System.in);
		
		// 사용자로부터 각 평가 요소의 점수를 한 번에 하나씩 입력하라고 요청한다.
		// 그리고 입력된 점수를 읽는다.
	  System.out.print("attendance score:");
		// 여기에 코드를 삽입하세요
		attendScore = scan.nextInt();
		System.out.print("assignment score:");
		// 여기에 코드를 삽입하세요
		assignmentScore = scan.nextInt();
		System.out.print("quiz score:");
		// 여기에 코드를 삽입하세요
		quizScore = scan.nextInt();
		System.out.print("midterm exam score:");
		// 여기에 코드를 삽입하세요
		midtermexamScore = scan.nextInt();
		System.out.print("final exam score:");
		// 여기에 코드를 삽입하세요
		finalexamScore = scan.nextInt();
				
		// 총점을 계산한다
			// 여기에 코드를 삽입하세요
		totalScore = (double)attendScore * 0.1 + (double)assignmentScore * 0.4 + (double)quizScore * 0.1 + (double)midtermexamScore * 0.2 + (double)finalexamScore * 0.2;
		
		// 학점을 결정한다
			// 여기에 코드를 삽입하세요
		if(totalScore >= 90.0){
		  grade = 'A';
		}
		else if(totalScore >= 80.0 && totalScore < 90.0){
		  grade = 'B';
		}
		else if(totalScore >= 70.0 && totalScore < 80.0){
		  grade = 'C';
		}
		else if(totalScore >= 60.0 && totalScore < 70.0){
		  grade = 'D';
		}
		else{
		  grade = 'F';
		}
		// 총점과 학점을 출력한다
		System.out.println("total score:" + totalScore);
		System.out.println("grade:" + grade);
  }
}