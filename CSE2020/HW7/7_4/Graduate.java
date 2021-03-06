public class Graduate extends Student{
	private String tatype;	        //조교 유형
	private double scholarshipRate; //장학금 비율 
	
	//대학원생의 이름, 학번 조교 유형, 장학금 비율
	// 각각 주어진 값으로 초기화 하면서 객체를 생성
	public Graduate(String Name, int Number, String Tatype,double ScholarshipRate) {
    //여기에 코드를 입력하세요
    super(Name, Number);
    this.tatype = Tatype;
    this.scholarshipRate = ScholarshipRate;
	}
	//조교 유형 변경
	public void setTatype(String newTatype) {
    //여기에 코드를 입력하세요
    this.tatype = newTatype;
	}
	//장학금 비율 변경
	public void setScholarshipRate(double newScholarshipRate) {
    //여기에 코드를 입력하세요
    this.scholarshipRate = newScholarshipRate;
	}
		// 조교 유형을 반환한다
	public String getTatype() {
    //여기에 코드를 입력하세요
    return this.tatype;
	}
	
	//장학금 비율을 반환한다
	public double getScholarshipRate() {
    //여기에 코드를 입력하세요
    return this.scholarshipRate;
	}
	
		// 대학원생의 모든 데이터를 반환한다.
	public String toString() {
    //여기에 코드를 입력하세요
    String str = "이름: " + this.getName() + " 학번: " + this.getNumber() + " 조교 유형: " + this.tatype + " 장학금 비율: " + this.scholarshipRate;
    return str;
	}
}
