
public class Flipcoin {

	public static void main(String[] args) {

		int n = 10;
		int headCount = 0;
		int tailCount = 0;

		for (int i = 1; i <= n; i++) {
			double coin = Math.random();
			if (coin < 0.5) {
				headCount++;
			} else {
				tailCount++;
			}

		}
		double headpercentage = (double) (headCount * 100) / 10;
		double tailpercentage = (double) (tailCount * 100) / 10;
		System.out.println("Tail Count:" + tailCount);
		System.out.println("Head Count:" + headCount);
		System.out.println("Tail Percentage:" + headpercentage +"%");
		System.out.println("Head Percentage:" + tailpercentage +"%" );
	}

}
