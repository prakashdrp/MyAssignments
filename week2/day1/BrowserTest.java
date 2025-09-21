package week2.day1;  

public class BrowserTest {
    public static void main(String[] args) {
        
        LaunchBrowser browser = new LaunchBrowser();

        
        browser.openBrowser();                  
        browser.navigateTo("https://www.google.com");
    }
}
