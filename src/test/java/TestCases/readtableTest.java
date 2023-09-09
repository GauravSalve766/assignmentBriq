package TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.readtable;

public class readtableTest extends TestBase{

	public static readtable page;
	
	@BeforeMethod
	public void setup() {
		initialisation();
		page = new readtable();
	}
	
	@Test
	public void tablereadtest() throws Exception{
		page.verifytable_read();
	}
	
	@AfterMethod
	public void exit() {
		driver.close();
	}
}
