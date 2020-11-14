package Test1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class P2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		//ger all gold prices
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		/* headless
		
		ChromeOptions Options = new ChromeOptions();
		Options.addArguments("window-size=1400,800");
		Options.addArguments("headless");
		 = new ChromeDriver(Options);
		*/
		
		
		for(int k=2006 ; k<=2020 ; k++)
		{
		for(int j=1 ; j<=12 ; j++)
		{
		String mon = "https://www.livechennai.com/get_goldrate_history.asp?monthno="+j+"&yearno="+k;
		dr.get(mon);

		List<WebElement> tr = dr.findElements(By.tagName("tr"));
		int c1 = tr.size();
		
		for (int i=2;i<=c1-5;i++)
			
		{
		
		String Finalxpath1 = "/html/body/div[2]/div[1]/table/tbody/tr["+i+"]/td[1]";
		String Finalxpath2 = "/html/body/div[2]/div[1]/table/tbody/tr["+i+"]/td[2]";
		String Finalxpath3 = "/html/body/div[2]/div[1]/table/tbody/tr["+i+"]/td[3]";
		
		String Da = dr.findElement(By.xpath(Finalxpath1)).getText();
		String fourk =dr.findElement(By.xpath(Finalxpath2)).getText();
		String twok =dr.findElement(By.xpath(Finalxpath3)).getText();
		
		
	//   FileInputStream fis = new FileInputStream("D:\\gold.xlsx");
	//   Workbook wb= WorkbookFactory.create(fis);
		//for(int x=1; x<=10000 ;x++)
		//for(int y=1; y<=10000 ;y++)
		//{
		//wb.getSheet("Sheet1").createRow(x).createCell(1).setCellValue(Da);
		//wb.write(new FileOutputStream("D:\\gold.xlsx"));

	//	wb.getSheet("Sheet1").getRow(i).createCell(4).setCellValue(Da);
	//	wb.write(new FileOutputStream("D:\\gold.xlsx"));

		
	//	wb.getSheet("Sheet1").getRow(1).createCell(1).setCellValue(Da);
	//	wb.write(new FileOutputStream("D:\\gold.xlsx"));

	//	wb.getSheet("Sheet1").getRow(0).createCell(1).setCellValue(fourk);
	//	wb.write(new FileOutputStream("D:\\gold.xlsx"));

	//	wb.getSheet("Sheet1").getRow(0).createCell(2).setCellValue(twok);
	//	wb.write(new FileOutputStream("D:\\gold.xlsx"));
		
		System.out.println(Da +"," + fourk +","+ twok);
		}
		}
		}
		}
		}
		
		
