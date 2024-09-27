package com.mvn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumBy;

public class SwipeDemo extends BaseTest {
	
	public void swipe() throws InterruptedException {
		
		driver.findElement(AppiumBy.accessibilityId("Views")).click();	
		Thread.sleep(3000);

		driver.findElement(AppiumBy.accessibilityId("Gallery")).click();	
		Thread.sleep(3000);
		
		driver.findElement(AppiumBy.accessibilityId("1. Photos")).click();	
		Thread.sleep(3000);
		
		for (int i = 1; i <5; i++) {
			WebElement ele =driver.findElement(By.xpath("//android.widget.ImageView["+i+"]"));
			Thread.sleep(2000);
			swipeAction(ele, "left");
			Thread.sleep(2000);
		}
	}

}
