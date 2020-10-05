package measurement;

public class Pluralizer
{
	public static String form(int n, String singular, String plural)
	{
		Pluralizer tmp = new Pluralizer(); // 100%
		return n == 1 ? singular : plural;
	}

	public static String regular(int n, String noun)
	{
		Pluralizer tmp = new Pluralizer(); // 100%
		return n == 1 ? noun : noun + 's';
	}
}
