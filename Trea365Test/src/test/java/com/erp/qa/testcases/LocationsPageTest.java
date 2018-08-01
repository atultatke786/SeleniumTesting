package com.erp.qa.testcases;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.erp.qa.base.TestBase;
import com.erp.qa.pages.BusinessNaturePage;
import com.erp.qa.pages.HomePage;
import com.erp.qa.pages.LocationsPage;
import com.erp.qa.pages.LoginPage;
import com.erp.qa.util.TestUtil;
public class LocationsPageTest extends TestBase  {
	LoginPage loginPage;
	HomePage homePage;
	TestUtil testUtil;
	
	LocationsPage locationsPage;
	String sheetname= "Locations";
	
	
	public LocationsPageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setUp() throws InterruptedException {
		initialization();
		testUtil = new TestUtil();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		homePage.clickOnAdminTab();
		Thread.sleep(3000);
		locationsPage = homePage.clickOnLocationsLink();
		//driver.get("https://www.trea365.com/steam/#/csa/location-list");
		
		
		System.out.println("Showing Location type");
		Thread.sleep(3000);
	}
	
	@Test(priority=1,dataProvider="getTreaTestData")
	public void CreateLocationTypeTest(String LocationType, String LocationName , String ShortForm, String Address ) throws InterruptedException
	{
		locationsPage.CreateNewLocationType(LocationType, LocationName, ShortForm, Address );
		
	}
	
	@Test(priority=2,dataProvider="getTreaTestData")
	public void VerifySearchLocationType(String LocationType, String LocationName, String ShortForm, String Address) throws InterruptedException
	{
		Thread.sleep(3000);
		String SearchedText=locationsPage.SearchedLocationType(LocationType);
		Assert.assertEquals(SearchedText, LocationType,"Searched text not matched");
	}
	
	/*@Test(priority=3,dataProvider="getTreaTestData")
	public void EditBusinessTypeTest(String BUType, String ServiceType, String ServiceDef, String Price) throws InterruptedException
	{
		Thread.sleep(3000);
		String SearchedText=businessNaturePage.EditBuType(BUType,"TestBUNew");
		Assert.assertEquals(SearchedText, "TestBUNew","Edited BU text not matched:");
	} **/
	@Test(priority=3,dataProvider="getTreaTestData")
	public void DeleteLocationType(String LocationType, String LocationName, String ShortForm, String Address) throws InterruptedException
	{
		Thread.sleep(3000);
		locationsPage.DeleteLocationType(LocationName);
	}
	
	@DataProvider
	public Object[][] getTreaTestData()
	{
		Object data[][]=testUtil.getTestData(sheetname);
		return data;
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
}