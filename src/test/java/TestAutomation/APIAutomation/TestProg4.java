package TestAutomation.APIAutomation;

import java.util.ArrayList;
import java.util.List;

public class TestProg4 {

	public static void main(String[] args) {

//		checkRemoveAtIndex();
		removeDupsFromList();
		
	}
	
	public static void checkRemoveAtIndex() {
		

		
		int array1[] = {1,5,3,6,8,5,6,3,0,9,11,23,11,98};
		
		List<Integer> numList = new ArrayList<Integer>();
		for(int i : array1) {
			numList.add(i);	
		}

		System.out.println(numList.size());
		System.out.println(numList.indexOf(11));
		
	}
	
	public static void removeDupsFromList() {
		
		int array1[] = {1,5,3,6,8,5,6,3,0,9,11,23,11,45};
		
		List<Integer> numList = new ArrayList<Integer>();
		for(int i : array1) {
			
			numList.add(i);
			
		}
		
		System.out.println("Number List before: "+numList);
		
		for(int i =0;i<numList.size();i++) {
			
			
			for(int k=i+1;k<numList.size();k++) {

				System.out.println("numList.get(i): "+numList.get(i));
				System.out.println("numList.get(k): "+numList.get(k));
				
				if(numList.get(i)==numList.get(k)) {
					numList.remove(numList.indexOf(numList.get(k)));
					
				}
				
			}
			
		}
		
		System.out.println("Number List after: "+numList);
		
	
		
	}

}
