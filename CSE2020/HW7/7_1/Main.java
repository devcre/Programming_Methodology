// 1. 애완동물을 나타내는 Pet이라는 클래스를 작성하라. 모든 애완동물은 이름과 나이를 가진다. 
// -애완동물의 이름과 나이를 각각 기본 값으로 초기화하면서 Pet 객체를 생성할 수 있어야 한다.
// -또한 애완동물의 이름과 나이를 각각 주어진 값으로 초기화하면서 Pet 객체를 생성할 수 있어야 한다. 
// -애완동물의 이름과 나이를 각각 알려 주어야 한다.
// -toString 함수는 애완동물의 이름과 나이를 한꺼번에 알려 주어야 한다.
// -애완동물의 이름과 나이를 각각 주어진 값으로 변경할 수 있어야 한다.


// 2. Pet 클래스를 확장하여 개를 나타내는 Dog라는클래 스를 작성하라.
// -개는 추가적으로 품종과 예방주사 접종여부와 같은 속성을 가진다.
// -개가 예방주사를 맞았으면 예방주사 접종여부는 true이고 아니면 false이다.
// -개의 이름 나이와 품종은 각각 기본 값으로 초기화하고 예방주사 접종여부는 false로 초기화하면서 Dog 객체를 생성할 수 있어야 한다.
// -또한 개의 이름, 나이, 품종을 각각 주어진 값으로 초기화하고 예방주사 접종여부는 false로 초기화하면서 Dog 객제를 생성할 수 있어야 한다.
// -개의 품종과 예방주사 접종여부를 각각 알려 주어야 한다.
// -개의 모든 데이터 를 한꺼번에 알려 주어야 한다. 
// -개의 품종과 예방주사 접종여부를 각각 주어진 값으로 변경할 수 있어야 한다.

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String shotAnswer;	// 예방주사 접종여부 입력 값
		String dogName; 	  // 개 이름
		int dogAge; 	  	  // 개 나이
		String dogBreed; 	  // 개 품종
		boolean dogShot; 	  // 예방주사 접종여부
		

		Dog Dog1 = new Dog();
		System.out.println(Dog1.toString());
		//이름: , 나이: 0, 품종: , 접종여부: false
		
		Dog1.setName("haru");
		Dog1.setAge(3);
		Dog1.setBreed("Jindo");
		Dog1.setboostreShot(true);
		System.out.println(Dog1.toString());
		//이름: haru, 나이: 3, 품종: Jindo, 접종여부: true
		
		Dog Dog2 = new Dog("dangdang",4,"poodle");
		System.out.println(Dog2.toString());
		//이름: dangdang, 나이: 4, 품종: poodle, 접종여부: false
	}
}



