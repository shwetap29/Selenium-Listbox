package com.company;

import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//Print unique contents of the listbox
public class UniqueContent_ListBox {
	public static void main(String args[]) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver","C:/Users/Shweta/Downloads/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Shweta/Desktop/Bridgelabz/ListBox_Breakfast.html");
		WebElement listElement = driver.findElement(By.id("mtr"));
		Select s = new Select(listElement);
		List<WebElement> allOptions = s.getOptions();
		int count = allOptions.size();
		System.out.println(count);
		System.out.println("---print the values in the list---");
		HashSet<String> allElements = new HashSet<String>();
		for(WebElement option : allOptions) {
			String text = option.getText();
			System.out.println(text);
			allElements.add(text);
		}
		System.out.println(allElements);
		
		
	}
}
