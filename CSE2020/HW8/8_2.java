// 추상 클래스 Converter는 단위를 변환하는데 필요한 것들을 구성하고 있다. 

// Converter 클래스를 상속받아 
// 원화를 달러로 변환하는 Won2Dollar 클래스
// km를 mile(마일)로 변환하는 Km2Mile 클래스
// 를 작성하세요. 

// main 함수를 실행하면 다음의 결과가 나와야 한다.
// convert 2400.0 won to dollar
// 2.0 dollar
// convert 3.2 km to mile
// 2.0 mile

abstract class Converter {
   abstract protected double convert(double src); // 추상 메소드
   abstract protected String getSrcString(); // 추상 메소드
   abstract protected String getDestString(); // 추상 메소드
   protected double ratio; // 비율
   public double run(double val) {
      System.out.println("convert " + val + " " + getSrcString()+" to "+getDestString());
      double res = convert(val);
      System.out.println(res + " " + getDestString());
      return res; 
   }
}

class Won2Dollar extends Converter {
   // fill here!
  protected double oneUSD;
  
  public Won2Dollar(double won){
    this.oneUSD = won;
  }
  
  protected double convert(double won){
    return won / this.oneUSD;
  }
  
  
  protected String getSrcString(){
    return "won";
  }
  
  protected String getDestString(){
    return "dollar";
  }
  
}

class Km2Mile extends Converter {
  // fill here!
  protected double oneMile;
  
  public Km2Mile(double km){
    this.oneMile = km;
  }
  
  protected double convert(double km){
    return km / this.oneMile;
  }
  
  protected String getSrcString(){
    return "km";
  }
  
  protected String getDestString(){
    return "mile";
  }
  
}

class Main {
  public static void main(String[] args) {
    Won2Dollar toDollar = new Won2Dollar(1200); // 1달러는 1200원
    toDollar.run(2400);
    Km2Mile toMile = new Km2Mile(1.6); // 1마일은 1.6km
    toMile.run(3.2);
  }
}