package measurement;

public abstract class AbstractAmount<T> implements Amount<AbstractAmount<T>>
{
	public void changeBy(Amount<AbstractAmount<T>> other)
	{
		setValue(getValue() + other.getValue());
	}

	public int compareTo(AbstractAmount<T> other)
	{
		if (getValue() - other.getValue() == 0)
		{
			return 0;
		} else if (getValue() - other.getValue() < 0)
		{
			return -1;
		} else
		{
			return 1;
		}
	}

	protected abstract void setValue(int value);
}
