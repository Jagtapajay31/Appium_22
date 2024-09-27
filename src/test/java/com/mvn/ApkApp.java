package com.mvn;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class ApkApp extends BaseTest {
	
	@Test
	public void app() throws InterruptedException {
		
		driver.findElement(AppiumBy.accessibilityId("App")).click();
		Thread.sleep(2000);
		
//		driver.findElement(AppiumBy.accessibilityId("Action Bar")).click();
//		Thread.sleep(2000);
//		
//			driver.findElement(AppiumBy.accessibilityId("Action Bar Mechanics")).click();
//			Thread.sleep(2000);
//			
//			driver.navigate().back();
//			Thread.sleep(2000);
//			
//			driver.findElement(AppiumBy.accessibilityId("Action Bar Tabs")).click();
//			Thread.sleep(2000);
//			
//			driver.findElement(AppiumBy.accessibilityId("Add new tab")).click();
//			Thread.sleep(2000);
//			
//			driver.findElement(AppiumBy.accessibilityId("Remove last tab")).click();
//			Thread.sleep(2000);
//			
//			driver.findElement(AppiumBy.accessibilityId("Toggle tab mode")).click();
//			Thread.sleep(2000);
//			
//			driver.findElement(AppiumBy.accessibilityId("Remove all tabs")).click();
//			Thread.sleep(2000);
//			
//			driver.navigate().back();
//			Thread.sleep(2000);
//			
//			driver.findElement(AppiumBy.accessibilityId("Action Bar Usage")).click();
//			Thread.sleep(2000);
//			
//			driver.navigate().back();
//			Thread.sleep(2000);
//			
//			driver.findElement(AppiumBy.accessibilityId("Action Provider")).click();
//			Thread.sleep(2000);
//			
//			driver.findElement(AppiumBy.accessibilityId("Settings Action Provider")).click();
//			Thread.sleep(2000);
//		
//			driver.navigate().back();
//			Thread.sleep(2000);
////		
////			driver.findElement(AppiumBy.accessibilityId("Share Action Provider")).click();
////			Thread.sleep(2000);
////			
////			driver.navigate().back();
////			Thread.sleep(2000);
			
//			driver.findElement(AppiumBy.accessibilityId("Display Options")).click();
//			Thread.sleep(2000);
//			
//			driver.findElement(AppiumBy.accessibilityId("DISPLAY_HOME_AS_UP")).click();
//			Thread.sleep(2000);
//			
//			driver.findElement(AppiumBy.accessibilityId("DISPLAY_SHOW_HOME")).click();
//			Thread.sleep(2000);
//			
//			driver.findElement(AppiumBy.accessibilityId("DISPLAY_USE_LOGO")).click();
//			Thread.sleep(2000);
//			
//			driver.findElement(AppiumBy.accessibilityId("DISPLAY_SHOW_TITLE")).click();
//			Thread.sleep(2000);
//			
//			driver.findElement(AppiumBy.accessibilityId("DISPLAY_SHOW_CUSTOM")).click();
//			Thread.sleep(2000);
//			
//			driver.findElement(AppiumBy.accessibilityId("Navigation")).click();
//			Thread.sleep(2000);
//			
//			driver.findElement(By.xpath("//android.widget.TextView[@text='TAB 1']")).click();
//			Thread.sleep(2000);
//			
//			driver.findElement(By.xpath("//android.widget.TextView[@text='TAB 2']")).click();
//			Thread.sleep(2000);
//			
//			driver.findElement(By.xpath("//android.widget.TextView[@text='TAB 3']")).click();
//			Thread.sleep(2000);
//			
//			driver.findElement(AppiumBy.accessibilityId("Cycle Custom View Gravity")).click();
//			Thread.sleep(2000);
//			
//			driver.navigate().back();
//			driver.navigate().back();
//			Thread.sleep(2000);
//		
//			
		driver.findElement(AppiumBy.accessibilityId("Activity")).click();
		Thread.sleep(2000);	
//		
//		driver.findElement(AppiumBy.accessibilityId("Animation")).click();
//		Thread.sleep(2000);
//
//			driver.findElement(AppiumBy.accessibilityId("Fade in")).click();
//			Thread.sleep(2000);
//			
//				driver.findElement(AppiumBy.accessibilityId("OK Cancel dialog with a message")).click();
//				Thread.sleep(2000);
//					driver.findElement(By.id("android:id/button1")).click();
//					Thread.sleep(2000);
//					
//				driver.findElement(AppiumBy.accessibilityId("OK Cancel dialog with a long message")).click();
//				Thread.sleep(2000);				
//					driver.findElement(By.id("android:id/button1")).click();
//					Thread.sleep(2000);		
//					
//				driver.findElement(AppiumBy.accessibilityId("OK Cancel dialog with ultra long message")).click();
//				Thread.sleep(2000);
//					driver.findElement(By.id("android:id/button1")).click();
//					Thread.sleep(2000);			
//					
//				driver.findElement(AppiumBy.accessibilityId("List dialog")).click();
//				Thread.sleep(2000);
//				driver.navigate().back();
//				Thread.sleep(2000);
//				
//				driver.findElement(AppiumBy.accessibilityId("Progress dialog")).click();
//				Thread.sleep(2000);
//				
//				driver.findElement(AppiumBy.accessibilityId("Single choice list")).click();
//				Thread.sleep(2000);
//				driver.findElement(By.xpath("//android.widget.CheckedTextView[@text='Traffic']")).click();
//				Thread.sleep(2000);
//				driver.findElement(By.id("android:id/button1")).click();
//				Thread.sleep(2000);
//				
//				driver.findElement(AppiumBy.accessibilityId("Repeat alarm")).click();
//				Thread.sleep(2000);
//				driver.findElement(By.id("android:id/text1")).click();
//				Thread.sleep(2000);
//				driver.findElement(By.id("android:id/button1")).click();
//				Thread.sleep(2000);
//				
//				
//				
////				driver.findElement(AppiumBy.accessibilityId("Send Call to VoiceMail")).click();
////				Thread.sleep(2000);
//				driver.findElement(AppiumBy.accessibilityId("Text Entry dialog")).click();
//				Thread.sleep(2000);
//					driver.findElement(By.id("io.appium.android.apis:id/username_edit")).sendKeys("tops");
//					Thread.sleep(2000);
//					driver.findElement(By.id("io.appium.android.apis:id/password_edit")).sendKeys("tops@123");
//					Thread.sleep(2000);
//					driver.findElement(By.id("android:id/button1")).click();
//					Thread.sleep(2000);
//				
//				driver.findElement(AppiumBy.accessibilityId("OK Cancel dialog with traditional theme")).click();
//				Thread.sleep(2000);
//				driver.findElement(By.id("android:id/button1")).click();
//				Thread.sleep(2000);
//				
//				driver.findElement(AppiumBy.accessibilityId("OK Cancel dialog with traditional theme")).click();
//				Thread.sleep(2000);
//				driver.findElement(By.id("android:id/button1")).click();
//				Thread.sleep(2000);
//			driver.navigate().back();
//			Thread.sleep(2000);
//			
//			driver.findElement(AppiumBy.accessibilityId("Zoom in")).click();
//			Thread.sleep(2000);
//			driver.navigate().back();
//			Thread.sleep(2000);
//			
//			driver.findElement(AppiumBy.accessibilityId("Modern fade in")).click();
//			Thread.sleep(2000);
//			driver.navigate().back();
//			Thread.sleep(2000);
//			
//			driver.findElement(AppiumBy.accessibilityId("Modern zoom in")).click();
//			Thread.sleep(2000);
//			driver.navigate().back();
//			Thread.sleep(2000);
//			
//			driver.findElement(AppiumBy.accessibilityId("Scale up")).click();
//			Thread.sleep(2000);
//			driver.navigate().back();
//			Thread.sleep(2000);
//			
//			driver.findElement(AppiumBy.accessibilityId("Thumbnail zoom")).click();
//			Thread.sleep(2000);
//			driver.navigate().back();
//			Thread.sleep(2000);
		
		
		
		
		
//		driver.findElement(AppiumBy.accessibilityId("Custom Dialog")).click();
//		Thread.sleep(2000);
//		driver.navigate().back();
//		Thread.sleep(2000);
//		
//		driver.findElement(AppiumBy.accessibilityId("Custom Title")).click();
//		Thread.sleep(2000);
//			driver.findElement(By.id("io.appium.android.apis:id/left_text_edit")).sendKeys("Tops");
//			Thread.sleep(2000);
//			driver.findElement(AppiumBy.accessibilityId("Change Left")).click();
//			Thread.sleep(2000);
//			driver.findElement(By.id("io.appium.android.apis:id/right_text_edit")).sendKeys("Tech301");
//			Thread.sleep(2000);
//			driver.findElement(AppiumBy.accessibilityId("Change Right")).click();
//			Thread.sleep(2000);
//			
//		driver.navigate().back();
//		Thread.sleep(2000);
//		
//		driver.findElement(AppiumBy.accessibilityId("Dialog")).click();
//		Thread.sleep(2000);
//		driver.findElement(AppiumBy.accessibilityId("Add content")).click();
//		Thread.sleep(2000);
//		driver.findElement(AppiumBy.accessibilityId("Remove content")).click();
//		Thread.sleep(2000);
//		driver.navigate().back();
//		Thread.sleep(2000);
//		
//		
//		driver.findElement(AppiumBy.accessibilityId("Finish Affinity")).click();
//		Thread.sleep(2000);
//		for (int i = 1; i < 3; i++) {
//			driver.findElement(AppiumBy.accessibilityId("Nest some more")).click();
//			Thread.sleep(2000);
//		}
//		driver.findElement(AppiumBy.accessibilityId("FINISH!")).click();
//		Thread.sleep(2000);
//		
//		
//		driver.findElement(AppiumBy.accessibilityId("Forwarding")).click();
//		Thread.sleep(2000);
//			driver.findElement(AppiumBy.accessibilityId("Go")).click();
//			Thread.sleep(2000);
//			driver.navigate().back();
//			Thread.sleep(2000);
//		
//		driver.findElement(AppiumBy.accessibilityId("Hello World")).click();
//		Thread.sleep(2000);
//		driver.navigate().back();
//		Thread.sleep(2000);
//		
//		driver.findElement(AppiumBy.accessibilityId("Intent Activity Flags")).click();
//		Thread.sleep(2000);
//		driver.navigate().back();
//		Thread.sleep(2000);
//		
//		driver.findElement(AppiumBy.accessibilityId("Intents")).click();
//		Thread.sleep(2000);
//		driver.navigate().back();
//		Thread.sleep(2000);
//		
//		driver.findElement(AppiumBy.accessibilityId("Persistent State")).click();
//		Thread.sleep(2000);
//		driver.navigate().back();
//		Thread.sleep(2000);
		
//		driver.findElement(AppiumBy.accessibilityId("Presentation")).click();
//		Thread.sleep(2000);
//		driver.findElement(AppiumBy.accessibilityId("Show all displays")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.id("io.appium.android.apis:id/checkbox_presentation")).click();
//		Thread.sleep(2000);
//		driver.navigate().back();
//		driver.navigate().back();
//		Thread.sleep(2000);
//		
//		
//		driver.findElement(AppiumBy.accessibilityId("Presentation with Media Router")).click();
//		Thread.sleep(2000);
//		driver.navigate().back();
//		Thread.sleep(2000);		
		
//		driver.findElement(AppiumBy.accessibilityId("QuickContactsDemo")).click();
//		Thread.sleep(2000);
		
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector())" + ""
				+ ".scrollIntoView(text(\"Receive Result\"));"))
		.click();
		Thread.sleep(2000);
