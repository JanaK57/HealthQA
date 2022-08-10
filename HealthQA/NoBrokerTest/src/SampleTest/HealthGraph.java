package SampleTest;
import java.awt.AWTException;
import java.awt.List;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HealthGraph {

	public static void main(String[] args) throws AWTException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\jana5\\eclipse-workspace\\SeleniumProjectDay4Task\\Browser\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();

		driver.get("https://www.nobroker.in/");
		driver.findElement(By.className("nb__17yFj")).click();
		driver.findElement(By.xpath("//div[@class='css-dvua67-singleValue nb-select__single-value']")).click();
		driver.findElement(By.xpath("//div[text()='Mumbai']")).click();
		driver.findElement(By.id("listPageSearchLocality")).sendKeys("Malad");
		
		Thread.sleep(1000);
		Robot r =new Robot();
	
		r.keyPress(KeyEvent.VK_UP);
		r.keyRelease(KeyEvent.VK_UP);
		
		r.keyPress(KeyEvent.VK_UP);
		r.keyRelease(KeyEvent.VK_UP);
		
		r.keyPress(KeyEvent.VK_UP);
		r.keyRelease(KeyEvent.VK_UP);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		driver.findElement(By.id("listPageSearchLocality")).sendKeys("Malad");
		
		Thread.sleep(1000);
		Robot k =new Robot();
	
		r.keyPress(KeyEvent.VK_UP);
		r.keyRelease(KeyEvent.VK_UP);
		
		r.keyPress(KeyEvent.VK_UP);
		r.keyRelease(KeyEvent.VK_UP);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='prop-search-button btn btn-primary btn-lg']")).click();
		
		//driver.findElement(By.xpath("//div[@class='leave-intent-close-icon']")).click();
		driver.findElement(By.name("appartment2BHK")).click();
		
		driver.findElement(By.name("appartment3BHK")).click();
		WebElement plt = driver.findElement(By.xpath("(//button[@id='propertyViews'])[4]"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()",plt);

		String id = driver.getWindowHandle();
		Set<String> windowHandle = driver.getWindowHandles();
		
		for(String id1 : windowHandle)
		{
			if(!id1.equals(windowHandle));
			{
				driver.switchTo().window(id1);			
				}
			}
		WebElement ss = driver.findElement(By.id("description"));
		String text = ss.getText();
		System.out.print(text);
		System.out.println("Property Description is Written, So the Test Case is passed");
		}
}