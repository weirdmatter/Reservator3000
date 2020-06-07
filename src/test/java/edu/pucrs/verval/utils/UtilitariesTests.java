package edu.pucrs.verval.utils;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import edu.pucrs.verval.entities.Resource;

@SpringBootTest
public class UtilitariesTests {
	
	@Test
	public void checkIfHasAvailableResourceWithNullObjectShouldThrowNullPointerException() {
		
		try {
			Resource mock_resource = null;
			Boolean result = Utilitaries.hasAvailableResource(mock_resource);
			assertEquals(result, false);
		} catch (NullPointerException exception) {
			assertEquals(exception.getClass(), NullPointerException.class);
		}
		
	}
	
	@Test
	public void checkIfHasAvailableResourceWithZeroAmountShouldReturnFalse() {
		Resource mock_resource = new Resource(1, "iPhone X 64GB", "ABC-123", 0, 300.0, "MOBILE", 0.0, 0, 0.0);
		Boolean result = Utilitaries.hasAvailableResource(mock_resource);
		assertEquals(result, false);
	}
	
	@Test
	public void checkIfHasAvailableResourceWithNegativeAmountShouldReturnFalse() {
		Resource mock_resource = new Resource(1, "iPhone X 64GB", "ABC-123", -1, 300.0, "MOBILE", 0.0, 0, 0.0);
		Boolean result = Utilitaries.hasAvailableResource(mock_resource);
		assertEquals(result, false);
	}
	
	@Test
	public void calculatingCostForAResourceReservationShouldReturnCorrectValue() {
		
	}

}
