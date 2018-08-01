package com.erp.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.erp.qa.base.TestBase;

public class HomePage extends TestBase {

	@FindBy(xpath = "/html/body/trea-app-root/ng-component/div/header/nav/div/ul/li[1]/a/span")
	@CacheLookup
	WebElement userNameLabel;
	
	@FindBy(xpath = "/html/body/trea-app-root/ng-component/div/div[2]/section/app-summary/div/div[1]")
	@CacheLookup
	WebElement HomePageTitle;
	
	

	@FindBy(xpath = "//*[@id='leftside-navigation']/ul/li[2]/a/span[1]")
	WebElement AdminTab;
	
	@FindBy(xpath = "//*[@id='leftside-navigation']/ul/li[2]/ul/li[1]/a")
	WebElement NatureofBusinessLink;
	
	@FindBy(xpath = "//*[@id='leftside-navigation']/ul/li[2]/ul/li[2]/a")
	WebElement LocationsLink;
	
	@FindBy(xpath="//*[@id='leftside-navigation']/ul/li[2]/ul/li[3]/a")
	WebElement MFGLink;
	
	@FindBy(xpath="//*[@id='leftside-navigation']/ul/li[2]/ul/li[4]/a")
	WebElement ItemDefinitionLink;
	@FindBy(xpath="//*[@id='leftside-navigation']/ul/li[2]/ul/li[5]/a")
	WebElement ItemCategoriesLink;
	@FindBy(xpath="//*[@id='leftside-navigation']/ul/li[2]/ul/li[6]/a")
	WebElement SuppliersLink;
	@FindBy(xpath="//*[@id='leftside-navigation']/ul/li[2]/ul/li[7]/a")
	WebElement PermissionsLink ;
	@FindBy(xpath="//*[@id='leftside-navigation']/ul/li[2]/ul/li[8]/a")
	WebElement LabelsLink;
	@FindBy(xpath ="//*[@id=\"leftside-navigation\"]/ul/li[3]/a/span[1]")
	WebElement InventoryTab ;
	@FindBy(xpath ="//*[@id='leftside-navigation']/ul/li[3]/ul/li[1]/a")
	WebElement ProductsLink;
	@FindBy(xpath ="//*[@id='leftside-navigation']/ul/li[3]/ul/li[2]/a")
	WebElement AssetsLink;
	
	@FindBy(xpath ="//*[@id='leftside-navigation']/ul/li[3]/ul/li[3]/a")
	WebElement MaterialLink;
	
	@FindBy(xpath ="//*[@id='leftside-navigation']/ul/li[3]/ul/li[4]/a")
	WebElement MaintenanceLink ;
	
	@FindBy(xpath ="//*[@id='leftside-navigation']/ul/li[3]/ul/li[5]/a")
	WebElement PurchaseOrdersLink;
	
	@FindBy(xpath ="//*[@id='leftside-navigation']/ul/li[3]/ul/li[6]/a")
	WebElement RecievingSlipLink;
	
	@FindBy(xpath ="//*[@id='leftside-navigation']/ul/li[3]/ul/li[7]/a")
	WebElement AuditLink ;
	
	@FindBy(xpath ="//*[@id='leftside-navigation']/ul/li[4]/a/span[1]")
	WebElement WorkflowTab;
	
	
	@FindBy(xpath ="//*[@id='leftside-navigation']/ul/li[4]/ul/li[1]/a")
	WebElement ProjectEstimatorLink;
	
	@FindBy(xpath ="//*[@id='leftside-navigation']/ul/li[4]/ul/li[2]/a")
	WebElement WorkOrdersLink;
	
	@FindBy(xpath ="//*[@id='leftside-navigation']/ul/li[4]/ul/li[3]/a")
	WebElement SchedulingLink;
	
	@FindBy(xpath ="//*[@id='leftside-navigation']/ul/li[5]/a/span")
	WebElement CRMLink;
	
	@FindBy(xpath ="//*[@id='leftside-navigation']/ul/li[6]/a/span[1]")
	WebElement HRTab;
	
	@FindBy(xpath ="//*[@id='leftside-navigation']/ul/li[6]/ul/li[1]/a")
	WebElement EmployeesLink;
	
	@FindBy(xpath ="//*[@id='leftside-navigation']/ul/li[6]/ul/li[2]/a")
	WebElement SubContractorLink;
	
	@FindBy(xpath ="//*[@id='leftside-navigation']/ul/li[6]/ul/li[3]/a")
	WebElement TimesheetsLink;
	
	@FindBy(xpath ="//*[@id=\"leftside-navigation\"]/ul/li[7]/a/span[1]")
	WebElement AccountingTab;
	
	@FindBy(xpath ="//*[@id='leftside-navigation']/ul/li[7]/ul/li[1]/a")
	WebElement PaymentSchedulesLink;

