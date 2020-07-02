// 정수를 입력받아 그 정수들의 계승(factorial)값들을 계산하여 출력하는 프로그램을 작성하라.
// 한 정수의 계승은 음수에 대해서는 정의 되지 않는다.
// 따라서 음수가 입력 된다면 프로그램이 정상 작동 되어서는 안된다.
// 이 경우 IllegalArgumentException 예외가 발생 되게 하라.
// 이 예외가 발생 하면 프로그램이 종료 되지 않고, "Negative numbers cannot be calculated" 라는 오류 메세지를 출력하게 하라.

class Main {
  public static int fact(int n) {
		
		try {
		  // fill here!
		  if(n < 0){
		    throw new IllegalArgumentException("Negative numbers cannot be calculated");
		    // 혹은 throw new IllegalArgumentException();
		  }
		  else{
		    for(int i=n-1; i>0; i--){
		      n *= i;
		    }
		  }
		} 
		catch (IllegalArgumentException e) {
		  // fill here!
		  System.out.println("Negative numbers cannot be calculated");
		}
		
		return n;
	}

	public static void main(String[] args) {
	  System.out.println(fact(5));
	  //120
	  
		System.out.println(fact(-5));
		//Negative numbers cannot be calculated
    //-5


	}
}