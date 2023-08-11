import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/webhp?hl=en&sa=X&ved=0ahUKEwic_pqol4SAAxUbcGwGHc-iCpoQPAgI");
		//driver.navigate().back();
		//driver.navigate().forward();
		driver.navigate().refresh();
		System.out.println(driver.getTitle());

	//	driver.findElement(By.xpath("//*[@name=username]"));
		driver.findElement(By.id("APjFqb")).sendKeys("java");
		driver.findElement(By.name("keyword")).sendKeys(Keys.ENTER);
			
			
	}

}
