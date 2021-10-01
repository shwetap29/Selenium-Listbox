package com.company;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//Select a few elements in the list box from sample webpage
public class ListBox1 {
	public static void main(String args[])  {
		System.setProperty("webdriver.chrome.driver","C:/Users/Shweta/Downloads/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Shweta/Desktop/Bridgelabz/ListBox_Breakfast.html");
		WebElement list = driver.findElement(By.id("mtr"));

		//Create an object of select class and pass the address of the list box as an argument
		Select s = new Select(list);
		
		//getOptions() method returns a list of all the elements of the list box
		List<WebElement> options = s.getOptions();
		int size = options.size();
		System.out.println("Number of elements present inside the listbox is: "+size);
		
		//print all the elements present in the list box
		for(WebElement webElement : options) {
			String text = webElement.getText();
			System.out.println(text);
		}
		
		//selectByIndex() selects an element based on the index, here index starts with 0
		s.selectByIndex(0);
		
		//SelectByValue() method elects and element based on its value attribute.
		s.selectByValue("v");
		
		/*selectByVisisbleText() method elects an element based on the actual text that is visible to the user. For Instance if there are 
		  multiple poori present inside the listbox, it will select all the poori elements*/
		
		s.selectByVisibleText("POORI");
		
		System.out.println("*********************Print All Selected options*********************");
		
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		int size2 = allSelectedOptions.size();
		System.out.println("Number of items that is selected in  the listbox is: "+size2);
		System.out.println("Selected items are printed below");
		for(WebElement webElement : allSelectedOptions) {
			System.out.println(webElement.getText());
			
		}
		
		System.out.println("Check Weather it is a multiple select listbox or not");
		boolean multiple =s.isMultiple();
		
		System.out.println(multiple+ " yes,it is multi select");
		if(multiple) {
			
			//Print the first selected option in the list box
			WebElement firstSelectedOption= s.getFirstSelectedOption();
			System.out.println(firstSelectedOption.getText()+"is the first selected item in the list box");
			
			//deselect the item present in the 0th index
			s.deselectByIndex(0);
			
			//Print the first selected option in the list box
			WebElement firstSelectedOption1= s.getFirstSelectedOption();
			System.out.println(firstSelectedOption1.getText()+ "is the first selected item ");
			
			//Deselect an item which has an attribute called value and its value is "v"
			s.deselectByValue("v");
			
			//Print the first selected option in the list box 
			
			WebElement firstSelectedOption2= s.getFirstSelectedOption();
			System.out.println(firstSelectedOption2.getText()+ "is the first selected item ");
			
			s.deselectByVisibleText("POORI");
			
		}
				
		 
	}
}
