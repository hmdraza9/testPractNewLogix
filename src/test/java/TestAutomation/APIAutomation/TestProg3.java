package TestAutomation.APIAutomation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestProg3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> numList = new ArrayList<Integer>();
		int array1[] = {6,22,89,2, 56,1033, 13256, 366};
		
		for(int i : array1) {
			
			numList.add(i);
			
		}

		sortList(numList);
//Collections.sort(numList);
//
//System.out.println(numList);
//
//System.out.println(numList.get(numList.size()-2));
		
	}
	
	public static void sortList(List<Integer> al) {
		
		int min=0;
		System.out.println(al.size());
		for(int i=0;i<al.size();i++) {
			
			min = al.get(i);
			System.out.println(min);
			for(int k = i;k<al.size();k++) {
				
				System.out.println("i: "+i+" k: "+k);
				System.out.println("min: "+min+" ; get k : "+al.get(k));
				if(al.get(k)<min) {
					
//					int temp = min;
					System.out.println("smaller value found!");
					al.remove(k);
					al.add(al.indexOf(min), al.get(k));
					
				}
				
			}
			
		}
		System.out.println(al);
		
	}

}
