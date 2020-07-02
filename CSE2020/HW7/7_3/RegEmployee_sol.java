// 정규직 직원을 나타낸다
public class RegEmployee extends Employee{
	protected double yearlySalary;	// 연봉
	protected double bonusRate;		// 보너스 지급률

	// 정규직 직원의 이름, 소속부서, 연봉과 보너스 지급률을
	// 각각 주어진 값으로 초기화하면서 RegEmployee 객체를 생성한다
	public RegEmployee (String name, String department, double yearlySalary, double bonusRate) {
		super(name,department);
		this.yearlySalary=yearlySalary;
		this.bonusRate=bonusRate;
	}
	// 정규직 직원의 월급을 계산한다
	public double pay(){
		return (yearlySalary/12) *(1+bonusRate);
	}
	
	// 정규직 직원의 모든 데이터를 반환한다
	public String toString() {
		return "직원의 이름 : "+getName() +", 소속 부서: "+getDepartment()+", 연봉: "+yearlySalary+", 보너스 지급률: "+bonusRate ;
	}
	
}
