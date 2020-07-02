// 정규직 직원을 나타낸다
public class RegEmployee extends Employee{
	protected double yearlySalary;	// 연봉
	protected double bonusRate;		// 보너스 지급률

	// 정규직 직원의 이름, 소속부서, 연봉과 보너스 지급률을
	// 각각 주어진 값으로 초기화하면서 RegEmployee 객체를 생성한다
	public RegEmployee (String name, String department, double yearlySalary, double bonusRate) {
			// 여기에 코드를 입력하세요
			super(name, department);
			this.yearlySalary = yearlySalary;
			this.bonusRate = bonusRate;
	}
	// 정규직 직원의 월급을 계산한다
	public double pay(){
	// 여기에 코드를 입력하세요
		return this.yearlySalary / 12.0 * (1+this.bonusRate);
	}
	
	// 정규직 직원의 모든 데이터를 반환한다
	public String toString() {
		// 여기에 코드를 입력하세요
		String str = "이름: " + this.name + " 소속부서: "+ this.department + " 연봉: " + this.yearlySalary + " 보너스 지급률: " + this.bonusRate;
		return str;
	}
	
}
