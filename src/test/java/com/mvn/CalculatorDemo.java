package com.mvn;

import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;

public class CalculatorDemo {
	
	@Test
	public void cal() throws InterruptedException, MalformedURLException {
		
		DesiredCapabilities cap=new DesiredCapabilities();
		
		cap.setCapability("deviceName", "realme RMX2195");
		cap.setCapability("udid","adb-ddaabb9f-hztC2Y._adb-tls-connect._tcp");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "11.0");
		cap.setCapability( "appPackage","com.dencreak.dlcalculator");
		cap.setCapability("appActivity","com.dencreak.dlcalculator.DLCalculatorActivity");
		cap.setCapability("automationName", "UIAutomator2");
		
		URL url=new URL("http://127.0.0.1:4723/");
		
		AppiumDriver driver=new AppiumDriver(url, cap);
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(2000);
		
		driver.findElement(By.id("com.dencreak.dlcalculator:id/pad_btn_d_a")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("com.dencreak.dlcalculator:id/pad_img_d_d")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("com.dencreak.dlcalculator:id/pad_btn_c_a")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("com.dencreak.dlcalculator:id/pad_img_e_d")).click();
		Thread.sleep(2000);
		String msg= driver.findElement(By.id("com.dencreak.dlcalculator:id/lay_normal_body_val")).getText();
		Thread.sleep(2000);
		
		System.out.println("sum is :"+ msg);
		
	}

}
