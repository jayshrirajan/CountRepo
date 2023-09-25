package count;

import java.util.Scanner;

public class tocountupperandlowerinstring {
	public static void main(String[] args)
	{
		
		Scanner Kb=new Scanner(System.in);
		System.out.println("How man strings u want to check?");
		
		int t=Kb.nextInt();
		
		while(t-->0){
			
			System.out.println("Enter the string!");
			String s=Kb.next();
			
			int uppercase=0,lowercase=0;
			
			for(int i=0;i<s.length();i++){
				
				if(Character.isLowerCase(s.charAt(i))){
					lowercase++;
				}
				else if(Character.isUpperCase(s.charAt(i))){
					uppercase++;
				}
			}
			
			System.out.println("No. of lowercase letter : " + lowercase);
			System.out.println("No. of uppercase letter : " + uppercase);
			
			System.out.println();
		}
	}

}
