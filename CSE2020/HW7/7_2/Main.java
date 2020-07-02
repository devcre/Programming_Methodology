// 대학교에서 개설되는 두 유형의 교과목을 모델하려고 한다. 교과목은 문자 학점 교과목과 학점 인정 교과목으로 나누어진다. 문자 학점 교과목은 A. B. C. D와 F 학점을 부여한다. 반면에 학점 인정 교과목은 수강 학점을 인정하는 CR 학점과 수강 학점을 인정하지 않는 NC 학점을부여한다.

// 1. 교과목을 모델하는 Course 클래스를 작성하라.
// - 모든 교과목은 이름과 출석 점수를 가진다. 
// - 교과목의 이름을 주어진 값으로 초기화하고 Course 객체를 생성힐 수 있어야 한다.
// - 교과목의 이름과 출석 점수를 각각 알려 주어 야 한다. 
// - 교과목의 학점인 ‘I’를 반환 해야 한다. 
// - toString 함수는 교과목의 이름과 출석 점수를 한꺼번에 알려 주어야 한다.
// - 교과목의 이름과 출석 점수를 각각 주어진 값으로 변경 할 수 있어야 한다.

// 2. 문자 학점 교과목을 모델하는 LetterGradeCourse라는 클래스를 작성하라.
// - 문자 학점 교과목은 추가적으로 과제 점수와 시험 점수를 가진다.
// - 문자 학점 교과목의 이름을 주어진 값으로 초기화하고 출석 점수, 과제 점수와 시험 점수를 0으로 초기화하면
// 서 LetterGradeCourse 객제를 생성할 수 있어야 한다. 
// - 문자 학점 교과목의 과제 점수와 시험 점수를 각각 주어진 값으로 변경 할 수 있어야 한다.
// - 문자 학점 교과목의 과제 점수와 시험 점수를 각각 알려 주어야 한다. 
// - 문자 학점 교과목의 모든 데이터를 알려 주어야 한다. 
// - 문자 학점 교과목의 총점을 계산하여 반환해야 한다.
// - 총점에 출석 점수, 과제 점수와 시험 점수의 반영률은 각각 20%, 30%와 50%이다. 
// - 문자 학점 교과목의 학점을 반환해야 한다. 
// - 문자 학점 교과목의 총점에 기초한 학점 부여 기준은 다음과 같다.
//    • 총점이 90점 이상이면 학점은 A이다.
//    • 총점이 80점 이상이고 90점 미만이 면 학점은 B이다 .
//    • 총점이 70점 이상이고 80 점 미만이면 학점은 C이다 .
//    • 총점이 60점 이상이고 70점 미만이 면 학점은 D이다 .
//    • 총점이 60점 미만이면 학점은 F이다.

// 3. 학점 인정 교과목을 모하는 PassFail Course라는 클래스를 작성하라.
// - 학점 인정 교과목은 추가적으로 보고서 점수와 발표 점수를 가진다
// - 학점 인정 교과목의 이름을 주어진 값으로 초기화하고 출석 점수, 보고서 점수와 발표 점수를 0으로 초기화하면서 PassFaílCourse 객체를 생성할 수 있어야 한다.
// - 학점 인정 교과목의 보고서 점수와 발표 점수를 각각 주어진 값으로 변경할 수 있어야 한다. 
// - 학점 인정 교과목의 보고서 점수와 발표 점수를 각각 알려 주어야 한다.
// - 학점 인정 교과목의 모든 데이터를 알려 주어야 한다.
// - 학점 인정 교과목의 총점을 계산하여 반환해야 한다.
// - 총점에 출석 점수, 보고서 점수와 발표 점수의 반영률은 각각 20%, 60%와 20%이다.
// - 학점 인정 교과목의 학점을 반환해야 한다. 
// - 학점 인정 교과목의 총점에 기초한 학점 부여 기준은 다음과 같다.
//    • 총점이 60점 이상이면 학점은 CR이다.
//    • 총점이 60점 미만이면 학점은 NC이다.

class Main {
  public static void main(String[] args) {
		LetterGradeCourse courseOne;
		PassFailCourse courseTwo;
		String grade;
		
		courseOne = new LetterGradeCourse("Data structure");
		System.out.println(courseOne.toString());
		//교과목 이름: Data structure, 출석점수: 0, 과제 점수: 0, 시험 점수:0
		
		courseOne.setattendScore(95);
		courseOne.setAssignScore(98);
		courseOne.setExamScore(83);
		
		System.out.println(courseOne.toString());
		//교과목 이름: Data structur, 출석점수: 95, 과제 점수: 98, 시험 점수:83

		System.out.println(courseOne.getGrade());
	  //B
	  
		courseTwo = new PassFailCourse("Culture Seminar");
		System.out.println(courseTwo.toString());
		//교과목 이름: Culture Seminar, 출석점수: 0, 보고서 점수: 0, 발표 점수:0
		
		courseTwo.setattendScore(85);
		courseTwo.setReportScore(92);
		courseTwo.setPtScore(78);
		System.out.println(courseTwo.toString());
		//교과목 이름: Culture Seminar, 출석점수: 85, 보고서 점수: 92, 발표 점수:78
		
		System.out.println(courseTwo.getGrade());
		//CR
  }
}