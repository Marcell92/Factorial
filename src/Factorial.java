
public class Factorial {

	public static String reversefactorial(int n) {
		int original = n;
		int factor = 2;

		while (original % factor == 0) {

			original /= factor;
			factor++;

		}

		int resultfactor = factor - 1;

		if ((factor % original == 0))
			return (n + "=" + resultfactor + "!");

		else
			return (n + "=" + "NONE");
	}
}
