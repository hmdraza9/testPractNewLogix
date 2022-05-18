package TestAutomation.APIAutomation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test2Prog {

	public static void main(String[] args) {
		
		minMaxDeleSum();
		
	}
	
 	public static void minMaxDeleSum() {
		

		// TODO Auto-generated method stub

		// WAP to sum the diffs of max and min, 2nd max and min, 3rd max and min, 4th max and min, and so on...
		int array1[] = {21,51,23,7,17,32,15,5,9,22,88,2,11};
//		int array1[] = {5,2,1,6,3,11};
		//even num of element
		//find max element
		//min ele
		//print max-min 11-1 = 10
		//find second max - second min 6-2=4
		//and so on
		//5-3=2
		//add all diff and print
		//==10+4+2=16
		
		if((array1.length%2)>0) {

			System.out.println("Format is not ok, exitting...");
			System.exit(0);
		}
		else {

			System.out.println("Format is ok, calculating...");
		}
		
		List<Integer> numList = new ArrayList<Integer>();
		
		for(int i=0;i<array1.length;i++) {
			
			numList.add(array1[i]);	
		}
		Collections.sort(numList);
		System.out.println(numList+" : "+numList.size());
		int diffSum = 0;
		
		while(numList.size()>0) {

			System.out.println(numList.get(0)+"_"+numList.get(numList.size()-1));
			diffSum = diffSum + (numList.get(numList.size()-1) - numList.get(0));
			numList.remove(0);
			numList.remove(numList.size()-1);
			
		}
		System.out.println("diffSum: "+diffSum);
		
		
	
		
	}

}
