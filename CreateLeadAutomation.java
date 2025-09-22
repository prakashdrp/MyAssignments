package week2.day2;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.By;
public class CreateLeadAutomation {

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
	        driver.findElement(By.linkText("Leads")).click();
	        driver.findElement(By.linkText("Create Lead")).click();
	        driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Prakash");
	        driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Kumar");
	        driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
	        driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Selenium Automation Tester");
	        driver.findElement(By.className("smallSubmit")).click();
	        String title = driver.findElement(By.id("viewLead_generalProfTitle_sp")).getText();
	        if (title.equals("Selenium Automation Tester")) {
	            System.out.println("✅ Lead created successfully with Title: " + title);
	        } else {
	            System.out.println("❌ Lead creation failed. Title mismatch.");
	        }

	}

}
