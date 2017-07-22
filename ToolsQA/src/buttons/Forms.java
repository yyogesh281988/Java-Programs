package buttons;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import com.gargoylesoftware.htmlunit.javascript.host.dom.Document;

public class Forms {


	static WebDriver driver;
	static JavascriptExecutor jse;
	public static void main(String[] args) throws InterruptedException, AWTException
	{
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Yogesh-Bharti\\.eclipse\\driver and jars\\geckodriver.exe");
		driver =new FirefoxDriver();
		
		driver.get("http://toolsqa.com/automation-practice-form/");
		
		try
		{}
		catch(ArithmeticException a)
		{}
		catch(NullPointerException c)
		{}
		catch(Exception e)
		{}

		//driver.findElement(By.name("firstname")).sendKeys("Yogesh");
		driver.findElement(By.name("lastname")).sendKeys("Singh");
		driver.findElement(By.id("sex-0")).click();
		driver.findElement(By.id("exp-2")).click();
		driver.findElement(By.id("datepicker")).sendKeys("28/08/1988");
		List<WebElement> chk=driver.findElements(By.xpath("//*[@type='checkbox']"));
		for(int i=0;i<chk.size();i++)
		{
			WebElement ele=chk.get(i);
		String id= ele.getAttribute("value");
			if(id.equalsIgnoreCase("Automation Tester"))
			{
			ele.click();
			
			}	
			if(id.equalsIgnoreCase("Selenium IDE"))
			{
				ele.click();
			}
		System.out.println(id);
		}
		driver.findElement(By.name("photo")).click();
		Robot upload=new  Robot();
		StringSelection FilePath =new StringSelection("e:\\baby_image.jpg");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(FilePath, null);
		upload.keyPress(KeyEvent.VK_CONTROL);
		upload.keyPress(KeyEvent.VK_V);
		upload.keyRelease(KeyEvent.VK_CONTROL);
		upload.keyRelease(KeyEvent.VK_V);
		upload.keyPress(KeyEvent.VK_ENTER);
		upload.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
			Select s= new Select(driver.findElement(By.id("continents")));
			s.selectByVisibleText("Africa");
			Select s1=new Select(driver.findElement(By.name("selenium_commands")));
			s1.selectByVisibleText("Switch Commands");
			//driver.findElement(By.id("submit")).click();
			
			
		
		
		
		
			
		
}
}
