package measurement;

public interface Amount<T extends Amount<T>> extends Comparable<T>
{
	
	public void changeBy(Amount<T> other);

	public String getUnit();

	public int getValue();

	@Override
	int compareTo(T o);
}
