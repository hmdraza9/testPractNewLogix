package TestAutomation.APIAutomation;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HajTravelAgentsPrint 
{
    public static void main( String[] args ) throws InterruptedException
    {
        
//		System.setProperty("webdriver.chrome.driver", "C:/Users/Abdul Hamid Raza/Documents/all-drivers/chromedriver.exe");
        
        
//        WebDriverManager.chromedriver().setup();
        
        WebDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();

        String URL = "";
		URL = "http://indianhajpto.gov.in/packagemodule/signuppage";
		
		//tooltip test start
//		URL = "https://www.makemytrip.com/";
//
//		driver.get(URL);Thread.sleep(4000);
//		WebElement fEl = driver.findElement(By.xpath("//li[@data-cy='account' and contains(@class,'userLoggedOut')]"));
//		fEl.click();
//		Actions action = new Actions(driver);
//		fEl = driver.findElement(By.xpath("//li[contains(text(),'Senior Citizen')]"));
//		action.moveToElement(fEl).build().perform();Thread.sleep(4000);
//		System.out.print("Tooltip found: ");
//		System.out.println(driver.findElements(By.xpath("//li[contains(text(),'Senior Citizen')]/div/p")).size());
//		System.out.println("El1 text: "+driver.findElements(By.xpath("//li[contains(text(),'Senior Citizen')]/div/p")).get(0).getText());
//		System.out.println("El2 text: "+driver.findElements(By.xpath("//li[contains(text(),'Senior Citizen')]/div/p")).get(1).getText());
//		driver.findElement(By.id("fromCity")).click();
//		action.sendKeys(driver.findElement(By.xpath("//input[@type='text' and @placeholder='From']")), "Delhi").build().perform();
//		System.exit(1);		
//		tooltip test ends

		
		
		driver.get("http://indianhajpto.gov.in/packagemodule/signuppage");
		String State = "//div[@id='wwctrl_stateHome']/select";
		String Captha = "//input[@id='mycaptcha']";
		String Submit = "//button[@type='button']";
		String Travler_aganecy_name = "//div[@class='booking-item']/div/div/h5[@class='booking-item-title']/b";
		String Remarks = "//div[@class='booking-item']/div/div/p[@class='booking-item-address breakParagraph valueColor']/lgtext";
		String Email = "//div[@class='booking-item']/div/div/div/div/small/i[@class='fa fa-envelope iconColor']/following-sibling::span";
		String Phone = "//div[@class='booking-item']/div/div/div/div/small/i[@class='fa fa-phone iconColor']/following-sibling::span";
		String Website = "//div[@class='booking-item']/div/div/div/div/small/i[@class='fa fa-home iconColor']/following-sibling::span/a";
		String Visa = "//div[@class='booking-item']/div/div/div/div/small/i[@class='fab fa-vine iconColor']/following-sibling::span";
		String Travle_insurance = "//div[@class='booking-item']/div/div/div/div/small/i[@class='fa fa-plane iconColor']/following-sibling::span";
		String Life_insurance = "//div[@class='booking-item']/div/div/div/div/small/i[@class='fa fa-life-ring iconColor']/following-sibling::span";
		String Medical_insurance = "//div[@class='booking-item']/div/div/div/div/small/i[@class='fa fa-ambulance iconColor']/following-sibling::span";
		String Pick_Drop = "//div[@class='booking-item']/div/div/div/div/small/i[@class='fa fa-cab iconColor']/following-sibling::span";
		String Group_insurance = "//div[@class='booking-item']/div/div/div/div/small/i[@class='fa fa-group iconColor']/following-sibling::span";
		String Next_page = "//li[@class='next']";

		
		
		driver.get(URL);

		
		WebElement stateElement = driver.findElement(By.id("wwctrl_stateHome"));
		
		Select select = new Select(stateElement);
		try {
			select.selectByValue("DELHI");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			for(int i=0;i<10;i++) {
				Thread.sleep(1000);
				System.out.println("Waiting for 1000ms");
				select.selectByIndex(6);
			}
		}
		
		driver.findElement(By.xpath(Submit)).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
//		WebElement firstEl;
//		firstEl = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Travler_aganecy_name)));
//		System.out.println("First element found: "+firstEl.getText());

		

//		List<ArrayList> webLIstOfList = new ArrayList<ArrayList>();
		List<WebElement> webAgent = new ArrayList<WebElement>();
		List<WebElement> webRem = new ArrayList<WebElement>();
		List<WebElement> webEmail = new ArrayList<WebElement>();
		List<WebElement> webPhone = new ArrayList<WebElement>();
		List<WebElement> webWebsite = new ArrayList<WebElement>();
		List<WebElement> webVisa = new ArrayList<WebElement>();
		List<WebElement> webTrvlInsu = new ArrayList<WebElement>();
		List<WebElement> webLifInsu = new ArrayList<WebElement>();
		List<WebElement> webMedInsu = new ArrayList<WebElement>();
		List<WebElement> webPkDrop = new ArrayList<WebElement>();
		List<WebElement> webGpInsu = new ArrayList<WebElement>();
		
		webAgent = driver.findElements(By.xpath(Travler_aganecy_name));
		webRem = driver.findElements(By.xpath(Remarks));
		webEmail = driver.findElements(By.xpath(Email));
		webPhone = driver.findElements(By.xpath(Phone));
		webWebsite = driver.findElements(By.xpath(Website));
		webVisa = driver.findElements(By.xpath(Visa));
		webTrvlInsu = driver.findElements(By.xpath(Travle_insurance));
		webLifInsu = driver.findElements(By.xpath(Life_insurance));
		webMedInsu = driver.findElements(By.xpath(Medical_insurance));
		webPkDrop = driver.findElements(By.xpath(Pick_Drop));
		webGpInsu = driver.findElements(By.xpath(Group_insurance));
		
		
		System.out.println(webAgent);for(WebElement el : webAgent) { System.out.println(el.getText());}
		System.out.println(webRem);for(WebElement el : webRem) { System.out.println(el.getText());}
		System.out.println(webEmail);for(WebElement el : webEmail) { System.out.println(el.getText());}
		System.out.println(webPhone);for(WebElement el : webPhone) { System.out.println(el.getText());}
		System.out.println(webWebsite);for(WebElement el : webWebsite) { System.out.println(el.getText());}
		System.out.println(webVisa);for(WebElement el : webVisa) { System.out.println(el.getText());}
		System.out.println(webTrvlInsu);for(WebElement el : webTrvlInsu) { System.out.println(el.getText());}
		System.out.println(webLifInsu);for(WebElement el : webLifInsu) { System.out.println(el.getText());}
		System.out.println(webMedInsu);for(WebElement el : webMedInsu) { System.out.println(el.getText());}
		System.out.println(webPkDrop);for(WebElement el : webPkDrop) { System.out.println(el.getText());}
		System.out.println(webGpInsu);for(WebElement el : webGpInsu) { System.out.println(el.getText());}
		
    }
}
