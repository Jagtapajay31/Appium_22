package com.mvn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class ScrollDemo extends BaseTest {
	
	@Test
	public void scroll() throws InterruptedException {
		
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		Thread.sleep(3000);
		
//		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector())" + ".scrollIntoView(text(\"WebView\"));"))
//		.click();
//		Thread.sleep(5000);
//		
//		driver.findElement(AppiumBy.accessibilityId("Animation")).click();
//		Thread.sleep(3000);
//		driver.findElement(AppiumBy.accessibilityId("Bouncing Balls")).click();
//		Thread.sleep(3000);
//		driver.findElement(AppiumBy.accessibilityId("Play")).click();
//		Thread.sleep(3000);
				
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector())" + ".scrollIntoView(text(\"Seek Bar\"));"))
		.click();
		Thread.sleep(2000);
		
		WebElement s1=driver.findElement(By.id("io.appium.android.apis:id/seek"));
		seekbar(s1);
		Thread.sleep(5000);
	}

}
