// 1. 학생을 나타내는 Student 클래스를 작성하라.
// - 모든 학생은 이름과 학번을 가진다
// - 학생의 이름과 학번을 각각 기본값으로 초기화 하면서 Student 객체를 생성 할 수있어야한다.
// - 또한 학생의 이름과 학번을 각각 주어진 값으로 초기화 하면서 Student 객체를 생성 할 수 있어야 한다.
// - 학생의 이름과 학번을 각각 알려주어야 한다.
// - toString 함수는 학생의 이름과 학번을 한꺼번에 알려 주어야 한다.
// - 학생의 이름과 학번을 각각 주어진 값으로 변경 할 수 있어야 한다.
// - 학생의 이름과 학번을 반환 할 수 있어야 한다.
// - 현 객체의 상태(이름,학번)가 다른 객체와 같은지 알 수 있어야 한다.

// 2. Student 클래스를 확장하여 Graduate라는 클래스를 작성하라.
// - 대학원생은 추가적으로 조교 유형과 장학금 비율을 가진다.
// - 대학원생의 조교 유형은 "education"과 "research"이다.
// - 장학금 비율은 0과 1사이 값이다.
// - 대학원생의 이름, 학번,조교 유형, 장학금 비율을 각각 주어진 값으로 초기화 하면서 Graduate 객체를 생성할 수 있어야 한다.
// - 대학원생의 모든 데이터(이름,학번,조교유형,장학금 비율)을 한꺼번에 알려 주어야 한다.
// - 대학원생의 조교 유형과 장학금 비율을 반환 할 수 있어야 한다.
// - 대학원생의 조교 유형과 장학금 비율을 각각 주어진 값으로 변경 할 수 있어야 한다.

class Main {
  public static void main(String[] args) {
    Graduate student1 = new Graduate("홍길동",2010123456,"education",0.5);
    System.out.println(student1.toString());
    //이름: 홍길동,학번: 2010123456, 조교 유형: education, 장학금 비율: 0.5
    
  	student1.setScholarshipRate(0.5);
		student1.setTatype("research");
		System.out.println(student1.toString());
		Graduate student2 = new Graduate("홍길동",2010123456,"education",1);
		//이름: 홍길동,학번: 2010123456, 조교 유형: research, 장학금 비율: 0.5
		
		System.out.println(student2.equals(student1));
		//true
  
  }
}