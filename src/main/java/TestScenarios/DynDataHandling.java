package TestScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DynDataHandling {

	WebDriver driver;
	@Test
	public void capthaHandling()
	{
		driver=new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Simple-Math-Captcha-Plugin-for-jQuery-ebcaptcha/demo/");
		driver.manage().window().maximize();
		String str=driver.findElement(By.id("ebcaptchatext")).getText();
		System.out.println(str);
		String str1=str.substring(8, 9);
		String str2=str.substring(12,13);
		System.out.println(str1);
		System.out.println(str2);
		Integer res=Integer.valueOf(str1) + Integer.valueOf(str2);
		driver.findElement(By.id("ebcaptchainput")).sendKeys(String.valueOf(res));
		boolean chkEnable=driver.findElement(By.xpath("//*[@id=\"form\"]/input[2]")).isEnabled();
		System.out.println(chkEnable);
		if(chkEnable==true)
		{
			System.out.println("Button is enable");
		}
		else
		{
			System.out.println("Button is disable");
		}
		driver.quit();
	}
}
