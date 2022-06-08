import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserTest2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Browser Drivers\\chromedriver.exe");
	    ChromeDriver driver = new ChromeDriver();
			    
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("The Nutmegs Curse");
		driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
		Thread.sleep(2000);
		driver.close();

	}

}
