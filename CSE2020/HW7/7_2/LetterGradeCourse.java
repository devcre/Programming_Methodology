public class LetterGradeCourse extends Course {
	protected int assignScore; // 과제 점수
	protected int examScore; // 시험 점수
	
	// 문자 학점 교과목의 변수들 값을 주어진 값들로 초기화한다
	public LetterGradeCourse(String cname){
		super(cname);
		this.assignScore = 0;
		this.examScore = 0;
	}

	// 교과목의 과제 점수를 반환한다
	public int getAssignScore() {
		// 여기에 코드를 입력하세요
		return this.assignScore;
	}
	
	// 교과목의 시험 점수를 반환한다
	public int getExamScore() {
		// 여기에 코드를 입력하세요
		return this.examScore;
	}
	
	//교과목의 총점을 계산하여 반환한다
	public double getTotal() {
		// 여기에 코드를 입력하세요
		double total = this.attendScore*0.2 + this.assignScore*0.3 + this.examScore*0.5;
		return total;
	}
	// 교과목의 학점을 반환한다
	public String getGrade() {
		// 여기에 코드를 입 력 하세요
		String grade = "";
		double tScore = this.getTotal();
		
		if(tScore >= 90.0){
		  grade = "A";
		}
		else if(tScore >= 80.0 && tScore < 90.0){
		  grade = "B";
		}
		else if(tScore >= 70.0 && tScore < 80.0){
		  grade = "C";
		}
		else if(tScore >= 60.0 && tScore < 70.0){
		  grade = "D";
		}
		else{
		  grade = "F";
		}
		return grade;
	}
	
	// 교과목의 이름, 출석 점수, 과제 점수와 시험 점수를 반환한다.
	public String toString(){
		// 여기에 코드를 입력하세요
			String str = "교과목 이름: " + this.courseName + " 출석 점수: " + this.attendScore + " 과제 점수: " + this.assignScore + " 시험 점수: " + this.examScore;
		return str;
	}

	// 교과목의 과제 점수를 변경한다
	public void setAssignScore(int newAssignScore) {
		// 여기에 코드를 입력하세요
		this.assignScore = newAssignScore;
	}
	// 교과목의 시힘 점수를 변경한다
	public void setExamScore(int newexamScore) {
		// 여기에 코드를 입력하세요
		this.examScore = newexamScore;
	}

}