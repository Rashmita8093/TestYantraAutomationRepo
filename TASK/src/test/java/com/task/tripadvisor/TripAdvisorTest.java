package com.task.tripadvisor;
/**
 * 
 * @author Rashmita
 *
 */

import org.testng.annotations.Test;

import com.task.genericLibrary.BaseClass;
import com.task.objectrepository.assignment2.TripAdvisorPage;

public class TripAdvisorTest extends BaseClass{
	@Test
	public void searchAndreviewTest() throws Throwable {
	/* Navigating to TripAdvisorPage */
	TripAdvisorPage tripAdvisor = new TripAdvisorPage(BaseClass.driver);
	
	/* Search for Club Mahindra inTripAdvisor */
	tripAdvisor.searchInTripAdvisor("Sheet1", 1, 1);
	/* Search for  reviewTitleTripAdvisor inTripAdvisor */
	tripAdvisor.reviewTitleTripAdvisor("Sheet1", 1, 2);
	/* Search for  reviewTextTripAdvisor inTripAdvisor */
	
	tripAdvisor.reviewTextTripAdvisor("Sheet1", 1, 3);
}
}
