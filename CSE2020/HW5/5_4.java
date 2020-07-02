// 사용자로부터 한 문자열을 읽어 들인 후 그 문자열 안에 있는 각 모음(a, e, i, o, u)의 수와 자음들의 수를 알아 내어 출력하는 프로그램을 작성하라. 각 모음에 대한 별도의 계수기를 사용해라. 
// (영어 알파벳 이외의 숫자, 특수문자 등의 입력은 없다고 가정한다)

// 출력 예시
// Please enter a sentence:I love Java programming very much
// a:3
// e:2
// i:2
// o:2
// u:1
// consonant:18

import java.util.Scanner;
class Main {
  public static void main(String[] args) {
		System.out.print("Please enter a sentence:");
		int a=0;
		int e=0;
		int i=0;
		int o=0;
		int u=0;
		int consonant=0;
		
		int num = 0;
		Scanner scan = new Scanner(System.in);
		String sentence = scan.nextLine();
		// 공백 제거
		sentence = sentence.replaceAll(" ","");
		// 소문자 변환
		sentence = sentence.toLowerCase();
		
		// 여기에 코드를 입력 하세요
		for(num=0; num < sentence.length(); num++){
		  if(sentence.charAt(num) == 'a'){
		    a += 1;
		  }
		  else if(sentence.charAt(num) == 'e'){
		    e += 1;
		  }
		  else if(sentence.charAt(num) == 'i'){
		    i += 1;
		  }
		  else if(sentence.charAt(num) == 'o'){
		    o += 1;
		  }
		  else if(sentence.charAt(num) == 'u'){
		    u += 1;
		  }
		  else{
		    consonant += 1;
		  }
		}
		
		System.out.println("a:"+a);
		System.out.println("e:"+e);
		System.out.println("i:"+i);
		System.out.println("o:"+o);
		System.out.println("u:"+u);
		System.out.println("consonant:"+consonant);
  }
}