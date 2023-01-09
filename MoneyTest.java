package TDD;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MoneyTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testMultiplication() {
		Money five =Money.dollar(5);
		assertEquals(Money.dollar(10),five.times(2));
		assertEquals(Money.dollar(15),five.times(3));
		//fail("Not yet implemented");
	}
	@Test
	public void testEquality() {
		assertTrue(Money.dollar(5).equals(Money.dollar(5)));
		assertFalse(Money.dollar(5).equals(Money.dollar(6)));
		assertFalse(Money.franc(5).equals(Money.dollar(5)));
	}
	@Test 
	public void testgCurrency() {
		assertEquals("USD",Money.dollar(1).currency());
		assertEquals("CHF",Money.franc(1).currency());
	}
	@Test 
	public void testSimpleAddition() {
		Money five = Money.dollar(5);
		Bank bank = new Bank();
		Expression sum = five.plus(five);
		//Money sum = Money.dollar(5).plus(Money.dollar(5));
		Money reduced = bank.reduce(sum,"USD");
		assertEquals(Money.dollar(10),reduced);
	}
	@Test
	public void testReudceMoneyDIfferentCUrrency() {
		Bank bank= new Bank();
		bank.addRate("CHF","USD",2);
]		Money result = bank.reduce(Money.franc(2), "USD");
		assertEquals(Money.dollar(1),result);
	}
}
