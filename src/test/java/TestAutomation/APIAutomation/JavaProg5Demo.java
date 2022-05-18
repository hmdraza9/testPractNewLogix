package TestAutomation.APIAutomation;

public class JavaProg5Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//to toggle the case
	String newStr = "2HAmi6d R9aza 098";
	String newStrAfter = "";
	
		for(int i=0;i<newStr.length();i++) {
			String currLetter = newStr.substring(i, i+1);
			
			if(Character.isLowerCase(currLetter.charAt(0))) {
				newStrAfter = newStrAfter + newStr.substring(i, i+1).toUpperCase();
			}
			
			else if(Character.isUpperCase(currLetter.charAt(0))) {
				newStrAfter = newStrAfter + newStr.substring(i, i+1).toLowerCase();
			}
			
			else {
				newStrAfter = newStrAfter + newStr.substring(i, i+1);
			}
		}
		System.out.println(newStr);
		System.out.println(newStrAfter);
		
	}

}