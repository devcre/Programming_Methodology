// 원뿔의 부피와 표면적을 계산하는 프로그램을 작성하세요.
// 원뿔 밑의 원의 반지름(r)과 원뿔의 높이(h)는 사용자로부터 입력 받아야 합니다.
// 원뿔의 부피(volume)와 표면적(area)을 계산하는 공식은 다음과 같습니다. 

// volume = 1/3πr²h
// area = πr√(r² + h²) + πr²

// 원뿔의 부피와 표면적을 계산 후 출력하세요.  

import java.util.Scanner;
import java.lang.Math;
class Main {
  public static void main(String[] args) {
    double r, h, volume = 0, area = 0; 
    Scanner scan = new Scanner(System.in); 
    
    // 여기에 코드를 입력하세요. 
    
    // 사용자로부터 r 입력받기 
    r = scan.nextDouble();
    // 사용자로부터 h 입력받기 
    h = scan.nextDouble();
    
    // 힌트: Math.PI, Math.sqrt 사용
    volume = Math.PI * Math.pow(r,2) * h / 3;
    area = Math.PI * r * Math.sqrt(Math.pow(r,2) + Math.pow(h, 2)) + Math.PI * Math.pow(r, 2);
    
    System.out.println(volume); 
    System.out.println(area); 
  }
}