package ABPNews_live;

import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.POM.LiveTV;
import com.genericUtility.BaseClass;
import com.genericUtility.WebDriverUtility;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
@Listeners(com.genericUtility.Listeners.class)
public class Livetvpage extends BaseClass{
	@Test
	public void livetvpage() throws MalformedURLException, InterruptedException {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//android.widget.TextView[@text='(English)']")).click();
		//driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click();
		LiveTV lt = new LiveTV(driver);
		lt.livetvicon();
		
		Thread.sleep(36000);
		//lt.skipAd();
		
		lt.exoSub();		
		driver.pressKey(new KeyEvent(AndroidKey.MEDIA_PAUSE));
		Thread.sleep(5000);
		driver.pressKey(new KeyEvent(AndroidKey.MEDIA_PLAY));
		
		Thread.sleep(5000);
		lt.exoSub();	
		lt.qualityic();
		lt.lowres();
		Thread.sleep(5000);
		lt.exoSub();
		lt.qualityic();
		lt.mediumres();
		Thread.sleep(5000);
		lt.exoSub();
		lt.qualityic();
		lt.highres();
		Thread.sleep(5000);
		lt.exoSub();
		lt.qualityic();
		lt.autores();
		
		//full screen
		driver.rotate(ScreenOrientation.LANDSCAPE);
		Thread.sleep(6000);
		driver.rotate(ScreenOrientation.PORTRAIT);
		
		Thread.sleep(6000);
		lt.audioPlayIcon();
		Thread.sleep(6000);
		lt.vedioplayicon();
		driver.quit();
		
		
	
	}
}
