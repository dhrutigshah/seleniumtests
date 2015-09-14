import org.openqa.selenium.firefox.FirefoxDriver;


public class TestSelenium {

	public static void main(String[] args)
	{
	
		FirefoxDriver d1 = new FirefoxDriver();
		
		d1.get("http://www.google.com");
		d1.quit();

	}

}
