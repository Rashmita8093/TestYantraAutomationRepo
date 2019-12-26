package com.task.compareprice;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.task.genericLibrary.BaseClass;
import com.task.objectrepository.assignment1.AmazonPage;
import com.task.objectrepository.assignment1.FlipkartPage;
/**
 * 
 * @author Rashmita
 *
 */
public class ComparePriceTest extends BaseClass {
	@Test
	public void comparePriceTest() throws Throwable {
		
		/* Navigating to Amazon */
		AmazonPage amazon = new AmazonPage(BaseClass.driver);
		
		/* Search for product */
		amazon.searchProduct("Sheet1", 1, 0);
		
		/* get the price of a product */
		int amazonPrice = amazon.priceOfProduct();
		
		/* navigating to flipkart */
		FlipkartPage flipkart = new FlipkartPage(BaseClass.driver);
		
		/* Search for product */
		flipkart.searchProduct("Sheet1", 1, 0);
		
		/* get the price of a product */
		int flipkartPrice = flipkart.priceOfProduct();
		
		/* Compare the price from amazon and flipkart and display it in console */
		if(amazonPrice > flipkartPrice) {
			Reporter.log("Flipkart has Lesser Price than Amazon", true);
			Reporter.log("price of flipkart"+flipkartPrice ,true);
		}else if (amazonPrice < flipkartPrice) {
			Reporter.log("Amazon has Lesser Price than flipkart", true);
			Reporter.log("price of amazon"+amazonPrice,true );
		}else {
			Reporter.log("Amazon and Flipkart Both have same price", true);
			Reporter.log("price of amazon"+amazonPrice+"price of flipkart"+flipkartPrice ,true);
		}
		
		
}
	}
