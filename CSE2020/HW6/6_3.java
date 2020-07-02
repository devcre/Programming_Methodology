// 이미 오름차순으로 정렬되어 있는 두 정수 배열을 받아서, 
// 마찬가지로 오름차순 정렬된 합쳐진 배열을 반환하는 함수를 작성하라. 

// 참고: 아직 배우지 않은 정렬을 사용하지 않고 작성할 수 있음. 

class Main {
  public static int[] merge(int[] arr1, int[] arr2) {
    // fill here! 
    int i, j;
    int[] combinedArray = new int[arr1.length + arr2.length];
    int len = combinedArray.length;
    int tmp;
    int tmpval = 0;
    
    for(i=0; i<arr1.length; i++){
      combinedArray[i] = arr1[i];
    }
    for(i=0; i<arr2.length; i++){
      combinedArray[i+arr1.length] = arr2[i];
    }
    
    System.out.println("Before Combined: ");
    for(i=0; i<len; i++){
      System.out.print(combinedArray[i]);
      System.out.print(" ");
    }
    System.out.print("\n");
    
    for(i=len-1; i>0; i--){
      for(j=0; j<i; j++){
        if(combinedArray[j] > combinedArray[j+1]){
          tmpval = combinedArray[j];
          combinedArray[j] = combinedArray[j+1];
          combinedArray[j+1] = tmpval;
        }
      }
    }
    
    // int ptr1 = arr1[0];
    // int ptr2 = arr2[0];
    // int cnt = 0;
    // int cnt1 = 0;
    // int cnt2 = 0;
    
    // int limit1 = arr1.length;
    // int limit2 = arr2.length;
    
    // while(cnt+1 < limit1 + limit2){
    //   if(ptr1 < ptr2){
    //     combinedArray[cnt] = ptr1;
    //     cnt += 1;
    //     cnt1 += 1;
    //     if(cnt1 == limit1 && cnt2+1 == limit2){
    //       combinedArray[cnt] = ptr2;
    //     }
    //     else if(cnt1 < limit1){
    //       ptr1 = arr1[cnt1];
    //     }
    //   }
    //   else{
    //     combinedArray[cnt] = ptr2;
    //     cnt += 1;
    //     cnt2 += 1;
    //     if(cnt1+1 == limit1 && cnt2 == limit2){
    //       combinedArray[cnt] = ptr1;
    //     }
    //     else if(cnt2 < limit2){
    //       ptr2 = arr2[cnt2];
    //     }
    //   }
    // }
    
    return combinedArray;
  }
  public static void main(String[] args) {
    int[] arr1 = {1, 2, 4, 8, 16};
    int[] arr2 = {3, 6, 9, 12};
    int[] merged = merge(arr1, arr2);
    for (int i = 0 ; i < merged.length; i++) {
      System.out.println(merged[i]);
      // 1 2 3 4 6 8 9 12 16
    }
  }
}