//		driver.findElement(AppiumBy.accessibilityId("Get Result")).click();
//		Thread.sleep(2000);
//		driver.findElement(AppiumBy.accessibilityId("Corky")).click();
//		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
//		
//		driver.findElement(AppiumBy.accessibilityId("Recreate")).click();
//		Thread.sleep(2000);
//		driver.navigate().back();
//		Thread.sleep(2000);
//		
//		driver.findElement(AppiumBy.accessibilityId("Redirection")).click();
//		Thread.sleep(2000);
//		driver.navigate().back();
//		Thread.sleep(2000);
//		
//		driver.findElement(AppiumBy.accessibilityId("Reorder Activities")).click();
//		Thread.sleep(2000);
//		driver.navigate().back();
//		Thread.sleep(2000);
//		
//		driver.findElement(AppiumBy.accessibilityId("Save & Restore State")).click();
//		Thread.sleep(2000);
//		driver.navigate().back();
//		Thread.sleep(2000);
//		
//		driver.findElement(AppiumBy.accessibilityId("Screen Orientation")).click();
//		Thread.sleep(2000);
//		driver.navigate().back();
//		Thread.sleep(2000);
//		
		driver.findElement(AppiumBy.accessibilityId("Secure Surfaces")).click();
		Thread.sleep(2000);
				driver.findElement(AppiumBy.accessibilityId("Secure Dialog")).click();
				Thread.sleep(2000);
				driver.findElement(AppiumBy.accessibilityId("Show secure dialog")).click();
				Thread.sleep(2000);
				driver.findElement(By.id("android:id/button1")).click();
				Thread.sleep(2000);
				driver.navigate().back();
				Thread.sleep(2000);
			
			driver.findElement(AppiumBy.accessibilityId("Secure Surface View")).click();
			Thread.sleep(2000);	
			driver.navigate().back();
			Thread.sleep(2000);
			
			driver.findElement(AppiumBy.accessibilityId("Secure Window")).click();
			Thread.sleep(2000);
			driver.navigate().back();
			driver.navigate().back();
			Thread.sleep(2000);
		
		
