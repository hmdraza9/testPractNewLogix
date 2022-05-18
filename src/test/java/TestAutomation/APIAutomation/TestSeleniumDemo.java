package TestAutomation.APIAutomation;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSeleniumDemo {

	
	public static WebDriver driver;
	
	public static void main(String[] args) {
		
		
		List<Integer> newList = new ArrayList<Integer>();
		newList.add(1);
//		newList.add(4);
		newList.add(8);
		newList.add(4);
		newList.add(3);
		newList.add(3);
		newList.add(9);
//		newList.add(4);
		newList.add(3);
//		newList.add(4);
		
//		patterTest(newList);
		
//		String str = "My Name is Hamid Raza and I am in Inda since last 25 years. My age is 25. My sister is 6 years elder to me and my brother is 6 years younger to me.";
//		testStringProg(str);
		
		
		selTask();
		
//		convertNumStrCommaDecimal("10,00,000.00");
		
		
	}
	
	public static void convertNumStrCommaDecimal(String str) {
		
		str = str.replace(",", "");
		
		String newStr = "";
		
		for(int i=0;i<str.indexOf(".");i++) {
			
			newStr = newStr + str.substring(i, i+1);
			
		}
		System.out.println(Integer.parseInt(newStr));
		
	}
	
	public static void testStringProg(String str) {
		int countOfSpaces = 0;
		
		for(int i=0;i<str.length()-1;i++) {
			
			if(" ".contentEquals(Character.toString(str.charAt(i)))) {
				
				countOfSpaces++;
				
			}
			if(Character.isDigit(str.charAt(i)))
				System.out.print(str.charAt(i)+" ");
			
			
			
		}
		System.out.println("countOfSpaces: "+countOfSpaces);
		
		//sum find
		
//		(new Character()).numeri
		
	}
	
	
	public static void patterTest(List<Integer> numList) {
		

		int indexOfNum = numList.size();
		
		if(numList.size()>0 && numList.contains(4)) {
			
			do{
				indexOfNum--;
//				System.out.println("indexOfNum::: "+indexOfNum+", numList Val: "+numList.get(indexOfNum));
			}
			while(!numList.get(indexOfNum).equals(4));
			
//			System.out.println("Last pos of 4: "+indexOfNum);

			if(indexOfNum==(numList.size()-1)) {
				
				System.out.println("4 is at last pos");
				
			}
			else {


				for(int k=indexOfNum+1;k<numList.size();k++) {
					
					System.out.print(numList.get(k)+" ");
					
				}
				System.out.println("");	
			}
		}
		else {
			
			System.out.println("list doesn't contain a 4");
			
		}
	}
	
	public static void selTask() {
		

		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Abdul Hamid Raza\\Documents\\all-drivers\\chromedriver.exe");
//		system.se
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL+"t");
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("SENSEX");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		String SENSEXValue = driver.findElement(By.xpath("")).getText();
		System.out.println(SENSEXValue);
		
		driver.quit();
		
	}

}
