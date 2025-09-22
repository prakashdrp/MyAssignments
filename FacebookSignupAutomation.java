package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.time.Duration;

public class FacebookSignupAutomation {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

        // Load the URL
        driver.get("https://en-gb.facebook.com/");

        // Maximize the browser window
        driver.manage().window().maximize();

        // Add implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Click on the "Create new account" button
        driver.findElement(By.linkText("Create new account")).click();

        // Enter First name
        driver.findElement(By.name("firstname")).sendKeys("Prakash");

        // Enter Surname
        driver.findElement(By.name("lastname")).sendKeys("Kumar");

        // Enter Mobile number or email address
        driver.findElement(By.name("reg_email__")).sendKeys("akashprabhuprakash@gmail.com");

        // Enter New password
        driver.findElement(By.id("password_step_input")).sendKeys("SecurePass123!");

        // Handle Date of Birth dropdowns
        WebElement dayDropdown = driver.findElement(By.id("day"));
        Select daySelect = new Select(dayDropdown);
        daySelect.selectByVisibleText("22");

        WebElement monthDropdown = driver.findElement(By.id("month"));
        Select monthSelect = new Select(monthDropdown);
        monthSelect.selectByVisibleText("Sep");

        WebElement yearDropdown = driver.findElement(By.id("year"));
        Select yearSelect = new Select(yearDropdown);
        yearSelect.selectByVisibleText("1995");

        
        driver.findElement(By.xpath("//input[@name='sex' and @value='2']")).click();

  
     driver.findElement(By.xpath("//button[@name='websubmit']")).click();

       
        System.out.println("✅ Facebook signup form filled successfully.");

        

	}

}