//		driver.findElement(AppiumBy.accessibilityId("SetWallpaper")).click();
//		Thread.sleep(2000);
		
		driver.findElement(AppiumBy.accessibilityId("Soft Input Modes")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		
		driver.findElement(AppiumBy.accessibilityId("Translucent")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		
		driver.findElement(AppiumBy.accessibilityId("Translucent Blur")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		
		driver.findElement(AppiumBy.accessibilityId("Wallpaper")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		
//		driver.findElement(AppiumBy.accessibilityId("Alarm")).click();
//		Thread.sleep(2000);
//
//		driver.navigate().back();
//		Thread.sleep(2000);
//		
//		driver.findElement(AppiumBy.accessibilityId("Alert Dialogs")).click();
//		Thread.sleep(2000);
//
//		driver.navigate().back();
//		Thread.sleep(2000);
//		
//		driver.findElement(AppiumBy.accessibilityId("Device Admin")).click();
//		Thread.sleep(2000);
//
//		driver.navigate().back();
//		Thread.sleep(2000);
//		
//		driver.findElement(AppiumBy.accessibilityId("Fragment")).click();
//		Thread.sleep(2000);
//
//		driver.navigate().back();
//		Thread.sleep(2000);
//		
//		driver.findElement(AppiumBy.accessibilityId("Launcher Shortcuts")).click();
//		Thread.sleep(2000);
//
//		driver.navigate().back();
//		Thread.sleep(2000);
//		
//		driver.findElement(AppiumBy.accessibilityId("Loader")).click();
//		Thread.sleep(2000);
//
//		driver.navigate().back();
//		Thread.sleep(2000);
//		
//		driver.findElement(AppiumBy.accessibilityId("Menu")).click();
//		Thread.sleep(2000);
//
//		driver.navigate().back();
//		Thread.sleep(2000);
//		
//		driver.findElement(AppiumBy.accessibilityId("Notification")).click();
//		Thread.sleep(2000);
//
//		driver.navigate().back();
//		Thread.sleep(2000);
//		
//		driver.findElement(AppiumBy.accessibilityId("Search")).click();
//		Thread.sleep(2000);
//
//		driver.navigate().back();
//		Thread.sleep(2000);
//
//		driver.findElement(AppiumBy.accessibilityId("Service")).click();
//		Thread.sleep(2000);
//		
//		driver.navigate().back();
//		Thread.sleep(2000);
//		
//		driver.findElement(AppiumBy.accessibilityId("Text-To-Speech")).click();
//		Thread.sleep(2000);
//		
//		driver.navigate().back();
//		Thread.sleep(2000);
//		
//		driver.findElement(AppiumBy.accessibilityId("Voice Recognition")).click();
//		Thread.sleep(2000);
//		
//		driver.navigate().back();
//		Thread.sleep(2000);
//		
//		
//		
	}
}
