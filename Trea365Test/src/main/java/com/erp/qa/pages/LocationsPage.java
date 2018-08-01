package com.erp.qa.pages;
import java.util.Iterator;
import java.util.Set;

import javax.naming.directory.SearchResult;

import org.eclipse.jetty.util.annotation.Name;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.erp.qa.base.TestBase;
import com.erp.qa.util.TestUtil;

public class LocationsPage extends TestBase{ 
	
	//Page Factory - OR:

TestUtil testUtil;
	
	@FindBy(xpath = "/html/body/trea-app-root/ng-component/div/div[2]/section/app-location-list/div[1]/div/h3")
	WebElement LocationPageTitle;
	
	@FindBy(xpath = "/html/body/trea-app-root/ng-component/div/div[2]/section/app-location-list/div[1]/div/div[1]/div[2]/button/span")

	WebElement NewLocationTypeBtn;
	
	@FindBy(xpath= "/html/body/trea-app-root/ng-component/div/div[2]/section/app-add-location/div/div[1]")
	WebElement NewLocationPageTitle;
	
	@FindBy(xpath = "/html/body/trea-app-root/ng-component/div/div[2]/section/app-add-location/div/div[2]/form/div[1]/div/div/div[2]/div[2]/div/select")
	
	WebElement LocationTypeSelection;
	
	@FindBy(xpath="//input[@id='Name']")
	WebElement LocationNameText;
	
	@FindBy(xpath= "//*[@id='shortForm']")
	WebElement ShortFormText;
	
	@FindBy(xpath="//*[@id='addressLine1']")
	WebElement AddressText;
	
	@FindBy(xpath="/html/body/trea-app-root/ng-component/div/div[2]/section/app-add-location/div/div[2]/form/div[3]/div/div/div/div[2]/div/div/div/div/span/img")
	WebElement PlusDivisionAddBtn;
	
	@FindBy(xpath="/html/body/trea-app-root/ng-component/div/div[2]/section/app-add-location/div/div[2]/form/div[3]/div/div/div/div[2]/div[1]/div/a/img")
	
	WebElement CancelDivisionAddBtn;
	
	@FindBy(xpath = "/html/body/trea-app-root/ng-component/div/div[2]/section/app-add-location/div/div[2]/form/div[4]/button[1]")
	WebElement NextBtn;
	
	@FindBy(xpath = "/html/body/trea-app-root/ng-component/div/div[2]/section/app-add-location/div/div[2]/form/div[4]/button[2]")
	WebElement CancelBtn;

	@FindBy(xpath ="//*[@id='submit-btn']")
	WebElement SubmitBtn;
	
	@FindBy(xpath = "/html/body/trea-app-root/ng-component/div/div[2]/section/app-location-review/div/div[2]/form/div[2]/button[2]")
	WebElement EditBtn;
	
	@FindBy(xpath = "//*[@id='cdk-overlay-2']/mat-dialog-container/ng-component/div/div[2]/div[1]")
	WebElement SuccessfullMsgPopup;
	
	@FindBy(xpath = "//*[@id='cdk-overlay-0']/mat-dialog-container/ng-component/div/div[2]/div[2]/button[2]/span")
	WebElement DoneBtnOnMsgPopup;
	
	@FindBy(xpath = "/html/body/trea-app-root/ng-component/div/div[2]/section/app-location-list/div[1]/div/div[1]/div[1]/div/input")
	WebElement SearchTextBox;
	
	@FindBy(xpath = "/html/body/trea-app-root/ng-component/div/div[2]/section/app-location-list/div[1]/div/div[1]/div[1]/div/button/span")
	WebElement SearchButton;
	
	@FindBy(xpath="/html/body/trea-app-root/ng-component/div/div[2]/section/app-location-list/div[1]/div/div[3]/div[1]/table/tbody/tr/td[1]")
	WebElement SearchedLocationType ;
		
	@FindBy(xpath = "/html/body/trea-app-root/ng-component/div/div[2]/section/app-location-list/div[1]/div/div[3]/div[1]/table/tbody/tr[2]/td[2]")
	WebElement SelectRecord;
	
