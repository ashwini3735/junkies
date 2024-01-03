package javapractice;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpConnection;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class brokenLikn {
	
	@Test
	public void brokenlink() throws IOException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.amazon.in/");
		List<WebElement> alllinks = driver.findElements(By.xpath("//a"));
		ArrayList<String> arlink = new ArrayList<String>();
		for (int i = 0; i < alllinks.size(); i++) {
			String eachLink = alllinks.get(i).getAttribute("href");
			URL url = null;
			int sataucode=0;
			try {
				url = new URL(eachLink);
				HttpURLConnection	httpconection = (HttpURLConnection)url.openConnection();
				sataucode= httpconection.getResponseCode();
				
				if (sataucode>=400)
				{
					System.out.println(eachLink);
				}
				
			}
			catch(MalformedURLException e)
			{
				System.out.println(eachLink);
			}
			
		}
	}

}
