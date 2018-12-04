package character.testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import character.size.Medium;

class TestSizeMedium {

	private Medium med = new Medium();
	private Medium med2 = new Medium("Im 5'11");
	
			/**
			 * This test will insure that the medium getSizeRating returns 0
			 */
	@Test
	void testMediumSizeRating() {
		assertEquals(this.med.getSizeRating(), 0);
	}

	/**
	 * This test will insure that the size catagory is medium
	 */
	@Test
	void testMediumCatagory() {
		assertEquals(this.med.getSizeCatagory(), "Medium");
	}

	/**
	 * This test will check the default height descriptor
	 */
	@Test
	void testMediumHeightDescription() {
		assertEquals(this.med.getHeightDescription(), "Between 4 and 7 feet tall");
	}

	/**
	 * This test will insure that the med2ium getSizeRating returns 0
	 */
	@Test
	void testMediumSizeRatingWithTheSecondConstructor() {
		assertEquals(this.med2.getSizeRating(), 0);
	}

	/**
	 * This test will insure that the size catagory is med2ium
	 */
	@Test
	void testMediumCatagoryWithTheSecondConstructor() {
		assertEquals(this.med2.getSizeCatagory(), "Medium");
	}

	/**
	 * This test will check the default height descriptor
	 */
	@Test
	void testMediumHeightDescriptionWithTheSecondConstructor() {
		assertEquals(this.med2.getHeightDescription(), "Im 5'11");
	}

}
