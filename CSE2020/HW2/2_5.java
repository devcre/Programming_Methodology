// 초(seconds) 단위의 시간을 입력받아서,
// 이를 일(days), 시간(hours), 분(minutes), 초(seconds) 로 변환하는 프로그램을 작성하세요. 
// 입출력 예시:  
// 289932 을 입력할경우, 
// Total(seconds): 
// 3Days 8Hours 32Minutes 12Seconds 


import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    int total;  // 총 시간 (초) 
    int days = 0, hours = 0, minutes = 0, seconds = 0; // 일,시간,분,초  
    
    Scanner scan = new Scanner(System.in); 
    total = scan.nextInt(); 
    
    // 여기에 코드를 입력하세요.
    days = total / 86400;
    hours = (total % 86400) / 3600;
    minutes = ((total % 86400) % 3600) / 60;
    seconds = ((total % 86400) % 3600) % 60;
    
    System.out.println("Total(seconds):");
    System.out.println(days + "Days " + hours + "Hours " + minutes + "Minutes " + seconds + "Seconds");
  }
}