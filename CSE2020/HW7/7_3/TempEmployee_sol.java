// 계약직 직원을 나타낸다.
public class TempEmployee extends Employee{
	// 계약직 직원에 대한 객체 변수들을 선언한다
	protected double payRate;	// 시간당 임금
	private int hoursWorked;	// 근무 시간

	// 계약직직원의 이름, 소속부서, 시간담 임금을 주어진 값으로 초기화하고
	// 근무 시간은 0으로 초기화 하면서 TempEmployee 객체를 생성한다
	public TempEmployee(String name, String department, double payRate){
		super(name,department);
		this.payRate=payRate;
		this.hoursWorked=0;
	}
	// 계약직 직원의 월급을 계산한다
	public double pay(){
		double monthlySalary= payRate * hoursWorked;
		hoursWorked=0;
		return monthlySalary;
	}
	// 계약직 직원의 추가 근무시간을 누적된 근무시간에 더한다
	public void addHours (int moreHours){
		hoursWorked += moreHours;
	}
	//근무 시간을 반환한다.
	public int getHoursworked() {
		return hoursWorked;
	}
	// 계약직 직원의 모든 데이터를 반환한다
	public String toString() {
		return "직원의 이름 : "+getName() +", 소속 부서: "+getDepartment()+", 시간당 임금: "+payRate+", 근무 시간: "+hoursWorked ;
	}

}
