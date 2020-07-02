// 정수 배열인 수열이 주어졌을 때, 배열의 첫번째 값을 기준으로 증가하는 부분 수열의 길이를 구하는 프로그램을 작성하시오.

// 예를 들어, 수열 A = {10, 20, 10, 30, 20, 50} 인 경우에 
// 증가하는 부분 수열은 A = {10, 20, 10, 30, 20, 50} 이고, 길이는 4이다.

class Main {
  public static int longest_incseq(int[] arr) {
    // fill here!
    int ptr = arr[0];
    int len = 1;
    for(int i=1; i<arr.length; i++){
      if(ptr < arr[i]){
        len += 1;
        ptr = arr[i];
      }
    }
    return len;
  }
  public static void main(String[] args) {
    int[] arr = {10, 20, 10, 30, 20, 50};
    System.out.println(longest_incseq(arr)); // 4
  }
}