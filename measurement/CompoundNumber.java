package measurement;

public abstract class CompoundNumber<T> extends AbstractAmount<CompoundNumber<T>>
{
	private int valueSmalls;

	public CompoundNumber()
	{
		valueSmalls = 0;
	}

	public CompoundNumber(int larges, int smalls)
	{
		valueSmalls = larges * getSmallsPerLarge() + smalls;
	}

	public void changeBy(int larges, int smalls)
	{
		valueSmalls = getValue() + larges * getSmallsPerLarge() + smalls;
	}

	protected abstract String getLargesText();

	protected abstract String getSmallsText();

	public abstract int getSmallsPerLarge();

	public String getUnit()
	{
		return getSmallsText();
	}

	public int getValue()
	{
		return valueSmalls;
	}

	public void multiplyBy(double m)
	{
		valueSmalls *= m;
	}

	public void setValue(int value)
	{
		valueSmalls = value;
	}

	public String toString()
	{
		return valueSmalls / getSmallsPerLarge() + " "
				+ Pluralizer.regular(valueSmalls / getSmallsPerLarge(), getLargesText()) + ", "
				+ valueSmalls % getSmallsPerLarge() + " "
				+ Pluralizer.regular(valueSmalls % getSmallsPerLarge(), getSmallsText());
	}

	@Override
	public int compareTo(AbstractAmount<CompoundNumber<T>> other)
	{
		return super.compareTo(other);
	}
}
