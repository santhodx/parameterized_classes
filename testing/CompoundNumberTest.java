package testing;

import measurement.Weight;
import measurement.CompoundNumber;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CompoundNumberTest
{
	@Test
	void defaultConstructorTest()
	{
		CompoundNumber<Weight> number = new Weight();
		assertEquals(0, number.getValue());
	}

	@Test
	void parametersConstructorTest()
	{
		CompoundNumber<Weight> number = new Weight(1, 5);
		assertEquals(21, number.getValue());
	}

	@Test
	void changeByTest()
	{
		CompoundNumber<Weight> number = new Weight(1, 5);
		int res = number.getValue() + 5 * number.getSmallsPerLarge() + 9;
		number.changeBy(5, 9);
		assertEquals(res, number.getValue());
	}

	@Test
	void getUnitTest()
	{
		CompoundNumber<Weight> number = new Weight(1, 5);
		assertEquals("ounce", number.getUnit());
	}

	@Test
	void getValueTest()
	{
		CompoundNumber<Weight> number = new Weight(1, 5);
		assertEquals(21, number.getValue());
	}

	@Test
	void multiplyByTest()
	{
		CompoundNumber<Weight> number = new Weight(1, 0);
		number.multiplyBy(2.45);
		assertEquals(39, number.getValue());
	}

	@Test
	void setValueTest()
	{
		CompoundNumber<Weight> number = new Weight(1, 0);
		number.setValue(20);
		assertEquals(20, number.getValue());
	}

	@Test
	void toStringTest()
	{
		CompoundNumber<Weight> number = new Weight(1, 6);
		assertEquals("1 pound, 6 ounces", number.toString());
	}

	@Test
	void compareToTest()
	{
		CompoundNumber<Weight> weight = new Weight(10, 0);
		CompoundNumber<Weight> weightOne = new Weight(0, 160);
		CompoundNumber<Weight> weightTwo = new Weight(5, 3);
		assertEquals(1, weight.compareTo(weightTwo));
		assertEquals(0, weight.compareTo(weightOne));
		assertEquals(-1, weightTwo.compareTo(weightOne));
	}
}
