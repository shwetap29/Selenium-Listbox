package com.company;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass_MultipleMethods {
	public static void main(String args[]) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver","C:/Users/Shweta/Downloads/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
			driver.get("http://techcanvass.com/Examples/multi-select.html");
			Select select = new Select(driver.findElement(By.id("multiselect")));
			
			select.selectByIndex(1);
			Thread.sleep(2000);
			select.selectByIndex(0);
			Thread.sleep(2000);
			select.selectByValue("opel");
			Thread.sleep(2000);
			select.selectByVisibleText("Honda");
			Thread.sleep(2000);

			WebElement option = select.getFirstSelectedOption();
			System.out.println("First Element :"+option.getText());


			List<WebElement> options = select.getAllSelectedOptions();
			for (WebElement option2 : options) {
			System.out.println("All Selected : "+option2.getText()); 
			}

			
			select.deselectByIndex(1);
			Thread.sleep(2000);
			select.deselectByValue("opel");
			Thread.sleep(2000);
			select.deselectByVisibleText("Honda");
			Thread.sleep(2000);
			
			List<WebElement> options7 = select.getAllSelectedOptions();
			for (WebElement option8 : options7) {
			System.out.println("All Selected  after Deslected : "+option8.getText()); 
			}
			
			select.deselectAll();
			Thread.sleep(2000);
			
			driver.quit();

			}
	}
