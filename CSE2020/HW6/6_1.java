// 정수 배열을 받아서 k번째로 큰 수를 반환하는 함수를 작성하세요. 

// 힌트: 아직 배우지 않은 배열정렬 연산 없이 수행할 수 있습니다. 주석을 참조하세요. 

class Main {
  public static int kthbig(int[] arr, int k) {
    int size = arr.length;
    int answer = 0;
    int[] rank = new int[size];  // rank[i] : arr의 원소들 중 arr[i] 보다 큰 수의 갯수
    for (int i = 0; i < size; i++) {
      int n_largerthan_me = 0;   //  arr[i] 보다 큰 수의 갯수
      for (int j = 0; j < size; j++) {
        // fill here!
        if(arr[i] < arr[j]){
          n_largerthan_me += 1;
        }
      }
      // fill here!
      rank[i] = n_largerthan_me;
    }
    // rank[i] 가 k-1 인 i를 찾고 arr[i] 반환하기. 
    // fill here!
    for(int a=0; a<size; a++){
      if(rank[a] == k-1){
        answer = arr[a];
      }
    }
    return answer;
  }
  
  public static void main(String[] args) { 
    // test code 
    int[] arr = {1, 4, 2, 5, 11, 9, 18}; 
    System.out.println(kthbig(arr, 2));  // 11  
  }
}