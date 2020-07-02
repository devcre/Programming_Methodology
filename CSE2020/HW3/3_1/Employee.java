// Employee.java 
// 직원을 나타낸다. 
public class Employee {
  private String name; // 이름 
  private int number; // 번호 
  private int age; // 나이 
  
  // 새로운 Employee 객체를 생성한다  
  public Employee() {
    this.name = "";
    this.number = 00;
    this.age = 0;
  }
  // 접근자 메소드 - 이름을 반환한다. 
  public String getName() {
    return name; 
  }
  // 접근자 메소드 - 번호를 반환한다. 
  public int getNumber() {
    // 여기에 코드를 삽입하세요. 
    return number;
  }
  // 접근자 메소드 - 나이를 반환한다. 
  public int getAge() {
    // 여기에 코드를 삽입하세요. 
    return age;
  }
  // 현 Employee 객체의 정보에 대한 문자열을 반환한다. 
  public String toString() {
    return "Name: " + name + "\n" + "Number: " + number + "\n" + "Age: " + age;
  }
  // 변경자 메소드 - 이름을 주어진 값으로 변경한다. 
  public void setName(String Name) {
    // 여기에 코드를 삽입하세요. 
    this.name = Name;
  }
  // 변경자 메소드 - 번호를 주어진 값으로 변경한다. 
  public void setNumber(int Number) {
    // 여기에 코드를 삽입하세요. 
    this.number = Number;
  }
  // 변경자 메소드 - 나이를 주어진 값으로 변경한다. 
  public void setAge(int Age) {
    // 여기에 코드를 삽입하세요. 
    this.age = Age;
  }
}