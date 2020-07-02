import java.util.Scanner;
class Main {
  public static void main(String[] args) {
	System.out.print("Please enter a sentence:");
	
	Scanner scan = new Scanner(System.in);
	String sentence = scan.nextLine();
	sentence=sentence.replace("\n","");
	sentence=sentence.replace("\t","");
	sentence=sentence.replace(" ","");
  System.out.println(sentence.length());
  
  }
}