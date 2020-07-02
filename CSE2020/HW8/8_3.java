// 다음 MyArray 인터페이스를 상속받는 문자열 배열 StringArray 클래스를 구현하라.

// interface MyArray {
//    int length(); // 현재 배열에 저장된 개수 리턴
//    int capacity(); // 배열의 전체 저장 가능한 개수 리턴
//    String get_remove(int index); // index에 해당하는 값 반환후, 배열에서 해당 값 없애기.  
//    boolean set(String val, int index); // index에 해당하는 값으로 val 저장
// }

// 배열은 항상 빈칸이 없도록 유지되어야 한다. 
// get_remove 함수는 index를 인덱스로 갖는 값을 반환하고, 그 값을 배열에서 없앤다. 
// index 보다 큰 수를 인덱스로 갖는 값들을 한칸씩 앞으로 당겨야 한다.

interface MyArray {
   int length(); // 현재 배열에 저장된 개수 리턴
   int capacity(); // 배열의 전체 저장 가능한 개수 리턴
   String get_remove(int index); // index에 해당하는 값 반환후, 배열에서 해당 값 없애기.  
   boolean set(String val, int index); // index에 해당하는 값으로 val 저장
}

class StringArray implements MyArray {
   private int max_num; // 저장 가능한 값 개수
   private int num; // 저장한 값 개수
   private String[] arr;
   
   public StringArray(int maxNum) {
      // fill here!
      this.max_num = maxNum;
      this.num = 0;
      this.arr = new String[this.max_num];
   }
   
   public int length() {
      // fill here!
      return this.num;
   }
   public int capacity() {
      // fill here!
      return this. max_num;
   }
   public String get_remove(int index) {
      // fill here!
      String whatwas = this.arr[index];
      this.arr[index] = "";
      this.max_num += 1;
      this.num -= 1;
      
      for(int i=0; i<this.length(); i++){
        this.arr[i] = this.arr[i+1];
      }
      return whatwas;
   }
   
   public boolean set(String val, int index) {
      // fill here!
      this.arr[index] = val;
      this.max_num -= 1;
      this.num += 1;
      
      if(arr[index] == val){
        return true;
      }
      else{
        return false;
      }
   }
}

class Main {
  public static void main(String[] args) {
    MyArray arr = new StringArray(100);
    arr.set("a", 0);
    arr.set("b", 1);
    arr.set("c", 2);
    System.out.println(arr.get_remove(0));//a
    System.out.println(arr.get_remove(0));//b
    
  }
}