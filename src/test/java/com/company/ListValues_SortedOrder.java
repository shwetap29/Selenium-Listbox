package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//Script to print content of listbox in sorted order
public class ListValues_SortedOrder {
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
		ArrayList<String>list = new ArrayList<String>();
		for(WebElement option : allOptions) {
			String text = option.getText();
			System.out.println(text);
			list.add(text);
		}
		Collections.sort(list);
		System.out.println("---print the value in sorted order---");
		for(String value: list) {
			System.out.println(value);
		}
		
	}
}
