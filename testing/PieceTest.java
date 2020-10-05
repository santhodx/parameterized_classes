package testing;

import measurement.Amount;
import measurement.Piece;
import measurement.Weight;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PieceTest
{

	@Test
	void parametersConstructorTest()
	{
		Piece piece = new Piece(3, "slice");
		assertEquals(3, piece.getValue());
		assertEquals("slice", piece.getUnit());
	}

	@Test
	void getUnitTest()
	{
		Piece piece = new Piece(3, "slice");
		assertEquals("slice", piece.getUnit());
	}

	@Test
	void getValueTest()
	{
		Piece piece = new Piece(3, "slice");
		assertEquals(3, piece.getValue());
	}

	@Test
	void setValueTest()
	{
		Piece piece = new Piece(3, "slice");
		piece.setValue(10);
		assertEquals(10, piece.getValue());
	}

	@Test
	void toStringTest()
	{
		Piece piece = new Piece(3, "slice");
		assertEquals("3 slices", piece.toString());
	}

	@Test
	void compareToTest()
	{
		Piece piece = new Piece(10, "slice");
		Piece pieceOne = new Piece(11, "slice");
		Piece pieceTwo = new Piece(10, "slice");
		assertEquals(-1, piece.compareTo(pieceOne));
		assertEquals(1, pieceOne.compareTo(piece));
		assertEquals(0, piece.compareTo(pieceTwo));
	}
}
