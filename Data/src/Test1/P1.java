package Test1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		//WebDriver dr = new ChromeDriver();
		FileInputStream fis = new FileInputStream("D:\\gold.xlsx");
		Workbook wb= WorkbookFactory.create(fis);
		//create sheet
		wb.createSheet("automation").createRow(1).createCell(5).setCellValue("srilanka");
		wb.write(new FileOutputStream("D:\\gold.xlsx"));
		//get the string value
		String s1 = wb.getSheet("automation").getRow(1).getCell(5).getStringCellValue();
		//write a value
		wb.getSheet("automation").getRow(1).createCell(4).setCellValue(s1);
		wb.write(new FileOutputStream("D:\\gold.xlsx"));
		
		
		
	}

}
