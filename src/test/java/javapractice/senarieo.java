package javapractice;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class senarieo {
	@Test
	public void youtubesong()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		WebElement e1 = driver.findElement(By.xpath("//input[@id='search']"));
		e1.click();
		e1.sendKeys("song");
		e1.click();
		List<WebElement> allsugg = driver.findElements(By.xpath("//ul[@role='listbox']//li[@role='presentation']//div[@class='sbqs_c']/b"));
		for(WebElement al:allsugg)
		{
			System.out.println(al.getTagName());
		}
		
		//elements = driver.findElements(By.xpath(null))
	}
	
	@Test
	public void spzies() throws InterruptedException
	{
		ChromeOptions opstions = new ChromeOptions();
		opstions.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(opstions);

		//WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.spicejet.com/");
	WebElement frome = driver.findElement(By.xpath("//div[@data-testid='to-testID-origin']/descendant::div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep']/input"));
	frome.click();
	frome.clear();
	frome.sendKeys("Delhi");
	Thread.sleep(2000);
		WebElement To = driver.findElement(By.xpath("//div[@data-testid='to-testID-destination']/descendant::div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep']/input"));
	To.click();
	To.clear();
	To.sendKeys("Bengaluru");
	Thread.sleep(2000);
	WebElement date = driver.findElement(By.xpath("//div[text()='Departure Date']"));
	date.click();
	Thread.sleep(3000);
		//WebElement selectdate = driver.findElement(By.xpath("//div[@class='css-76zvg2 r-jwli3a r-ubezar r-16dba41']"));
		//selectdate.click();
	
		WebElement sarechFlightbutton = driver.findElement(By.xpath("//div[@data-testid='home-page-flight-cta']"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(sarechFlightbutton));
		sarechFlightbutton.click();
		
		List<WebElement> allfightName = driver.findElements(By.xpath("//div[@class='css-1dbjc4n r-14lw9ot r-3aj1re r-18u37iz']/descendant::div[@class='css-76zvg2 r-homxoj r-1i10wst']"));
		   // wait.until(ExpectedConditions.visibilityOf(( allfightName)) 
		Thread.sleep(3000);
		List<WebElement> allflighPrise = driver.findElements(By.xpath("//div[@class='css-1dbjc4n r-14lw9ot r-3aj1re r-18u37iz']/descendant::div[@class='css-1dbjc4n r-1awozwy r-1sgu7fw r-1ljd8xs r-1phboty r-1777fci r-e9bn0q']/descendant::div[@class='css-76zvg2 r-homxoj r-1i10wst r-1kfrs79']"));
		Thread.sleep(3000);
		ArrayList<String> arrlink = new ArrayList<String>();
		Thread.sleep(3000);
		  
	for (int i = 0; i < allfightName.size(); i++) {
		String fName = allfightName.get(i).getText();
		System.out.println(fName);
		String fprice = allflighPrise.get(i).getText();
		char[] a = fprice.toCharArray();
		if(a.length<=4 && a[i]>='3')
		{
			System.out.println(fName+"-------"+fprice);
		}
		else
		{
			System.out.println("not avalibale");
		}
		
	}
	}

}
