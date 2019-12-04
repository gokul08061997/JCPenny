package org.sample;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Executive extends Base {
	
	@BeforeClass
	public void launch() {
	start();	
	}
	
	@BeforeMethod
	public void startTime() {
		time();
	}
	
	@Test
	public  void product1() throws IOException, InterruptedException 
	{
		driver.get("https://www.jcpenney.com/");
		WebElement search = driver.findElement(By.id("searchInputId"));
		search.sendKeys(data(1,0));
		WebElement btn = driver.findElement(By.xpath("(//button[@type='button'])[1]"));
		btn.click();
		Thread.sleep(10000);
		WebElement btn1 = driver.findElement(By.xpath("(//h6[@class='_1TINY grid _2qRi-'])[1]"));
	    btn1.click();
	    WebElement f = driver.findElement(By.xpath("//select[@name='size'] "));
     	select(f);
     	Thread.sleep(5000);
	    WebElement btn2 = driver.findElement(By.xpath("(//button[@class='_3-u9M'])[2]"));
	    btn2.click();
	    Thread.sleep(5000);
	    WebElement btn3 = driver.findElement(By.xpath("(//p[text()='Add To Cart'])[1]"));
	    btn3.click();
	    Thread.sleep(10000);
	    WebElement btn5 = driver.findElement(By.xpath("(//button[@type='button'])[13]"));
	    btn5.click();
	    Thread.sleep(5000);
	    WebElement btn6 = driver.findElement(By.xpath("(//button[@type='button'])[15]"));
	    btn6.click();
	    Thread.sleep(5000);
	    WebElement txt = driver.findElement(By.xpath("//input[@name='email']"));
	    txt.sendKeys("gokulmsd007@gmail.com");
	    WebElement pass = driver.findElement(By.xpath("//input[@name='password']"));
	    pass.sendKeys("Pooja0806");
	    WebElement bt = driver.findElement(By.xpath("//button[text()='Sign In']"));
	    bt.click();
	}
	@AfterMethod
	public static void endTime() {
		time();
	}
	

}
