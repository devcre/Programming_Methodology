// 상속을 이용하여 다음 코드를 간결한 구조로 재작성하세요. 

// class SharpPencil { // 샤프펜슬
//    private int width; // 펜의 굵기
//    private int amount; // 남은 량
//    public int getAmount() { return amount; }
//    public void setAmount (int amount) { this.amount = amount; }
// }

// class Ballpen  { // 볼펜
//    private int amount; // 남은 량
//    private String color; // 볼펜의 색
//    public int getAmount() { return amount; }
//    public void setAmount (int amount) { this.amount = amount; }
//    public String getColor() { return color; }
//    public void setColor(String color) { this.color = color; }
// }

// class FountainPen { // 만년필
//    private int amount; // 남은 량
//    private String color; // 볼펜의 색
//    public int getAmount() { return amount; }
//    public void setAmount (int amount) { this.amount = amount; }
//    public String getColor() { return color; }
//    public void setColor(String color) { this.color = color; }
//    public void refill (int n) { setAmount(n); }
// }

class Pen { // 모든 펜의 공통 속성
  private int amount; // 남은 량
  public int getAmount() { return amount; }
  public void setAmount (int amount) { this.amount = amount; }
  
}
class SharpPencil extends Pen{ // 샤프펜슬
  // fill here!
  private int width;
  
  public int getWidth(){
    return this.width;
  }
  
  public void setWidth(int newWidth){
    this.width = newWidth;
  }
} 

class Ballpen extends Pen { // 볼펜
  // fill here!
  private String color;
  
  public String getColor(){
    return this.color;
  }
  
  public void setColor(String color){
    this.color = color;
  }
}
class FountainPen extends Ballpen{ // 만년필
  // fill here!
  
  public void refill(int n){
    super.setAmount(n);
  }
}

class Main {
  public static void main(String[] args) {
    Pen fp = new FountainPen();
    fp.setAmount(1);
    System.out.println(fp.getAmount()); // 1 
  }
}