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
   public StringArray(int num) {
      this.max_num = num;
      arr = new String[max_num];
   }
   public int length() {
      return num;
   }
   public int capacity() {
      return max_num;
   }
   public String get_remove(int index) {
      if(index < 0 || index >= num)  return null;
      String s = arr[index]; 
      for (int i = index; i < num - 1; i++) {
        arr[i] = arr[i+1]; 
      }
      num--; 
      return s;
   }
   public boolean set(String val, int index) {
      if(index < 0 || index >= max_num)  return false;
      arr[index] = val; 
      num = 0 ;
      for (int i = 0; i < max_num; i++) {
        if (arr[i] != null) num++;
      }
      return true; 
   }
}

class Main {
  public static void main(String[] args) {
    MyArray arr = new StringArray(100);
    arr.set("a", 0);
    arr.set("b", 1);
    arr.set("c", 2);
    System.out.println(arr.get_remove(0));
    System.out.println(arr.get_remove(0));
    
  }
}