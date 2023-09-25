package count;

import java.util.Scanner;

public class noofvowelsinstring {
	public static void main(String[] args) {
		
		Scanner Kb=new Scanner(System.in);
		System.out.println("How man strings u want to check?");
		//Take the input of no. of test cases
		int t=Kb.nextInt();
		//looping until the test cases are zero
		while(t-->0){
			//Input the string
			System.out.println("Enter the string!");
			String s=Kb.next();
			//counter to count the number of vowels in a string
			int vowels=0;
			for(int i=0;i<s.length();i++){
				//character at a particular index of string
				char ch=s.charAt(i);
				/*switch is used to check multiple condition by using different cases
				here,we will check each character that it is a vowel or not 
				*/
				switch(ch){
					case 'a':
					case 'e':
					case 'i':
					case 'o':
					case 'u':
					case 'A':
					case 'E':
					case 'I':
					case 'O':
					case 'U':
					//counter vowels will be incremented each time when a character will be a vowel
					vowels++;
					break;
					default:
					// do nothing
				}
			}
			//print the number of vowels in a string
			System.out.println(vowels);
		}
		//to give a space of one line
		System.out.println();

	}


}
