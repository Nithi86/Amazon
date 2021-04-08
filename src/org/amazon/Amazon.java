package org.amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\NITHYA\\eclipse-workspace\\Amazon\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
			driver.get("https://www.amazon.in/Laptops/b?ie=UTF8&node=1375424031&ref_=sd_allcat_sbc_mobcomp_laptops");
			WebElement txtXpath = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
			txtXpath.sendKeys("iphone");
			WebElement txtSearch = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
			txtSearch.click();
}
}