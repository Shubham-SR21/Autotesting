package com.cjc.mt.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Appender;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.cjc.mt.pages.LoginPage;
import com.cjc.mt.pages.RegisterPages;


@Listeners(com.cjc.mt.Listener.ListenerDemo.class)
public class AllTest 
{
	WebDriver driver;
	
	Properties pro=new Properties();
	
	@Test(priority=-2)
	public void log4j() throws IOException
	{
		Logger log=Logger.getLogger(RegisterPages.class.getName());
		 Layout la=new PatternLayout(); 
		 Appender ap=new FileAppender(la,"excel.txt");
		 log.addAppender(ap);
	}
	@Test(priority=-1)
	public void Browser() throws IOException
	{
		Logger log=Logger.getLogger(RegisterPages.class.getName());

		FileInputStream fis=new FileInputStream("C:\\Users\\Dell\\git\\New\\Autotesting\\Jenkins\\src\\test\\resources\\Prop.properties");
		pro.load(fis);
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\chromedriver.exe");
		driver= new ChromeDriver();
		log.info("browser open");
		driver.manage().window().maximize();
		log.info("maximize window");
		driver.get(pro.getProperty("url"));
		String url=driver.getCurrentUrl();
		System.out.println("Current URL"+" :"+url);
		Assert.assertEquals("http://demo.guru99.com/test/newtours/register.php", url);
		log.info("Open url");
		
	}

    @Test(priority = 1)
	public void Registertest() throws IOException
	{
    	String title=driver.getTitle();
		System.out.println("Title"+": "+title);
		
		String exptitle= "Register: Mercury Tours";//if the title is different from actual title then remaining code does not execute.
		Assert.assertEquals(title,exptitle);//hard assert
		
		Logger log=Logger.getLogger(RegisterPages.class.getName());
		RegisterPages lp=PageFactory.initElements(driver, RegisterPages.class);
		 
		 FileInputStream fis=new FileInputStream("C:\\Users\\Dell\\git\\New\\Autotesting\\Jenkins\\src\\test\\resources\\Mtforjenkins.xlsx");
		 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		 XSSFWorkbook x=new XSSFWorkbook(fis);
		 XSSFSheet sheet=x.getSheet("Sheet1");
		 
		 int rows=sheet.getPhysicalNumberOfRows();	
		 System.out.println("Total No of rows"+rows);//Total no. of rows 3
		 

		    XSSFRow row=sheet.getRow(1);//1
	        XSSFCell col=row.getCell(0);
		    XSSFCell col1=row.getCell(1);
		    XSSFCell col2=row.getCell(2);
		    XSSFCell col3=row.getCell(3);
		    XSSFCell col4=row.getCell(4);
		    XSSFCell col5=row.getCell(5);
		    XSSFCell col6=row.getCell(6);
		    XSSFCell col7=row.getCell(7);
		    XSSFCell col8=row.getCell(8);
		    XSSFCell col9=row.getCell(9);
		    XSSFCell col10=row.getCell(10);
		    XSSFCell col11=row.getCell(11);
		    
		    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		    
		    String fname=col.getStringCellValue();
			log.info(fname);	
			String lname=col1.getStringCellValue();
			log.info(lname);
			String phoneno=col2.getStringCellValue();
			log.info(phoneno);
			String emailid=col3.getStringCellValue();
			log.info(emailid);
			String addr=col4.getStringCellValue();
			log.info(addr);
			String City=col5.getStringCellValue();
			log.info(City);
			String State=col6.getStringCellValue();
			log.info(State);
			String Pin=col7.getStringCellValue();
			log.info(Pin);
			String Country=col8.getStringCellValue();
			log.info(Country);
			String usname=col9.getStringCellValue();
			log.info(usname);
			String password=col10.getStringCellValue();
			log.info(password);
			String Cpassword=col11.getStringCellValue();
			log.info(Cpassword);
		
			
			lp.data(fname, lname, phoneno, emailid, addr, City, State, Pin, Country,usname, password, Cpassword);
			
			lp.registerbutton();
			

			lp.signoff();
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS); 
			
			  
			  
		 }
    @Test(priority =3)
    public void LoginTest() throws IOException
    {
		Logger log=Logger.getLogger(LoginPage.class.getName());

    	 LoginPage lp=PageFactory.initElements(driver, LoginPage.class);
    	 FileInputStream fis=new FileInputStream("C:\\Users\\Dell\\git\\New\\Autotesting\\Jenkins\\src\\test\\resources\\Mtforjenkins.xlsx");
		 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		 XSSFWorkbook x=new XSSFWorkbook(fis);
		 XSSFSheet sheet=x.getSheet("Sheet1");
		 
		 XSSFRow row=sheet.getRow(1);
		 XSSFCell col9=row.getCell(9);
		 XSSFCell col10=row.getCell(10);
		 
		 String usname=col9.getStringCellValue();
		 log.info(usname);
		 String password=col10.getStringCellValue();
		 log.info(password);

    	lp.logindata(usname, password); 
	    lp.Loginbutton();
    }
		  
}