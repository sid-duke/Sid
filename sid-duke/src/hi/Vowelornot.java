package hi;
import java.util.Scanner;
public class Vowelornot {
public static void main(String[] args) {
		
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a letter to check whether its vowel or consonant");
	char i=(char) sc.nextInt();
	
	if(i=='a'||i=='e'||i=='i'||i=='o'||i=='u')
		System.out.println(i+"\n is vowel");
	else
		System.out.println(i+"is consonant");
	
}
}
