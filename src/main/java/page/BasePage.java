package page;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

	public static int rng(int i) {
		Random rnd = new Random();
		int randomNumber = rnd.nextInt(999);
		return randomNumber;
	}

	public void selectDropdown(WebElement element, String visibleText) {
		Select sel = new Select(element);
		sel.selectByVisibleText(visibleText);
	}

	public void waitForElement(WebDriver driver, int timeInSecond, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, timeInSecond);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public void takeScreenshot(WebDriver driver) throws Throwable {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File sourceFile = ts.getScreenshotAs(OutputType.FILE);
		String currentDirectory = System.getProperty("user.dir");

		SimpleDateFormat formatter = new SimpleDateFormat("MMDDYY_HHMMSS");
		Date date = new Date();
		String lable = formatter.format(date);

		FileUtils.copyFile(sourceFile, new File(currentDirectory + "/screenshot/" + lable + ".png"));
	}
}