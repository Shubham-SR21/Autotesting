package com.cjc.mt.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.asserts.SoftAssert;

public class LoginPage
{
	WebDriver driver;

	Logger log= Logger.getLogger(LoginPage.class.getName());
	
	
	@FindBy(how=How.XPATH,using ="/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[2]/td[2]/input")
	WebElement loginuname;
	@FindBy(how=How.XPATH,using ="/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[3]/td[2]/input")
	WebElement loginpass;
	@FindBy(how=How.XPATH,using ="/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[4]/td[2]/div/input")
	WebElement loginbutton;
	
	@FindBy(how=How.XPATH,using ="/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a")
	WebElement Registerlink;
	
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		log.info("This is Our Constructor");
	}
	public void logindata(String usname, String password)
	{
		loginuname.sendKeys(usname);
		loginpass.sendKeys(password);
		
	}
	public void Loginbutton()
	{
		loginbutton.click();
		boolean text=driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/h3")).isDisplayed();
		SoftAssert sf=new SoftAssert();
		
		sf.assertEquals(text, true);
		System.out.println("Text is present  :"+text);
		sf.assertAll();
		log.info("Login is Successfull");
	}
	public void registerlink()
	{
		Registerlink.click();
	}
}
