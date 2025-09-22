package week2.day2;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class CreateAccountAutomation {

	public static void main(String[] args) {
		
		
		
		 ChromeOptions opt= new ChromeOptions();
		 opt.addArguments("guest");		
		 ChromeDriver driver = new ChromeDriver(opt);
		 driver.get("http://leaftaps.com/opentaps/");
		 driver.manage().window().maximize();
		 driver.findElement(By.id("username")).sendKeys("DemoCSR");
	        driver.findElement(By.id("password")).sendKeys("crmsfa");
	        driver.findElement(By.className("decorativeSubmit")).click();
	        driver.findElement(By.linkText("CRM/SFA")).click();
	        driver.findElement(By.linkText("Accounts")).click();
	        driver.findElement(By.linkText("Create Account")).click();
	        driver.findElement(By.id("accountName")).sendKeys("TestLeaf1");
	        driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
	        WebElement industryDropdown = driver.findElement(By.name("industryEnumId"));
	        Select industrySelect = new Select(industryDropdown);
	        industrySelect.selectByVisibleText("Computer Software");
	        WebElement ownershipDropdown = driver.findElement(By.name("ownershipEnumId"));
	        Select ownershipSelect = new Select(ownershipDropdown);
	        ownershipSelect.selectByVisibleText("S-Corporation");
	        WebElement sourceDropdown = driver.findElement(By.id("dataSourceId"));
	        Select sourceSelect = new Select(sourceDropdown);
	        sourceSelect.selectByValue("LEAD_EMPLOYEE");
	        WebElement marketingDropdown = driver.findElement(By.id("marketingCampaignId"));
	        Select marketingSelect = new Select(marketingDropdown);
	        marketingSelect.selectByIndex(6);
	        WebElement stateDropdown = driver.findElement(By.id("generalStateProvinceGeoId"));
	        Select stateSelect = new Select(stateDropdown);
	        stateSelect.selectByValue("TX");
	        driver.findElement(By.className("smallSubmit")).click();
	        
	        String accountName = driver.findElement(By.xpath("//span[@id='viewAccount_accountName_sp']")).getText();
	        if (accountName.contains("TestLeaf")) {
	            System.out.println("Account created successfully: " + accountName);
	        } else {
	            System.out.println("Account creation failed.");
	        }

	}

}
