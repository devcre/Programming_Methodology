// Employee.java
// 직원을 나타낸다
public class Employee {
	public String name;			 // 이름
	public String department;	 // 소속부서
	
	// 직원의 이름과 소속부서를 각각 주어진 값으로 초기화 하면서
	// 새로운 Employee 객체를 생성한다.
	public Employee(String Name, String Department){
		//여기에 코드를 입력하세요
		this.name= Name;
		this.department =Department;
	}
	
	// 이름을 반환한다
	public String getName() {
		return name;
	}
	// 소속부서를 반환한다
	public String getDepartment() {
		return department;
	}
	// 이름을 변경한다
	public void setName(String Name) {
		this.name=Name;
	}
	
	// 소속부서를 변경한다
	public void setDepartment(String newDepartment) {
		this.department=newDepartment;
	}
	
}
