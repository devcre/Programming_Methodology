public class LetterGradeCourse extends Course {
	int assignScore; // 과제 점수
	int examScore; // 시험 점수

	// 문자 학점 교과목의 변수들 값을 주어진 값들로 초기화한다
	public LetterGradeCourse(String cname) {
		super(cname);
		this.assignScore=0;
		this.examScore=0;
		this.attendScore= 0;
	}

	// 교과목의 과제 점수를 반환한다
	public int getAssignScore() {
		return assignScore;
	}
	
	// 교과목의 시험 점수를 반환한다
	public int getExamScore() {
		return examScore;
	}
	
	//교과목의 총점을 계산하여 반환한다
	public double getTotal() {
		return attendScore*0.2 + assignScore*0.3 + examScore*0.5;
	}
	
	// 교과목의 학점을 반환한다
	public String getGrade() {
		if (getTotal()>=90) {
			return "A";
		}else if(getTotal()>=80) {
			return "B";
		}else if(getTotal()>=70) {
			return "C";
		}else if(getTotal()>=60) {
			return "D";
		}else {
			return "F";
		}
	}
	
	// 교과목의 이름, 출석 점수, 과제 점수와 시험 점수를 반환한다.
	public String toString(){
		return "교과목 이름: "+ getCourseName()+ ", 출석점수: "+ getattendScore()+", 과제 점수: "+getAssignScore() +", 시험 점수:"+getExamScore();
	}

	// 교과목의 과제 점수를 변경한다
	public void setAssignScore(int newAssignScore) {
		assignScore= newAssignScore;

	}
	// 교과목의 시힘 점수를 변경한다
	public void setExamScore(int newexamScore) {
		examScore = newexamScore;
		// 여기에 코드를 입력하세요
	}

}