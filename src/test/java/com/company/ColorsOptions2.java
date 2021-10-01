package com.company;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ColorsOptions2 {
	public static void main(String args[]) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver","C:/Users/Shweta/Downloads/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.plus2net.com/html_tutorial/html_frmddl.php");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
		WebElement list = driver.findElement(By.xpath("//body/div[@id='body_content']/div[1]/span[1]/span[1]/select[1]"));
		Thread.sleep(2000);
		
		Select s = new Select(list);
		List<WebElement> options = s.getOptions();
		int size = options.size();
		System.out.println("Number of elements present inside the listbox is: "+ size);
		
		s.selectByIndex(2);
		Thread.sleep(2000);
		s.selectByValue("blue");
		Thread.sleep(2000);
		s.selectByVisibleText("Green");
		Thread.sleep(2000);
		
	}
	}
