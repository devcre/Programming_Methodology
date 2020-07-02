public class Graduate extends Student{
	private String tatype;	//조교 유형 : education, Research
	private double scholarshipRate;//장학금 비율 :  0~1사이
	
	//대학원생의 이름, 학번을 각각 주어진 값으로 초기화 하면서 객체를 생성
	public Graduate(String Name, int Number,String Tatype,double ScholarshipRate) {
		super(Name,Number);
		tatype= Tatype;
		scholarshipRate=ScholarshipRate;
	}
	public void setTatype(String newTatype) {
		tatype = newTatype;
	}
	public void setScholarshipRate(double newScholarshipRate) {
		scholarshipRate = newScholarshipRate;
	}
	public String toString() {
		return "이름: "+getName()+",학번: "+getNumber()+", 조교 유형: "+tatype+", 장학금 비율: "+scholarshipRate;
	}
	
		public String getTatype() {
    return tatype;
	}
	
	//장학금 비율을 반환한다
	public double getScholarshipRate() {
    return scholarshipRate;
	}
}
