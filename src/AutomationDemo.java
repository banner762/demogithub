import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationDemo {

	public static void main(String[] args) {
	   
	   System.setProperty("webdriver.chrome.driver", "C:\\Browser Drivers\\chromedriver.exe");
	   
       ChromeDriver driver = new ChromeDriver();
       
       driver.get("https://www.leo.org/german-english");
	}

}	

