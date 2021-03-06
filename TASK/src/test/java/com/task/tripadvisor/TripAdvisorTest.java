package com.task.tripadvisor;
/**
 * 
 * @author Rashmita
 *
 */

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.task.genericLibrary.BaseClass;
import com.task.objectrepository.assignment2.TripAdvisorPage;

public class TripAdvisorTest extends BaseClass{
	@Test
	public void searchAndreviewTest() throws Throwable {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	/* Navigating to TripAdvisorPage */
	TripAdvisorPage tripAdvisor = new TripAdvisorPage(BaseClass.driver);
	
	/* Search for Club Mahindra inTripAdvisor */
	tripAdvisor.searchInTripAdvisor(driver,"Sheet1", 1, 1);
	/* Search for  reviewTitleTripAdvisor inTripAdvisor */
	tripAdvisor.reviewTitleTripAdvisor(driver,"Sheet1", 1, 2);
	/* Search for  reviewTextTripAdvisor inTripAdvisor */
	
	tripAdvisor.reviewTextTripAdvisor("Sheet1", 1, 3);
}
}
