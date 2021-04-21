package com.cjc.mt.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.cjc.mt.pages.LoginPages;

public class LoginPages {
	
	WebDriver driver;
	Logger log=Logger.getLogger(LoginPages.class.getName());
	
	
	 
	@FindBy(how=How.NAME,using ="firstName")
	WebElement firstname;
	@FindBy(how=How.NAME,using="lastName")
	WebElement lastname;
	@FindBy(how=How.NAME,using="phone")
	WebElement phoneNo;
	@FindBy(how=How.NAME,using="userName")
	WebElement email;
	@FindBy(how=How.NAME,using ="address1")
	WebElement address;
	@FindBy(how=How.NAME,using ="city")
	WebElement city;
	@FindBy(how=How.NAME,using ="state")
	WebElement state;
	@FindBy(how=How.NAME,using ="postalCode")
	WebElement pincode;
	@FindBy(how=How.NAME,using ="country")
	WebElement selectCountry;
	@FindBy(how=How.NAME,using ="email")
	WebElement uname;
	@FindBy(how=How.NAME,using ="password")
	WebElement pass;
	@FindBy(how=How.NAME,using ="confirmPassword")
	WebElement conpass;
	@FindBy(how=How.XPATH,using ="/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[17]/td/input")                
	WebElement button;
	
	
	@FindBy(how=How.XPATH,using ="/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[1]/a")
	WebElement signoff;
	@FindBy(how=How.XPATH,using ="/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[2]/td[2]/input")
	WebElement loginuname;
	@FindBy(how=How.XPATH,using ="/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[3]/td[2]/input")
	WebElement loginpass;
	@FindBy(how=How.XPATH,using ="/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[4]/td[2]/div/input")
	WebElement loginbutton;
	
	@FindBy(how=How.XPATH,using ="/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a")
	WebElement Registerlink;
	
	public LoginPages(WebDriver driver)
	{
		this.driver=driver;
		log.info("This is Our Constructor");
	}
	
	public void data(String fname,String lname,String phoneno, String emailid, String addr,
			String City,String State,String Pin,String country,String usname,String Password, String Cpassword )
	{
		firstname.sendKeys(fname);
		lastname.sendKeys(lname);
		phoneNo.sendKeys(phoneno);
		email.sendKeys(emailid);
		address.sendKeys(addr);
		city.sendKeys(City);
		state.sendKeys(State);
		pincode.sendKeys(Pin);
		//Select s=new Select(driver.findElement(By.name("country")));
		selectCountry.sendKeys(country);
		//s.selectByVisibleText("ALGERIA");
		uname.sendKeys(usname);
		pass.sendKeys(Password);
		conpass.sendKeys(Cpassword);
		log.warn("Here we are passed the data");
	}
	
	public void registerbutton()
	{
		button.click();
		log.info("Registeration is Successfull");
	}
	
	public void signoff()
	{
		signoff.click();
	}
	public void logindata(String usname, String password)
	{
		loginuname.sendKeys(usname);
		loginpass.sendKeys(password);
		
	}
	public void Loginbutton()
	{
		loginbutton.click();
		log.info("Login is Successfull");
	}
	public void registerlink()
	{
		Registerlink.click();
	}

}
