package TestAutomation.APIAutomation;

import java.util.HashMap;

public class testPackage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String strInput = "abcd pqr yz";
		
		// for given string, o/p should be in the form of their index in numeric
		
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		
		int firstNum  = 0;
		int secondNum = 1;
		String alphaBet = "abcdefghijklmnopqrstuvwxyz";//
		int temp=0;
		
		for(int i=0;i<26;i++) {
			
			firstNum = secondNum;
			secondNum = temp;
			hm.put(Character.toString(alphaBet.charAt(i)), temp);
			temp = firstNum+secondNum;
			
		}

		System.out.println(hm);
		
		String[] splitstrInput = strInput.split(" ");
		
		for(int m = 0;m<splitstrInput.length;m++) {

			for(int j=0;j<splitstrInput[m].length();j++) {
				
				System.out.print(hm.get(Character.toString(splitstrInput[m].charAt(j)))+"_");
				
			}
			System.out.println("");
			
		}
		
		
	}

}
