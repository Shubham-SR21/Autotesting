package DemoLogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class MersikuliDemo
{
	public static void main(String[] args) throws FindFailed {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\chromedriver.exe");
		 WebDriver driver= new ChromeDriver();
		System.out.println("browser open");
		
		driver.get("http://demo.guru99.com/test/newtours/");
		driver.manage().window().maximize();
		
		Screen s= new Screen();
		Pattern usname=new Pattern("D:\\SC\\sikuli image\\Usname.PNG");

		Pattern pass=new Pattern("D:\\SC\\sikuli image\\password.PNG");

		Pattern submitbutton=new Pattern("D:\\SC\\sikuli image\\button.PNG");
		
		s.type(usname,"QQQQQ");
		s.type(pass,"qqqqq");
		
		s.click(submitbutton);

	}
}