	@FindBy(xpath="//*[@id='leftside-navigation']/ul/li[7]/ul/li[2]/a")
	WebElement InvoiceLink;
	
	@FindBy(xpath="//*[@id='leftside-navigation']/ul/li[8]/a/span")
	WebElement MessagingLink;
	
//	@FindBy(xpath = "//a[contains(text(),'Deals')]")
//	WebElement dealsLink;
//
//	@FindBy(xpath = "//a[contains(text(),'Tasks')]")
//	WebElement tasksLink;

	// Initializing the Page Objects:
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyHomePageTitle(){
		return HomePageTitle.getText();
		//return driver.getTitle();
	}
		
	public boolean verifyCorrectUserName(){
		return userNameLabel.isDisplayed();
	}
	
	public void clickOnAdminTab()
	{
		AdminTab.click();
	}
	
	public BusinessNaturePage clickOnNatureofBusinessLink(){
		NatureofBusinessLink.click();
		return new BusinessNaturePage();
	}

	

	public LocationsPage clickOnLocationsLink() {
		LocationsLink.click();
		return new LocationsPage();
	}
	public MFGPage clickOnMFGLink() {
		
		MFGLink.click();
		return new MFGPage();
	}
	public ItemDefinitionPage clickOnItemDefinitionLink() {
	
		ItemDefinitionLink.click();
		return new ItemDefinitionPage ();
	}
	public ItemCategoriesPage clickOnItemCategoriesLink() {
		
		ItemCategoriesLink.click();
		return new ItemCategoriesPage ();
	}
	public SuppliersPage clickOnSuppliersLink() {
		SuppliersLink.click();
		return new SuppliersPage();
	}
	public PermissionsPage clickonPermissionsLink() {
		PermissionsLink.click();
		return new PermissionsPage();
	}
	public LabelsPage clickOnLabelsLink() {
		LabelsLink.click();
		return new LabelsPage();
	}
	public void clickOnInventoryTab()
	{
		InventoryTab.click();
	}
	public Productspage clickOnProductsLink() {
		ProductsLink.click();
		return new Productspage();
	}
	public AssetsPage clickOnAssetsLink() {
		AssetsLink.click();
		return new AssetsPage();
	}
	public MaterialPage clickOnMaterialLink() {
		
		MaterialLink.click();
		return new MaterialPage();
		
	}
public MaintenancePage clickOnMaintenanceLink() {
		
	MaintenanceLink.click();
		return new MaintenancePage();
		
	}
	public PurchaseOrdersPage clickOnLink(){
		PurchaseOrdersLink.click();
		return new PurchaseOrdersPage();
	}
	public RecievingSlipsPage clickOnRecievingSlipsLink(){
		 RecievingSlipLink.click();
		return new  RecievingSlipsPage();
		}
	public AuditPage clickonAuditLink() {
		AuditLink.click();
		return new AuditPage();
	}
	public void clickOnWorkflowTab()
	{
		WorkflowTab.click();
	}
	public ProjectEstimatorPage clickOnProjectEstimatorLink() {
		ProjectEstimatorLink.click();
		return new ProjectEstimatorPage();
	}
	public WorkOrdersPage clickOnWorkOrdersLink() {
		WorkOrdersLink.click();
		return new WorkOrdersPage();
	}
	public SchedulingPage clickOnSchedulingLink() {
		SchedulingLink.click();
		return new SchedulingPage();
	}
	public CRMPage clickOnCRMLink() {
	CRMLink.click();
	return new CRMPage();
	}
	public void clickOnHRTab()
	{
		HRTab.click();
	}
	public EmployeesPage clickOnEmployeesLink() {
		EmployeesLink.click();
		return new EmployeesPage();
	}
	public SubContractorPage clickOnSubContractorLink() {
		SubContractorLink.click();
		return new SubContractorPage();
		
	}
	public TimesheetsPage clickOnTimesheetsLink() {
		TimesheetsLink.click();
		return new TimesheetsPage();
		
	}
	public void clickOnAccountingTab()
	{
		AccountingTab.click();
		//
	}
	public PaymentSchedulesPage clickOnPaymentSchedulesLink() {
		PaymentSchedulesLink.click();
		return new PaymentSchedulesPage();
		
	}
	public InvoicePage clickOnInvoiceLink() {
		InvoiceLink.click();
		return new InvoicePage();
		
	}
	public MessagingPage clickOnMessagingLink() {
		MessagingLink.click();
		return new MessagingPage();
	
	
	
//	public DealsPage clickOnDealsLink(){
//		dealsLink.click();
//		return new DealsPage();
//	}
//	
//	public TasksPage clickOnTasksLink(){
//		tasksLink.click();
//		return new TasksPage();
//	}
//	
//	public void clickOnNewContactLink(){
//		Actions action = new Actions(driver);
//		action.moveToElement(contactsLink).build().perform();
//		newContactLink.click();
//		
//	}
}
}
	
	
	
	
	
	


