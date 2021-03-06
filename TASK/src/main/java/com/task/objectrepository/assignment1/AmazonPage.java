package com.task.objectrepository.assignment1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.task.genericLibrary.CommonLibrary;
import com.task.genericLibrary.FileLib;

/**
 * 
 * @author Rashmita
 *
 */



public class AmazonPage {

	private WebDriver driver;
	private CommonLibrary common;
	
	FileLib flib = new FileLib();
	
	public AmazonPage(WebDriver driver)  {
		// TODO Auto-generated constructor stub
		driver.get(flib.getPropertyKeyValue("urlAmazon"));
		PageFactory.initElements(driver, this);
		this.driver = driver;
		common = new CommonLibrary(driver);
	}
	
	@FindBy(id = "twotabsearchtextbox") 
	private WebElement searchBox;
	
	@FindBy(xpath = "//span[text()='Apple iPhone XR (64GB) - Yellow']/../../../../../../..//span[@class='a-price-whole']")
	private WebElement productPrice;
	
	@FindBy(xpath = "//input[@value='Go']")
	private WebElement searchBtn;
	
	
	
	public void searchProduct(String sheetName, int rowNum, int celNum) throws Throwable {
		common.waitForPageToLoad();
		searchBox.sendKeys(flib.getExcelData(sheetName, rowNum, celNum));
		searchBtn.click();
	}
	
	public int priceOfProduct() throws Throwable {
		common.waitForPageToLoad();
		common.waitForElemnetToAppear(productPrice);
		String data = productPrice.getText();
		int productPrice = common.removeSpecialChars(data);
		return productPrice;
	}
}

