package testing;

import measurement.AbstractAmount;
import measurement.Piece;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AbstractAmountTest
{
	@Test
	void changeByTest()
	{
		AbstractAmount<Piece> one = new Piece(10, "slice");
		AbstractAmount<Piece> two = new Piece(1, "slice");
		one.changeBy(two);
		assertEquals(11, one.getValue());
	}

	@Test
	void compareToTest()
	{
		AbstractAmount<Piece> one = new Piece(10, "slice");
		AbstractAmount<Piece> two = new Piece(1, "slice");
		AbstractAmount<Piece> more = new Piece(20, "slice");
		AbstractAmount<Piece> same = new Piece(10, "slice");
		assertEquals(1, one.compareTo(two));
		assertEquals(-1, one.compareTo(more));
		assertEquals(0, one.compareTo(same));
	}
}
