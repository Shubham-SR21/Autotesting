package DemoLogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class Fblogin {
public static void main(String[] args) throws FindFailed {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\chromedriver.exe");
		 WebDriver driver= new ChromeDriver();
		System.out.println("browser open");
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		Screen s= new Screen();
		Pattern usname=new Pattern("D:\\SC\\sikuli image\\fbemail.PNG");

		Pattern pass=new Pattern("D:\\SC\\sikuli image\\fbpass.PNG");

		Pattern submitbutton=new Pattern("D:\\SC\\sikuli image\\fbbutton.PNG");
		
		s.type(usname,"shubhamrathod@gmail.com");
		s.type(pass,"rathod213");
		
		s.click(submitbutton);
}

}
