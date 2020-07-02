class Main {
  public static int longest_incseq(int[] arr) {
    // fill here! 
    int last = 0; 
    int result = 0; 
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] >= last) {
        last = arr[i]; 
        result++; 
      }
    }
    return result;
  }
  public static void main(String[] args) {
    int[] arr = {10, 20, 10, 30, 20, 50};
    System.out.println(longest_incseq(arr)); // 4
  }
}