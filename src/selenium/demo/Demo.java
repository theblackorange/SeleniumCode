package selenium.demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//after this we'll be launching the application using get method in selenium
		
		driver.get("https://param-staging.com");  
		driver.manage().window().maximize();                                 //for maximizing the window
		driver.findElement(By.partialLinkText("Try for free")).click();
		
		//Here we will enter all necessary fields to create a new account
		driver.findElement(By.id("id_first_name")).sendKeys("John");
		driver.findElement(By.id("id_last_name")).sendKeys("Jacobs");
		driver.findElement(By.id("id_email")).sendKeys("neras@getnada.com");
		driver.findElement(By.id("id_password")).sendKeys("john.jacobs");
		driver.findElement(By.id("id_company_name")).sendKeys("recruit");
		
		//after this step captcha is there and it can't be automated, here we requrie manual intervention
		//and the time it takes for captcha to be completed is dynamic in nature so, adding a wait won't work here.
		//Captcha and the final click will be done manually
		
		//after signing up user needs to login to the application
		driver.get("https://param-staging.com");
		driver.findElement(By.partialLinkText("Login")).click();
		driver.findElement(By.id("id_email")).sendKeys("neras@getnada.com");
		driver.findElement(By.id("id_password")).sendKeys("john.jacobs");
		driver.findElement(By.id("btn")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//skipping the rest
		//once the rest details are skipped, skip option gets disabled, so, this won't work again and again
		//betwo lines should be comenteeeeeed whenever running the code
		driver.findElement(By.xpath("//div[@id=\"app\"]/div[3]/div/div/div/div/div[2]/div/div[3]/a")).click();
		driver.findElement(By.xpath("//div[@id=\"app\"]/div[3]/div/div/div/div/div[2]/div/div[4]/a")).click();
		
		//company profile
		driver.findElement(By.xpath("//div[@class=\"ui two stackable link cards\"]/div[1]/div[2]")).click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='app']/div[3]/div/div/div/div/div/div/div[2]/div[3]/div[2]/div/div[1]/form/div[2]/input")).sendKeys("Company.com");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[3]/div/div/div/div/div/div/div[2]/div[3]/div[2]/div/div[1]/form/div[4]/textarea")).sendKeys("Good company to work with");
		driver.findElement(By.xpath("//div[@id=\"app\"]/div[3]/div/div/div/div/div/div/div[2]/div[3]/div[3]/button")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//logout
		driver.findElement(By.xpath("//div[@class=\"logo\"]")).click();
		driver.findElement(By.xpath("//div[@class=\"menu transition visible\"]/a[5]")).click();
		
		//login
		driver.get("https://param-staging.com");
		driver.findElement(By.partialLinkText("Login")).click();
		driver.findElement(By.id("id_email")).sendKeys("neras@getnada.com");
		driver.findElement(By.id("id_password")).sendKeys("john.jacobs");
		driver.findElement(By.id("btn")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//add office location
		driver.findElement(By.xpath("//div[@id=\"app\"]/div[3]/div/div/div/div/div[2]/div/div[2]/div[2]")).click();
		driver.findElement(By.xpath("//div[@id=\"app\"]/div[3]/div/div/div/div/div/div/div[2]/div[3]/div[1]/div")).click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name='location']")).sendKeys("SciTech");
		driver.findElement(By.xpath("//input[@class='search']")).sendKeys("Hyderabad");
		driver.findElement(By.xpath("//div[@class='ui fluid search selection dropdown country_dropdown']/i")).click();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[@class=\"ui fluid search selection dropdown country_dropdown active visible\"]/div[2]/div[99]")).click();
		driver.findElement(By.xpath("//div[@class=\"ui fluid search selection dropdown timezone_dropdown\"]/i")).click();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[@class=\"menu transition visible\"]/div[282]")).click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[@class=\"actions\"]/div[2]")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.close();

	}

}
