package week2.day1;

public class LaunchBrowser {

    
    public void openBrowser() {
        System.out.println("Browser launched successfully.");
    }

    
    public void navigateTo(String url) {
        System.out.println("Navigating to: " + url);
    }

    
    public static void main(String[] args) {
        LaunchBrowser browser = new LaunchBrowser();
        browser.openBrowser();                  
        browser.navigateTo("https://www.google.com");  
    }
}