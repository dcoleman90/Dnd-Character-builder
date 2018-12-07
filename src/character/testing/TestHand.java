package character.testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import character.build.Hand;
import equipment.weapon.Equipment;
import equipment.weapon.WeaponGreatAxe;

class TestHand {
	Equipment ax = new WeaponGreatAxe();
	
	/**
	 * The following test will insure that hand performs as expected
	 */
	@Test
	void testHandIsNullAndNotFullWhenBuiltWithDefaultConstructor() {
		Hand left = new Hand();
		assertEquals(left.getItem(), null);
		assertEquals(left.isHandFull(), false);
	}
	
	@Test
	void testHandItemAndFull() {
		Hand right = new Hand(this.ax);
		assertEquals(right.getItem(), this.ax);
		assertEquals(right.isHandFull(), true);
	}
	
	@Test
	void testHandItemAndFullRemoveItem() {
		Hand right = new Hand(this.ax);
		right.removeItem();
		assertEquals(right.getItem(), null);
		assertEquals(right.isHandFull(), false);
	}
	
	@Test
	void testHandIsNullAndNotFullWhenBuiltWithDefaultConstructorRemovedCalled() {
		Hand left = new Hand();
		left.removeItem();
		assertEquals(left.getItem(), null);
		assertEquals(left.isHandFull(), false);
	}
	
	@Test
	void testHandIsNullAndNotFullWhenBuiltWithDefaultConstructorAddCalled() {
		Hand left = new Hand();
		left.addItem(ax);
		assertEquals(left.getItem(), this.ax);
		assertEquals(left.isHandFull(), true);
	}

	@Test
	void testHandIsNullAndNotFullWhenBuiltWithDefaultConstructorAddAndRemoveCalled() {
		Hand left = new Hand();
		left.addItem(ax);
		assertEquals(left.getItem(), this.ax);
		assertEquals(left.isHandFull(), true);
		left.removeItem();
		assertEquals(left.getItem(), null);
		assertEquals(left.isHandFull(), false);
	}


}
