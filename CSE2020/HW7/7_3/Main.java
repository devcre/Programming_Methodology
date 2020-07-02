// 회사의 직원들을 관리하는 프로그램을 작성 하려고 한다. 직원은 정규직 직원과 계약직 직원으로 이루어진다. 모든 직원은 이름과 소속부서를 가진다.

// 1. 두 유형의 직원(정규직 직원과 계약직 직원)에 대한 상위 클래스 역할을 하는 Employee라는 클래스를 작성 하라. 
// - 직원의 이름과 소속부서를 각각 주어진 값으로 초기화하면서 Employee 객제를 생성할 수 있어야 한다. 
// - 직원의 이름을 알려 주어야 한다. 
// - 직원의 소속부서를 알려 주어야 한다. 
// - toString 함수는 직원의 이름과 소속부서를 한꺼번에 알려 주어야 한다. 
// - 직원의 이름과 소속부서를 각각 주어진 값으로 변경할 수 있어야 한다.

// 2. 정규직 직원을 냐타내는 RegEmployee라는 클래스를 작성하라. 
// - 정규직 직원은 추가적으로 연봉과 보너스 지급률을 가진다.
// - 정규직 직원의 이름 소속부서 연봉과 보너스 지급률을 각각 주어진 값으로 초기화하면서 RegEmployee 객체를 생성할 수 있어야 한다.
// - 정규직 직원의 월급을 계산해야 한다. 정규직 직원의 월급은 연봉/12 * (1 + 보너스 지급률)이다. 
// - 정규직 직원의 모든 데이터 (이름, 소속부서, 연봉과 보너스 지급률)를 한꺼번에 알려 주어야 한다.

// 3. 계약직 직원을 나타내는 TempEmployee라는 클래스를 작성하라. 
// - 계약직 직원은 추가적으로 시간당 임금과 근무시간을 가진다. 
// - 계약직 직원의 이 름, 소속부서, 시간당 임금을 주어진 값으로 초기화하고 근무 시간은 0으로 초기화하면서 TempEmployee 객체를 생성할 수 있어야 한다. 
// - 계약직 직원의 월급을 계산해야 한다. 계약직 직원의 월급은 시간당 임금 × 근무 시간이다. 
// - 계약직 직원의 월급을 계산한 후에 근무 시간은 0으로 초기화 되 어야 한다. 
// - 계약직 직원의 추가 근무시간을 념겨 받아 근무 시간에 더할 수 있어야 한다. 
// - 계약직 직원의 모든 데이터(이름, 소속부서,시간당 임금과 근무시간)를 한꺼번에 알려 주어야 한다.


public class Main {

	public static void main(String[] args) {
		RegEmployee employeeOne; // RegEmployee 객체 잠조변수
		TempEmployee employeeTwo; // TempEmployee 객체 참조변수
		
		employeeOne = new RegEmployee("선미","마케팅",6000, 0.4);
		System.out.println(employeeOne.toString());
		//직원의 이름 : 선미, 소속 부서: 마케팅, 연봉: 6000.0, 보너스 지급률: 0.4
		System.out.println(employeeOne.pay());
		//700.0
		
		employeeTwo = new TempEmployee("지나", "연구개발", 1);
		System.out.println(employeeTwo.getHoursworked());
		//0
		employeeTwo.addHours(300);
		System.out.println(employeeTwo.getHoursworked());
		//300
		
		System.out.println(employeeTwo.toString());
		//직원의 이름 : 지나, 소속 부서: 연구개발, 시간당 임금: 1.0, 근무 시간: 300
		System.out.println(employeeTwo.pay());
		//300.0
		System.out.println(employeeTwo.toString());
		//직원의 이름 : 지나, 소속 부서: 연구개발, 시간당 임금: 1.0, 근무 시간: 0

	}

}
