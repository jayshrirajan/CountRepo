package count;

import java.util.Scanner;

public class breakastringintochar {
	public static void main(String[] args) {

		Scanner Kb=new Scanner(System.in);
		System.out.println("How man strings u want to break?");
		//Take the input of no. of test cases
		int t=Kb.nextInt();
		//looping until the test cases are zero
		while(t-->0){
			//Input the string
			System.out.println("Enter the string!");
			String s=Kb.next();
			//looping until the string length is zero
			for(int i=0;i<s.length();i++){
				//charAt function of string class get a particular character(specified by the index) from the string 
				char c=s.charAt(i);
				//display each character one by one with a space
				System.out.print(c+" ");
			}
			//to give a space of one line

			System.out.println();

		}
	}

}
