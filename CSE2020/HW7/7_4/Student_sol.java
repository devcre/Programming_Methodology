public class Student {
	private String name; // 이름
	private int number; // 학번
	//이름을 기본 값으로 초기화하면서 Student 객체를 생성한다
	public Student() {
		name = "";
		number = 0;
	}
	//이름을 매개번수 값으로 초기화하면서 Student 객체를 생성한다
	public Student(String Name, int Number) {
		setName(Name);
		setNumber(Number);
	}

	// 이름을 반환한다
	public String getName() {
		return name;
	}
	//학번을 반환한다
	public int getNumber() {
		return number;
	}
	// 현 객체의 헌재 상태를 나타내는 문자열을 반환한다
	public String toString() {
		return ("이름" + name + " " + "학번" + number);
	}
	//현 객체의 현재 상태가 other 객체와 같은지 알려준다.
	public boolean equals(Student other) {
		return (this.name.equals(other.name)) && (this.number == other.number);
	}
	// 이름을 주어진 값으로 변경한다
	public void setName(String Name) {
		name = Name;
	}
	//학번을 주어진 값으로 변경한다
	public void setNumber(int Number) {
		number = Number;
	}
}