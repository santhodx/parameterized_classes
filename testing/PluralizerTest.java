package testing;

import measurement.Pluralizer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PluralizerTest
{
	@Test
	void singularZeroFormTest()
	{
		assertEquals("feet", Pluralizer.form(0, "foot", "feet"));
	}

	@Test
	void singularOneFormTest()
	{
		assertEquals("foot", Pluralizer.form(1, "foot", "feet"));
	}

	@Test
	void pluralFormTest()
	{
		assertEquals("feet", Pluralizer.form(546, "foot", "feet"));
	}

	@Test
	void singularOneRegularTest()
	{
		assertEquals("pound", Pluralizer.regular(1, "pound"));
	}

	@Test
	void pluralRegularTest()
	{
		assertEquals("pounds", Pluralizer.regular(465465, "pound"));
	}
}
