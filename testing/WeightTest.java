package testing;

import measurement.Weight;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WeightTest
{

	@Test
	void defaultConstructorTest()
	{
		Weight weight = new Weight();
		assertEquals(0, weight.getValue());
	}

	@Test
	void parametersConstructorTest()
	{
		Weight weight = new Weight(3, 10);
		assertEquals(58, weight.getValue());
	}

	@Test
	void getLargesTextTest()
	{
		Weight weight = new Weight();
		assertEquals("pound", weight.getLargesText());
	}

	@Test
	void getSmallsTextTest()
	{
		Weight weight = new Weight();
		assertEquals("ounce", weight.getSmallsText());
	}

	@Test
	void getSmallsPerLargeTest()
	{
		Weight weight = new Weight();
		assertEquals(16, weight.getSmallsPerLarge());
	}

	@Test
	void compareToTest()
	{
		Weight weight = new Weight(5, 3);
		Weight weightOne = new Weight(4, 2);
		Weight weightTwo = new Weight(0, 83);
		assertEquals(1, weight.compareTo(weightOne));
		assertEquals(-1, weightOne.compareTo(weight));
		assertEquals(0, weight.compareTo(weightTwo));
	}

}
