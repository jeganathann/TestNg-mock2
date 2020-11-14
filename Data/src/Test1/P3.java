package Test1;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ByIdOrName;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.pagefactory.ByAll;
import org.openqa.selenium.support.pagefactory.ByChained;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import StepDef.EventFiringWebdriver;
import StepDef.TakesScreenShot;

public class P3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe"); 
		WebDriver dr = new ChromeDriver();
		//headless
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe"); 
		ChromeOptions Options = new ChromeOptions();
		Options.addArguments("window-size=1400,800");
		Options.addArguments("headless");
		dr = new ChromeDriver(Options);
		
		dr.close();
		dr.quit();
		dr.get("");
		
		dr.findElement(By.id("")).sendKeys("");
		dr.findElement(By.name("")).sendKeys("");
		dr.findElement(By.linkText("")).sendKeys("");
		dr.findElement(By.partialLinkText("")).sendKeys("");
		dr.findElement(By.className("")).sendKeys("");
		dr.findElement(By.tagName("")).sendKeys("");
		dr.findElement(By.cssSelector("")).sendKeys("");
		dr.findElement(By.xpath("")).sendKeys("");
		
		


		dr.findElement(By.id("")).click();
		dr.findElement(By.id("")).submit();
		String s5 =dr.findElement(By.id("")).getTagName();
		WebElement s30 = dr.findElement(By.id(""));
		
		String s6 =dr.getCurrentUrl();
		String s7 =dr.getPageSource();
		String s8 = dr.getTitle();
		List<WebElement> s11=dr.findElements(By.id(""));

		String s9 =dr.getWindowHandle();
		Set<String> s10 = dr.getWindowHandles();
		
		
		dr.findElement(new ByAll(By.name(""),By.id(""),By.partialLinkText(""))).sendKeys("perumal");
		dr.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		dr.findElement(new ByIdOrName("")).sendKeys("perumal");
		
		dr.findElement(new ByChained(By.id(""),By.xpath(""))).sendKeys("perumal");
				
		WebElement email = dr.findElement(By.id(""));
		StringBuilder sb = new StringBuilder().append("piwteam74_testing").append("@").append("mobiusservices.com");
		email.sendKeys(sb);
		
		StringBuffer sbb = new StringBuffer().append("Mobius").append("@").append("123");
		
		//--
		
		WebElement Ele1 = dr.findElement(By.id(""));
		Ele1.findElement(By.id("")).sendKeys("");
		Ele1.findElement(By.name("")).sendKeys("");
		Ele1.findElement(By.linkText("")).sendKeys("");
		Ele1.findElement(By.partialLinkText("")).sendKeys("");
		Ele1.findElement(By.className("")).sendKeys("");
		Ele1.findElement(By.tagName("")).sendKeys("");
		Ele1.findElement(By.cssSelector("")).sendKeys("");
		Ele1.findElement(By.xpath("")).sendKeys("");
		List<WebElement> s31 = Ele1.findElements(By.id(""));
		
		Ele1.clear();
		Ele1.click();
		Ele1.sendKeys("");
		Ele1.submit();
		
		String s12 =Ele1.getAttribute("");
		String s13 =Ele1.getCssValue("");
		Point s32 =Ele1.getLocation();
		Rectangle s33=Ele1.getRect();
		Dimension s34 =Ele1.getSize();
		String s14 =Ele1.getTagName();
		String s15 =Ele1.getText();
		
		boolean s35 = Ele1.isDisplayed();
		boolean s36 = Ele1.isEnabled();
		boolean s37 = Ele1.isSelected();
		
		EventFiringWebDriver es = new EventFiringWebDriver(dr);
		File f1 = es.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f1, new File("D:\\1.jpg"));
		
		File f2 =((TakesScreenshot)dr).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(f2, new File("D:\\1.jpg"));
		
		//Navigation
		dr.navigate().back();
		dr.navigate().forward();
		dr.navigate().refresh();
		dr.navigate().to("");
		
		//Target Locator
		dr.switchTo().activeElement();
		
		dr.switchTo().window(nameOrHandle);

		dr.switchTo().defaultContent();
		dr.switchTo().frame(index);
		dr.switchTo().frame(nameOrId);
		dr.switchTo().frame(frameElement);
		dr.switchTo().parentFrame();
		
		dr.switchTo().alert().accept();
		dr.switchTo().alert().dismiss();
		dr.switchTo().alert().sendKeys("");
		String s16 =dr.switchTo().alert().getText();
		
		dr.manage().addCookie(cookie);
		dr.manage().deleteAllCookies();
		dr.manage().deleteCookie(cookie);
		dr.manage().deleteCookieNamed(name);
		Cookie s36 =dr.manage().getCookieNamed(name);
		Set<Cookie> s = dr.manage().getCookies();
		
		dr.manage().window().fullscreen();
		dr.manage().window().maximize();
		Point s17 = dr.manage().window().getPosition();
		Dimension s18 = dr.manage().window().getSize();
		dr.manage().window().setPosition(-8,-8);
		dr.manage().window().setSize(1382,744);
		
		int s19 =dr.manage().window().getPosition().getX();
		int s20 =dr.manage().window().getPosition().getY();
		int s21 =dr.manage().window().getSize().getHeight();
		int s22 =dr.manage().window().getSize().getWidth();
		
		dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		dr.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		dr.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);
		
		Select s2 = new Select(Ele1);
		s2.deselectAll();
		s2.deselectByIndex(index);
		s2.deselectByValue(value);
		s2.deselectByVisibleText(text);
		List<WebElement> s41 = s2.getAllSelectedOptions();
		WebElement s40 =s2.getFirstSelectedOption();
		List<WebElement> s23 =s2.getOptions();
		Boolean s42 =s2.isMultiple();
		WebElement s43 =s2.getWrappedElement();
		s2.selectByIndex(index);
		s2.selectByValue(value);
		s2.selectByVisibleText(text);
		
		int s44 = s2.getOptions().size();
		
		WebElement e1 = dr.findElement(By.id(""));
		e1.sendKeys(Keys.chord("Teting"));
		e1.sendKeys(Keys.CONTROL,"A");
		e1.sendKeys(Keys.CONTROL,"X");
		e1.sendKeys(Keys.END);
		e1.sendKeys(Keys.HOME);
		e1.sendKeys(Keys.ARROW_DOWN);
		e1.sendKeys(Keys.ARROW_UP);
		e1.sendKeys(Keys.SHIFT,"V");
		e1.sendKeys(Keys.TAB);
		e1.sendKeys(Keys.ENTER);
		
		Actions act = new Actions(dr);
		act.click();
		act.clickAndHold();
		act.contextClick();
		act.doubleClick();
		act.dragAndDrop(source, target);
		act.dragAndDropBy(source, xOffset, yOffset);
		act.keyDown(key);
		act.keyUp(key);
		act.moveByOffset(xOffset, yOffset);
		act.moveToElement(target);
		act.pause(duration);
		act.release();
		act.sendKeys(Keys.ENTER);
		act.tick(action);
		act.build();
		act.perform();
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_F5);
		robot.keyRelease(KeyEvent.VK_F5);
		robot.keyPress(KeyEvent.VK_UNDERSCORE);
		robot.keyRelease(KeyEvent.VK_UNDERSCORE);
				
		WebDriverWait wait = new WebDriverWait(dr, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("")));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("")));
		wait.until(ExpectedConditions.elementToBeSelected(By.id("")));
	
		//JavaScript Executor
		//--to type text in selenium webdriver without sendkeys()
		JavascriptExecutor js = (JavascriptExecutor) dr;
		js.executeScript("document.getElementById('q')[0].value='Raja'");
		js.executeScript("document.getElementByName('q')[0].value='Raja'");
		js.executeScript("document.getElementBytagName('q')[0].value='Raja'");
		js.executeScript("document.getElementBylinkText('q')[0].value='Raja'");
		js.executeScript("document.getElementBypartialLinkText('q')[0].value='Raja'");
		js.executeScript("document.getElementBycssSelector('q')[0].value='Raja'");
		js.executeScript("document.getElementByxpath('q')[0].value='Raja'");
		js.executeScript("document.getElementByclassName('q')[0].value='Raja'");
					
		//--generate alert
		js.executeScript("alert('welcome');");
		
		//refresh, get title domain,url
		js.executeScript("history.go(0);");
		String s1 = js.executeScript("return document.title;").toString();
		String s4 = js.executeScript("return document.domain;").toString();
		String s3 = js.executeScript("return document.URL;").toString();
		
		//navigate to different page using JS
		js.executeScript("window.location='https:linkedin'");
		
		//to find hidden element in selenium using JSE
		js.executeScript("arguments[0].click();", element);
		
		//to click a button in selenium webdriver using javascript
		WebElement e22 = dr.findElement(By.id(""));
		js.executeScript("arguments[0].click();", e22);
		js.executeScript("documet.getElementById('next').click();");
		
		//to handle checkbox
		js.executeScript("document.getElementById('next').checked=false;");
		
		// to get innertext of the entire webpage
		String S21 = js.executeScript("return document.documentElement.innerText; ").toString();
		
		//scroll down-vertical
		js.executeScript("window.scrollBy(0,50)");
		
	    //scroll end
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		js.executeScript("$('window.scrollBy(0,document.body.scrollHeight').hover()");
			
		js.executeScript("arguments[0].click();", e22);
		js.executeScript("arguments[0].style.border='3px Solid blue'", e22);
		js.executeScript("arguments[0].style.backgroundColor='Red", e22);

		
		//multiple windows way 1
		Set<String> handles = dr.getWindowHandles();
		
		for(String newwin : handles)
		{
			dr.switchTo().window(newwin);
		}
		
		int num = dr.getWindowHandles().size();
		
		//multiple windows way 2
		String oldwin=dr.getWindowHandle();
		
		Set<String> handles2 = dr.getWindowHandles();
		
		for(String newwin : handles2)
		{
			if(!newwin.equals(oldwin))
			dr.switchTo().window(newwin);
			dr.close();
		}
		
		// file available or not in local
		File fileLocation = new File("D:\\Elcot\\jegan\\downlod");
		File[] f =fileLocation.listFiles();
		for(File file : f)
		{
			file.getName().equals("Download.xls");
			System.out.println("available");
			break;
		}
		
		//Data driven
		FileInputStream fis = new FileInputStream("D:\\gold.xlsx");
		Workbook wb= WorkbookFactory.create(fis);
		//create sheet
		wb.createSheet("automation").createRow(1).createCell(5).setCellValue("srilanka");
		wb.write(new FileOutputStream("D:\\gold.xlsx"));
		//get the string value
		String s47 = wb.getSheet("automation").getRow(1).getCell(5).getStringCellValue();
		//write a value
		wb.getSheet("automation").getRow(1).createCell(4).setCellValue(s1);
		wb.write(new FileOutputStream("D:\\gold.xlsx"));
		
		//known attributes
		dr.findElement(By.xpath("//*[@id='PIM_ProductDet']/div[2]/table/tbody/tr[1]/td[8]/span")).sendKeys("");
		dr.findElement(By.xpath("//*[@id='PIM_ProductDet']/div[2]/table/tbody/tr[1]/td[8]/span")).sendKeys("");
		//known elements and attributes
		dr.findElement(By.xpath("//input[@id='products']")).sendKeys("");
		dr.findElement(By.xpath("//input[@name='products']")).sendKeys("");
		//known visible text
		dr.findElement(By.xpath("//input[text()='products']")).sendKeys("");
		//known partial visible text
		dr.findElement(By.xpath("//input[contains(text()='products')]")).sendKeys("");
		//multiattributes
		dr.findElement(By.xpath("//input[@id='products'][@name='products'][@classname='products'][@tagname='products'][@linktext='products'][@partiallinktext='products']")).sendKeys("");
		
		//known starting & ending visible text
		dr.findElement(By.xpath("//input[starts-with(text()='products')]")).sendKeys("");
		
		dr.findElement(By.xpath("//input[starts-with(@attribute,'products')]")).sendKeys("");

		dr.findElement(By.xpath("//input[ends-with(text()='products')]")).sendKeys("");
		
		dr.findElement(By.xpath("//input[ends-with(@attribute,'products')]")).sendKeys("");


		//dynamic attribute values
		dr.findElement(By.xpath("//input[Starts-with(@id='products']")).sendKeys("");
		dr.findElement(By.xpath("//input[contains(@id='products']")).sendKeys("");
		
		dr.findElement(By.xpath("//input[normalize-space(text())='products']")).sendKeys("");
		
		//last()
		
		dr.findElement(By.xpath("//input[last()]")).sendKeys("");
		
		//Position()
		
		dr.findElement(By.xpath("//input[Position()=2]")).sendKeys("");
		
		//String-length based on text(), @attribute
		
		dr.findElement(By.xpath("//input[String-length(text()=8)]")).sendKeys("");
		
		dr.findElement(By.xpath("//input[String-length(@id)=7)]")).sendKeys("");
		
		//x-path axes (relative)
		
		dr.findElement(By.xpath("//input[@id='products']//parent::input")).sendKeys("");
		dr.findElement(By.xpath("//input[@id='products']//child::input")).sendKeys("");
		dr.findElement(By.xpath("//input[@id='products']//ancestors::input")).sendKeys("");
		dr.findElement(By.xpath("//input[@id='products']//following::input[2]")).sendKeys("");
		dr.findElement(By.xpath("//input[@id='products']//preceding::input[4]")).sendKeys("");
		dr.findElement(By.xpath("//input[@id='products']//following-sibling::input[2]")).sendKeys("");
		dr.findElement(By.xpath("//input[@id='products']//preceding-sibling::input[2]")).sendKeys("");
		
		dr.findElement(By.xpath("//input[text()>20]")).sendKeys("");
		dr.findElement(By.xpath("//input[@id()<20]")).sendKeys("");
		dr.findElement(By.xpath("//input[text()>20][@id()<20]")).sendKeys("");

		
		dr.findElement(By.xpath("//input[@id='products']//self::input")).sendKeys("");

		dr.findElement(By.xpath("//input[@id='products']//attribute::input")).sendKeys("");
		
		dr.findElement(By.xpath("//input[@id='products']//descendant::input")).sendKeys("");

		dr.findElement(By.xpath("//input[@id='products']//descendant-or-self::input")).sendKeys("");
		
		dr.findElement(By.xpath("//input[@id='products']//ancestors-or-self::input")).sendKeys("");



	}

}
