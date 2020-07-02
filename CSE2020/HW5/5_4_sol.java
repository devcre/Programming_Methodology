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
		Scanner scan = new Scanner(System.in);
		String sentence = scan.nextLine();
		sentence = sentence.toLowerCase();
		sentence = sentence.replace(" ","");
		
		for(int k=0;k<sentence.length();k++) {
			if(sentence.charAt(k)=='a') {
				a++;
			}else if(sentence.charAt(k)=='e') {
				e++;
			}else if(sentence.charAt(k)=='i') {
				i++;
			}else if(sentence.charAt(k)=='o') {
				o++;
			}else if(sentence.charAt(k)=='u') {
				u++;
			}else {
				consonant++;
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