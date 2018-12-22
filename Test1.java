package development;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import beans.B1;

import api.I1;
import comp.C1;

public class Test1 extends C1 implements I1 {

	public static void main(String[] args) {
		
		/*WebDriver d;
		System.setProperty("webdriver.gecko.driver", "E:\\QualityThought\\Browser Drivers\\geckodriver.exe");
		d=new FirefoxDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		d.manage().timeouts().pageLoadTimeout(60,TimeUnit.SECONDS);	
		d.get("https://www.linkedin.com/");	*/
		I1 i=new C1();
		String a=i.i1();
		String b=i.i2();
		String c=i.i3();
		String d1=i.i4();
		String e=i.i5();
		System.out.println(a+ "  " +b+c+d1+e);
		B1 b123 = new B1();
		b123.me2();
		b123.me1();
		
		
	}

}
