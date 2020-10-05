package testing;

import measurement.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AmountTest
{
	@Test
	void changeByWeightTest()
	{
		Amount<AbstractAmount<CompoundNumber<Weight>>> weight = new Weight();
		weight.changeBy(new Weight(10, 0));
		assertEquals(160, weight.getValue());
	}

	@Test
	void changeByPieceTest()
	{
		Amount<AbstractAmount<Piece>> piece = new Piece(6, "slice");
		piece.changeBy(new Piece(1, "slice"));
		assertEquals(7, piece.getValue());
	}

	@Test
	void getUnitWeightTest()
	{
		Amount<AbstractAmount<CompoundNumber<Weight>>> weight = new Weight();
		assertEquals("ounce", weight.getUnit());
	}

	@Test
	void getUnitPieceTest()
	{
		Amount<AbstractAmount<Piece>> piece = new Piece(6, "slice");
		assertEquals("slice", piece.getUnit());
	}

	@Test
	void getValueWeightTest()
	{
		Amount<AbstractAmount<CompoundNumber<Weight>>> weight = new Weight();
		assertEquals(0, weight.getValue());
	}

	@Test
	void getValuePieceTest()
	{
		Amount<AbstractAmount<Piece>> piece = new Piece(6, "slice");
		assertEquals(6, piece.getValue());
	}

	@Test
	void compareToTest()
	{
		Amount<AbstractAmount<Piece>> piece = new Piece(6, "slice");
		Piece pieceOne = new Piece(4, "slice");
		AbstractAmount<Piece> pieceTwo = new Piece(6, "slice");
		assertEquals(1, piece.compareTo(pieceOne));
		assertEquals(0, piece.compareTo(pieceTwo));
		assertEquals(-1, pieceOne.compareTo(pieceTwo));
	}
}