	@FindBy(xpath = "/html/body/trea-app-root/ng-component/div/div[2]/section/app-location-list/div[1]/div/div[3]/div[3]/div[1]/span[2]/span/button/span")
	WebElement GridPrintLabelsBtn;
	
	@FindBy(xpath = "/html/body/trea-app-root/ng-component/div/div[2]/section/app-location-list/div[1]/div/div[3]/div[3]/div[1]/span[2]/span/ul/li[1]/a")
	WebElement GridPrintAllBtn;
	
	@FindBy(xpath = "/html/body/trea-app-root/ng-component/div/div[2]/section/app-location-list/div[1]/div/div[3]/div[3]/div[1]/span[2]/span/ul/li[2]/a")
	WebElement GridPrintBtn;
	@FindBy(xpath="//*[@id='cdk-overlay-3']/mat-dialog-container/ng-component/div[1]/span/i")
	WebElement CrossBtnOnPrintLocationPop;
	
	@FindBy(xpath = "/html/body/trea-app-root/ng-component/div/div[2]/section/app-location-list/div[1]/div/div[3]/div[3]/div[1]/span[2]/button")
	WebElement GridDeleteBtn;
	
	@FindBy(xpath = "//*[@id='cdk-overlay-5']/mat-dialog-container/ng-component/div/div[1]/div")
	WebElement DeleteConfirmationMsg;

	@FindBy(xpath = "//*[@id='remove-btn']")
	WebElement YesDelConfirmationBtn;
	
	@FindBy(xpath = "//*[@id='cdk-overlay-5']/mat-dialog-container/ng-component/div/div[1]/div")
	WebElement DeleteSuccessfulMsg;
	
	@FindBy(xpath = "//*[@id=\"cdk-overlay-0\"]/mat-dialog-container/ng-component/div/div[2]/div[2]/button")
	WebElement DoneBtnOnDeleteSuccessPopup;
	
	
	public LocationsPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void CreateNewLocationType(String LocationType , String LocationName , String ShortForm , String Address ) throws InterruptedException
	{

		NewLocationTypeBtn.click();
		Thread.sleep(3000);
		LocationTypeSelection.sendKeys(LocationType);
		LocationNameText.sendKeys(LocationName);
		ShortFormText.sendKeys(ShortForm);
		AddressText.sendKeys(Address);
		Thread.sleep(2000);
		NextBtn.click();
		Thread.sleep(2000);
		SubmitBtn.click();
		Thread.sleep(2000);
		DoneBtnOnMsgPopup.click();
		
	}
	
	public String SearchedLocationType(String ShortForm) throws InterruptedException
	{
		SearchTextBox.sendKeys(ShortForm);
		SearchButton.click();
		Thread.sleep(3000);
		return SearchedLocationType.getText();
		
	}
	
	public String PrintLocation(String OldShortForm, String NewShortForm) throws InterruptedException
	{
		SearchTextBox.sendKeys(OldShortForm);
		SearchButton.click();
		Thread.sleep(3000);
		SearchedLocationType.click();
		GridPrintLabelsBtn.click();
		GridPrintAllBtn.click();
		Set<String> handler = driver.getWindowHandles();
		Iterator <String> it = handler.iterator();
		String ParentWindowId= it.next();
		String ChildWindowId= it.next();
		
		it.next();
		driver.switchTo().window(ChildWindowId);
		
		driver.close();
		driver.switchTo().window(ParentWindowId);
		
		GridPrintLabelsBtn.click();
		GridPrintBtn.click();
		
		Thread.sleep(2000);
		CrossBtnOnPrintLocationPop.click();
		Thread.sleep(2000);
		SearchTextBox.clear();
		SearchTextBox.sendKeys(OldShortForm);
		SearchButton.click();
		Thread.sleep(3000);
		SearchedLocationType.click();
		return SearchedLocationType.getText();
	}

	public void DeleteLocationType(String LocationName) throws InterruptedException
	{
		SearchTextBox.sendKeys(LocationName);
		SearchButton.click();
		Thread.sleep(3000);
		SearchedLocationType.click();
		GridDeleteBtn.click();
		Thread.sleep(2000);
		YesDelConfirmationBtn.click();
		DoneBtnOnDeleteSuccessPopup.click();
	}

	
			
		
	
	}

	
	
	
	
	