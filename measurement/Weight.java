package measurement;

public class Weight extends CompoundNumber<Weight>
{
	public Weight()
	{
		super();
	}

	public Weight(int pounds, int ounces)
	{
		super(pounds, ounces);
	}

	public String getLargesText()
	{
		return "pound";
	}

	public String getSmallsText()
	{
		return "ounce";
	}

	public int getSmallsPerLarge()
	{
		return 16;
	}
}
